package com.example.dbfarmmedic.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.dbfarmmedic.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegistrarActivity extends AppCompatActivity {
    EditText usuario;
    EditText password;
    EditText email;
    EditText celular;
    EditText nombre;
    EditText apellidos;
    ProgressBar cargando;
    Button registar;
    Button cancelar;
    Usuario usuario_;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        usuario   = (EditText) findViewById(R.id.usuario);
        password  = (EditText) findViewById(R.id.password);
        email   = (EditText) findViewById(R.id.email);
        celular  = (EditText) findViewById(R.id.celular);
        nombre   = (EditText) findViewById(R.id.nombre);
        apellidos  = (EditText) findViewById(R.id.apellidos);
        cargando  = (ProgressBar) findViewById(R.id.cargando);
        registar = (Button) findViewById(R.id.registar);
        cancelar = (Button) findViewById(R.id.cancelar);
        registar.setOnTouchListener(new View.OnTouchListener() {

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
                        registar.setVisibility(View.GONE);
                        cargando.setVisibility(View.VISIBLE);

                        if( usuario.getText().toString().trim().length()>0 && password.getText().toString().trim().length()>0 ) {
                            Retrofit retrofit = new Retrofit.Builder()
                                    .baseUrl("http://192.168.16.26:8080")
                                    .addConverterFactory(GsonConverterFactory.create())
                                    .build();
                            Usuario usuarioModel = new Usuario();
                            usuarioModel.setUsuario(usuario.getText().toString().trim());
                            usuarioModel.setPassword(password.getText().toString().trim());
                            usuarioModel.setEmail(email.getText().toString().trim());
                            usuarioModel.setCelular(celular.getText().toString().trim());
                            usuarioModel.setNombre(nombre.getText().toString().trim());
                            usuarioModel.setApellidos(apellidos.getText().toString().trim());
                            IRequestUsuario request = retrofit.create(IRequestUsuario.class);
                            Call<Usuario> call = request.addUsuario(usuarioModel );

                            call.enqueue(new Callback<Usuario>() {
                                @Override
                                public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                                    usuario_ = response.body();
                                    // mostrarMensaje("call");
                                    Intent intent = new Intent(getApplicationContext(), LogeoActivity.class);
                                    startActivity(intent);
                                    finish();
                                    mostrarMensaje("Registro Correcto");

                                    setResult(RESULT_OK);
                                    // Log.i("RETROFIT", "Termino TRU");
                                    usuario.setText("");
                                    password.setText("");
                                }

                                @Override
                                public void onFailure(Call<Usuario> call, Throwable t) {
                                    registar.setVisibility(View.VISIBLE);
                                    cargando.setVisibility(View.GONE);
                                    Log.i("RETROFIT", t.getMessage().toString());
                                    mostrarMensaje("Registro falló");
                                }
                            });
                        }else{
                            registar.setVisibility(View.VISIBLE);
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
        cancelar.setOnTouchListener(new View.OnTouchListener() {

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        Button view = (Button) v;
                        v.invalidate();
                        break;
                    }
                    case MotionEvent.ACTION_UP: {
                        Intent intent = new Intent(getApplicationContext(), LogeoActivity.class);

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
    private void mostrarMensaje(String mensaje)
    {
        Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show();
    }
}
