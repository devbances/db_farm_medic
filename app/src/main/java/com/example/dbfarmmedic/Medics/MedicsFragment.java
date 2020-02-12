package com.example.dbfarmmedic.Medics;

import android.content.Intent;
import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.dbfarmmedic.DataMedic.MedicsContract;
import com.example.dbfarmmedic.DataMedic.MedicsDbHelper;
import com.example.dbfarmmedic.MedicsDetail.MedicsDetailActivity;
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View root = inflater.inflate(R.layout.fragment_medics, container, false);

        mMedicsList =  root.findViewById(R.id.lawyer_list);
        mMedicsAdapter = new MedicsCursorAdapter(getActivity(), null);

        mMedicsList.setAdapter(mMedicsAdapter);

        //revisar actualizacion, se cambio int i x int position y long l x long id

        mMedicsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Cursor currentItem = (Cursor) mMedicsAdapter.getItem(position);
                String currentMedicsId = currentItem.getString(
                        currentItem.getColumnIndex(MedicsContract.MedicsEntry.ID));
                showDetailScreen(currentMedicsId);
            }
        });

        getActivity().deleteDatabase(MedicsDbHelper.DATABASE_NAME);

        mMedicsDbHelper = new MedicsDbHelper(getActivity());

        loadLawyers();
        return root;
    }

    private void loadLawyers() { new LawyersLoadTask().execute();}

    private void showDetailScreen (String lawyerId){
        Intent intent = new Intent(getActivity(), MedicsDetailActivity.class);
        intent.putExtra(MedicsActivity.EXTRA_MEDICS_ID, lawyerId);
        startActivityForResult(intent, REQUEST_UPDATE_DELETE_MEDICS);

    }

    private class LawyersLoadTask extends AsyncTask<Void, Void, Cursor> {

        @Override
        protected Cursor doInBackground(Void... voids){
            return mMedicsDbHelper.getAllLawyers(mIdTipo);
        }

        @Override
        protected void onPostExecute(Cursor cursor){
            if (cursor != null && cursor.getCount() > 0) {
                mMedicsAdapter.swapCursor(cursor);
            }else {

            }
        }
    }
}
