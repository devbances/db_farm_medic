package com.example.dbfarmmedic.MedicsDetail;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import com.example.dbfarmmedic.Medics.MedicsActivity;
import com.example.dbfarmmedic.R;

public class MedicsDetailActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medics_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String id = getIntent().getStringExtra(MedicsActivity.EXTRA_MEDICS_ID);

        MedicsDetailFragmentActivity fragment = (MedicsDetailFragmentActivity)
                getSupportFragmentManager().findFragmentById(R.id.lawyer_detail_cner);
        if (fragment == null) {
            fragment = MedicsDetailFragmentActivity.newInstance(id);
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.lawyer_detail_cner, fragment)
                    .commit();
        }


    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
