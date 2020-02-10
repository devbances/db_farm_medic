package com.example.dbfarmmedic.MedicsDetail;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.CollapsibleActionView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.dbfarmmedic.DataMedic.MedicsDbHelper;
import com.example.dbfarmmedic.Medics.MedicsFragment;
import com.example.dbfarmmedic.MedicsClasification.Medics;
import com.example.dbfarmmedic.R;

public class MedicsDetailFragmentActivity extends Fragment {
    private static final String ARG_LAWYER_ID = "lawyerId";

    private String mLawyerId;

    private CollapsibleActionView mCollapsingView;
    private ImageView mAvatar;
    private TextView mProteinas;
    private TextView mPeso;
    private TextView mEnergy;
    private TextView mLipidos;
    private TextView mCarb;
    private TextView mFibCrud;
    private TextView mFibDiet;


    private MedicsDbHelper mMedicsDbHelper;

    public MedicsDetailFragmentActivity(){

    }

    public  static MedicsDetailFragmentActivity newInstance(String lawyerID){
        MedicsDetailFragmentActivity fragmentActivity=new MedicsDetailFragmentActivity();
        Bundle args = new Bundle();
        args.putString(ARG_LAWYER_ID, lawyerID);
        fragmentActivity.setArguments(args);
        return fragmentActivity;

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mLawyerId = getArguments().getString(ARG_LAWYER_ID);
        }

        setHasOptionsMenu(true);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_medics_details, container, false);
        mCollapsingView = (CollapsingToolbarLayout) getActivity().findViewById(R.id.toolbar_layout);
        mAvatar = (ImageView) getActivity().findViewById(R.id.iv_avatar);
        mPeso = (TextView) root.findViewById(R.id.tv_peso);
        mProteinas = (TextView) root.findViewById(R.id.tv_proteinas);
        mEnergy = (TextView) root.findViewById(R.id.tv_energy);
        mLipidos = (TextView) root.findViewById(R.id.tv_lipidos);
        mCarb = (TextView) root.findViewById(R.id.tv_carb);
        mFibCrud = (TextView) root.findViewById(R.id.tv_fibCrud);
        mFibDiet = (TextView) root.findViewById(R.id.tv_fibDiet);

        mMedicsDbHelper = new MedicsDbHelper(getActivity());

        loadLawyer();

        return root;
    }

    private void loadLawyer() {
        new GetLawyerByIdTask().execute();
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == MedicsFragment.REQUEST_UPDATE_DELETE_MEDICS) {
            if (resultCode == Activity.RESULT_OK) {
                getActivity().setResult(Activity.RESULT_OK);
                getActivity().finish();
            }
        }
    }


    private void showLawyer(Medics medics) {
        mCollapsingView.setTitle(medics.getName());
        Glide.with(this)
                .load(Uri.parse("file:///android_asset/" + medics.getAvatarUri()))
                .centerCrop()
                .into(mAvatar);
        mPeso.setText(medics.getPeso());
        mProteinas.setText(medics.getProteinas());
        mEnergy.setText(medics.getEnergy());
        mLipidos.setText(medics.getLipidos());
        mCarb.setText(medics.getCarb());
        mFibCrud.setText(medics.getFibCrud());
        mFibDiet.setText(medics.getFibDiet());
    }

    private void showLoadError() {
        Toast.makeText(getActivity(),
                "Error al cargar información", Toast.LENGTH_SHORT).show();
    }


    private class GetLawyerByIdTask extends AsyncTask<Void, Void, Cursor> {

        @Override
        protected Cursor doInBackground(Void... voids) {
            return mMedicsDbHelper.getLawyerById(mLawyerId);
        }

        @Override
        protected void onPostExecute(Cursor cursor) {
            if (cursor != null && cursor.moveToLast()) {
                showLawyer(new Medics(cursor));
            } else {
                showLoadError();
            }
        }

    }


}
