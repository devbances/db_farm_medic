package com.example.dbfarmmedic.Medics;

import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.dbfarmmedic.DataMedic.MedicsDbHelper;

public class MedicsFragment extends Fragment {
    public static final int REQUEST_UPDATE_DELETE_MEDICS = 2;
    private static final String ARG_TIPO_MEDICS_ID = "medicsId";
    private MedicsDbHelper mMedicsDbHelper;

    private ListView mMedicsList;
}
