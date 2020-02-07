package com.example.dbfarmmedic.Medics;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.dbfarmmedic.DataMedic.MedicsDbHelper;
import com.example.dbfarmmedic.R;

public class MedicsFragment extends Fragment {
    public static final int REQUEST_UPDATE_DELETE_MEDICS = 2;
    private static final String ARG_TIPO_MEDICS_ID = "medicsId";
    private MedicsDbHelper mMedicsDbHelper;

    private ListView mMedicsList;
    private MedicsCursorAdapter mMedicsAdapter;
    private String mIdTipo;

    public MedicsFragment(){

    }

    public static MedicsFragment newInstance(String idTipo){
        MedicsFragment fragment = new MedicsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TIPO_MEDICS_ID, idTipo);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        if (getArguments() != null){
            mIdTipo = getArguments().getString(ARG_TIPO_MEDICS_ID);
        }
        setHasOptionsMenu(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.fragment_medics, container, false);


    }
}
