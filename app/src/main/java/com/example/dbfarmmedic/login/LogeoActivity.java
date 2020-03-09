package com.example.dbfarmmedic.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.dbfarmmedic.MedicsClasification.MedicsClasification;
import com.example.dbfarmmedic.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class LogeoActivity extends AppCompatActivity {
    EditText usuario;
    EditText password;
    ProgressBar cargando;
    Button login;
    Button crear_usuario;
    Usuario usuario_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logeo);
        validarPreferencias();
        usuario   = (EditText) findViewById(R.id.usuario);
        password  = (EditText) findViewById(R.id.password);
        cargando  = (ProgressBar) findViewById(R.id.cargando);
        login = (Button) findViewById(R.id.login);
        crear_usuario = (Button) findViewById(R.id.crear_usuario);

        login.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        Button view = (Button) v;
                        // int mycolor = getResources().getColor(R.color.colorTest);
                        //int mycolor_text = getResources().getColor(R.color.colorTest);
                        // view.getBackground().setColorFilter(mycolor, PorterDuff.Mode.SRC_IN);
                        //view.setTextColor(mycolor_text);
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                        login.setVisibility(View.GONE);
                        cargando.setVisibility(View.VISIBLE);

                        if( usuario.getText().toString().trim().length()>0 && password.getText().toString().trim().length()>0 ) {
                            Retrofit retrofit = new Retrofit.Builder()
                                    .baseUrl("http://192.168.16.26:8080")
                                    .addConverterFactory(GsonConverterFactory.create())
                                    .build();

                            IRequestUsuario request = retrofit.create(IRequestUsuario.class);
                            Call<Usuario> call = request.getJSONUsuario(usuario.getText().toString(),password.getText().toString());

                            call.enqueue(new Callback<Usuario>() {
                                @Override
                                public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                                    usuario_ = response.body();
                                    // mostrarMensaje("call");
                                    if (usuario_ != null) {
                                        guardarPreferencias(usuario.getText().toString(), password.getText().toString(),usuario_.getNombre(),usuario_.getApellidos());
                                        Intent intent = new Intent(getApplicationContext(), MedicsClasification.class);
                                        startActivity(intent);
                                        finish();
                                        mostrarMensaje("INGRESA");

                                    } else {
                                        mostrarMensaje("No tiene acceso a nuestra APP 1");
                                        login.setVisibility(View.VISIBLE);
                                        cargando.setVisibility(View.GONE);
                                        usuario.setText("");
                                        password.setText("");
                                    }
                                    setResult(RESULT_OK);
                                    // Log.i("RETROFIT", "Termino TRU");
                                    usuario.setText("");
                                    password.setText("");
                                }

                                @Override
                                public void onFailure(Call<Usuario> call, Throwable t) {
                                    login.setVisibility(View.VISIBLE);
                                    cargando.setVisibility(View.GONE);
                                    Log.i("RETROFIT", t.getMessage().toString());
                                    mostrarMensaje("No tienen acceso a nuestra APP 2");
                                }
                            });
                        }else{
                            login.setVisibility(View.VISIBLE);
                            cargando.setVisibility(View.GONE);
                            mostrarMensaje("Debe completar todos los datos.");
                        }
                    case MotionEvent.ACTION_CANCEL: {
                        Button view = (Button) v;
                        view.getBackground().clearColorFilter();
                        view.invalidate();
                        break;
                    }
                }
                return true;
            }
        });
        crear_usuario.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        Button view = (Button) v;
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {
                        Intent intent = new Intent(getApplicationContext(), RegistrarActivity.class);

                        startActivity(intent);

                        finish();
                        break;
                    }
                    case MotionEvent.ACTION_CANCEL: {
                        Button view = (Button) v;
                        view.getBackground().clearColorFilter();
                        view.invalidate();
                        break;
                    }
                }
                return true;
            }
        });
    }
    private void guardarPreferencias(String email, String dni, String nombre, String apellido) {

        SharedPreferences prefs = getSharedPreferences("D12346AD546AS5D4ASDA65ASD+A6S5D+A6SD5+A6A6+SD5A+65D", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = prefs.edit();

        editor.putString("user", email);
        editor.putString("pass", dni);
        editor.putString("nombre", nombre);
        editor.putString("apellido", apellido);

        editor.commit();
    }
    private void mostrarMensaje(String mensaje)
    {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
    private void validarPreferencias()
    {
        SharedPreferences prefs = getSharedPreferences("D12346AD546AS5D4ASDA65ASD+A6S5D+A6SD5+A6A6+SD5A+65D", Context.MODE_PRIVATE);

        String email = prefs.getString("user", "");

        if (email != "")
        {
            ingresar();
        }
    }

    private void ingresar()
    {
        Intent intent = new Intent(getApplicationContext(), MedicsClasification.class);

        startActivity(intent);

        finish();
    }
}
