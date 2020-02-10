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
    private TextView mNameGeneric;
    private TextView mNameEcomerce;
    private TextView mPresentation;
    private TextView mGroupFarmaco;
    private TextView mGroupTerapics;
    private TextView mRiskPregnancy;
    private TextView mMecanicsAction;
    private TextView mCycleLife;
    private TextView mAbsortion;
    private TextView mDistribution;
    private TextView mMetabolic;
    private TextView mExcretion;
    private TextView mIndications;
    private TextView mContradictions;
    private TextView mCv;
    private TextView mDerma;
    private TextView mGi;
    private TextView mNeuro;
    private TextView mGu;
    private TextView mOrl;
    private TextView mOthers;
    private TextView mInteractionMedics;
    private TextView mCareNursing;

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
        mCollapsingView = (mCollapsingView) getActivity().findViewById(R.id.toolbar_layout);
        mAvatar = (ImageView) getActivity().findViewById(R.id.iv_avatar);

        mNameGeneric = (TextView) root.findViewById(R.id.tv_peso);
        mNameEcomerce = (TextView) root.findViewById(R.id.tv_proteinas);
        mPresentation = (TextView) root.findViewById(R.id.tv_energy);
        mGroupFarmaco = (TextView) root.findViewById(R.id.tv_lipidos);
        mGroupTerapics = (TextView) root.findViewById(R.id.tv_carb);
        mRiskPregnancy = (TextView) root.findViewById(R.id.tv_fibCrud);
        mMecanicsAction = (TextView) root.findViewById(R.id.tv_fibDiet);
        mCycleLife = (TextView) root.findViewById(R.id.tv_fibDiet);
        mAbsortion = (TextView) root.findViewById(R.id.tv_fibDiet);
        mDistribution = (TextView) root.findViewById(R.id.tv_fibDiet);
        mMetabolic = (TextView) root.findViewById(R.id.tv_fibDiet);
        mExcretion = (TextView) root.findViewById(R.id.tv_fibDiet);
        mIndications = (TextView) root.findViewById(R.id.tv_fibDiet);
        mContradictions = (TextView) root.findViewById(R.id.tv_fibDiet);
        mCv = (TextView) root.findViewById(R.id.tv_fibDiet);
        mDerma = (TextView) root.findViewById(R.id.tv_fibDiet);
        mGi = (TextView) root.findViewById(R.id.tv_fibDiet);
        mNeuro = (TextView) root.findViewById(R.id.tv_fibDiet);
        mGu = (TextView) root.findViewById(R.id.tv_fibDiet);
        mOrl = (TextView) root.findViewById(R.id.tv_fibDiet);
        mOthers = (TextView) root.findViewById(R.id.tv_fibDiet);
        mInteractionMedics = (TextView) root.findViewById(R.id.tv_fibDiet);
        mCareNursing = (TextView) root.findViewById(R.id.tv_fibDiet);



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

        mNameGeneric.setText(medics.getNameGeneric());
        mNameEcomerce.setText(medics.getProteinas());
        mPresentation.setText(medics.getEnergy());
        mGroupFarmaco.setText(medics.getLipidos());
        mGroupTerapics.setText(medics.getCarb());
        mRiskPregnancy.setText(medics.getFibCrud());
        mMecanicsAction.setText(medics.getFibDiet());
        mCycleLife.setText(medics.getFibDiet());
        mAbsortion.setText(medics.getFibDiet());
        mDistribution.setText(medics.getFibDiet());
        mMetabolic.setText(medics.getMetabolic());
        mExcretion.setText(medics.getFibDiet());
        mIndications.setText(medics.getFibDiet());
        mContradictions.setText(medics.getFibDiet());
        mCv.setText(medics.getFibDiet());
        mDerma.setText(medics.getFibDiet());
        mGi.setText(medics.getFibDiet());
        mNeuro.setText(medics.getFibDiet());
        mGu.setText(medics.getFibDiet());
        mOrl.setText(medics.getFibDiet());
        mOthers.setText(medics.getFibDiet());
        mInteractionMedics.setText(medics.getFibDiet());
        mCareNursing.setText(medics.getFibDiet());
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
