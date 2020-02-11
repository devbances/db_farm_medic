package com.example.dbfarmmedic.MedicsClasification;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dbfarmmedic.Medics.MedicsActivity;
import com.example.dbfarmmedic.R;

public class MedicsClasification extends AppCompatActivity
    implements AdapterView.OnItemClickListener{
    private GridView gridView;
    private MedicsAdapter adaptador;

    public static final String EXTRA_TIPO_MEDICS_ID = "extra_tipo_medics_id";
    public static final int REQUEST_UPDATE_DELETE_TIPO_MEDICS = 2;

    //private GoogleApiClient client;

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
        //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    private void usarToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_medics, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
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

    /* Intent intent = new Intent(this, AlimentosActivity.class);
        intent.putExtra(AlimentosActivity.EXTRA_ALIMENTO_ID, item.getId());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            ActivityOptionsCompat activityOptions =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                            this,
                            new Pair<View, String>(view.findViewById(R.id.imagen_alimento),
                                    AlimentosActivity.VIEW_NAME_HEADER_IMAGE)
                    );

            ActivityCompat.startActivity(this, intent, activityOptions.toBundle());
        } else
            startActivity(intent);*/


}
