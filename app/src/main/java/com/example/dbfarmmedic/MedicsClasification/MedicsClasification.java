package com.example.dbfarmmedic.MedicsClasification;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dbfarmmedic.Medics.MedicsActivity;
import com.example.dbfarmmedic.R;

public class MedicsClasification extends AppCompatActivity
    implements AdapterView.OnItemClickListener{
    private GridView gridView;
    private MedicsAdapter adaptador;

    public static final String EXTRA_TIPO_MEDICS_ID = "extra_tipo_alimento_id";
    public static final int REQUEST_UPDATE_DELETE_TIPO_MEDICS = 2;

    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medics_clasification);

        usarToolbar();
        gridView = (GridView) findViewById(R.id.grid);
        adaptador = new MedicsAdapter(this);
        gridView.setAdapter(adaptador);
        gridView.setOnItemClickListener(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void usarToolbar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_alimentos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.delete:
                //metodoDelete()
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.upeu.edu.pe/fsalud"));
                startActivity(intent);
                return true;
            case  R.id.action_settings:
                Toast.makeText(MedicsClasification.this, "Todos los derechos reservados" + "Universidad Peruana Unión "+
                        "© 2016 Escuela Profesional de Nutricion Humana", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Medics item = (Medics) parent.getItemAtPosition(position);
        showDetailScreen(item.getIdTipo());
    }

    private void showDetailScreen(String idTipo) {
        Intent intent = new Intent(this, MedicsActivity.class);
        intent.putExtra(MedicsClasification.EXTRA_TIPO_MEDICS_ID, idTipo);
        startActivityForResult(intent, REQUEST_UPDATE_DELETE_TIPO_MEDICS);
    }


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Notification.Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("MedicsClasificacion Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Notification.Action.Builder(Notification.Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Notification.Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }


}
