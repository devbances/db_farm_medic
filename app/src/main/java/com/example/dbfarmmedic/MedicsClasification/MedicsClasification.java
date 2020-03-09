package com.example.dbfarmmedic.MedicsClasification;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.dbfarmmedic.R;
import com.example.dbfarmmedic.login.LogeoActivity;
import com.google.android.material.navigation.NavigationView;



public class MedicsClasification extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener{
    TextView nombre_user;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medics_clasification);


        Toolbar toolbar =  findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer =  findViewById(R.id.medics_clasification_activity);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView =  findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);


        MedicsClasificationFragment fragment = (MedicsClasificationFragment)
                getSupportFragmentManager().findFragmentById(R.id.content_medics_clasification);

        if (fragment == null) {
            fragment = MedicsClasificationFragment.newInstance();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.content_medics_clasification, fragment)
                    .commit();
        }

    }

    /*Métodos del Navigation*/

    @Override
    public void onBackPressed() {
        DrawerLayout drawer =  findViewById(R.id.medics_clasification_activity);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_medics, menu);
        return true;
    }
   /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        } else if (id == R.id.nav_out) {
            mostrarDialogo("Desea salir","");
        }

        DrawerLayout drawer =  findViewById(R.id.medics);
//        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void eliminarPreferencias() {

        SharedPreferences prefs = getSharedPreferences("D12346AD546AS5D4ASDA65ASD+A6S5D+A6SD5+A6A6+SD5A+65D", Context.MODE_PRIVATE);

        SharedPreferences.Editor editor = prefs.edit();

        editor.putString("user", "");
        editor.putString("pass", "");

        editor.commit();
    }
    private void mostrarDialogo(String titulo, String mensaje)
    {
        // Paso 1: Crear el dialogo

        AlertDialog.Builder builder = new AlertDialog.Builder(this
        );

        builder.setTitle(titulo)
                .setMessage(mensaje)
                .setIcon(
                        getResources().getDrawable(
                                android.R.drawable.ic_dialog_info))
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                        eliminarPreferencias();
                        Intent intent = new Intent(getApplicationContext(), LogeoActivity.class);
                        startActivity(intent);
                        finish();
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

        // Paso 2: Lanzar el dialogo

        AlertDialog alert = builder.create();

        alert.show();
    }
}

