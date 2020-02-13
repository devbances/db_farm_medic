package com.example.dbfarmmedic.MedicsClasification;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.example.dbfarmmedic.Medics.MedicsActivity;
import com.example.dbfarmmedic.R;

public class MedicsClasificationFragment extends Fragment implements AdapterView.OnItemClickListener {
    public static final String EXTRA_TIPO_MEDICS_ID = "extra_tipo_medics_id";
    public static final int REQUEST_UPDATE_DELETE_TIPO_MEDICS = 2;

    private GridView gridView;
    private MedicsAdapter adaptador;

    public MedicsClasificationFragment(){

    }

    public static MedicsClasificationFragment newInstance(){
        MedicsClasificationFragment fragment = new MedicsClasificationFragment();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_medics_clasification, container, false);
        gridView =  root.findViewById(R.id.grid);
        adaptador = new MedicsAdapter(getActivity());
        gridView.setAdapter(adaptador);
        gridView.setOnItemClickListener(this);
        return root;
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Medics item = (Medics) parent.getItemAtPosition(position);
        showDetailScreen(item.getIdTipo());
    }
    private void showDetailScreen(String idTipo) {
        Intent intent = new Intent(getActivity(), MedicsActivity.class);
        intent.putExtra(EXTRA_TIPO_MEDICS_ID, idTipo);
        startActivityForResult(intent, REQUEST_UPDATE_DELETE_TIPO_MEDICS);
    }

}
