package com.example.dbfarmmedic.Medics;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.dbfarmmedic.MedicsClasification.MedicsClasification;
import com.example.dbfarmmedic.R;


public class MedicsActivity extends AppCompatActivity {
    private DrawerLayout drawerLayout;

    public static final String EXTRA_MEDICS_ID = "extra_medics_id";
    private String mIdTipo;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_medics);
        mIdTipo = getIntent().getStringExtra(MedicsClasification.EXTRA_TIPO_MEDICS_ID);
        setToolbar();

        setTitle("1111111");

        MedicsFragment fragment = (MedicsFragment)
                getSupportFragmentManager().findFragmentById(R.id.medics_cner);

        if (fragment == null){
            fragment = MedicsFragment.newInstance(mIdTipo);
            getSupportFragmentManager()
            .beginTransaction()
                    .add(R.id.medics_cner, fragment)
            .commit();


        }

    }

    private void setToolbar(){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final ActionBar ab = getSupportActionBar();
    }

}
