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

import com.bumptech.glide.Glide;

import com.example.dbfarmmedic.DataMedic.MedicsData;
import com.example.dbfarmmedic.DataMedic.MedicsDbHelper;
import com.example.dbfarmmedic.Medics.MedicsFragment;
import com.example.dbfarmmedic.MedicsClasification.Medics;
import com.example.dbfarmmedic.R;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class MedicsDetailFragmentActivity extends Fragment {
    private static final String ARG_LAWYER_ID = "lawyerId";

    private String mLawyerId;

    private CollapsingToolbarLayout mCollapsingView;
    private ImageView mAvatar;
    //private TextView mNameGeneric;
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
        MedicsDetailFragmentActivity fragment=new MedicsDetailFragmentActivity();
        Bundle args = new Bundle();
        args.putString(ARG_LAWYER_ID, lawyerID);
        fragment.setArguments(args);
        return fragment;

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
        mCollapsingView =  getActivity().findViewById(R.id.toolbar_layout);
        mAvatar =  getActivity().findViewById(R.id.iv_avatar);

        //mNameGeneric = (TextView) root.findViewById(R.id.tv_name);
        mNameEcomerce =  root.findViewById(R.id.tv_nameEcomerce);
        mPresentation =  root.findViewById(R.id.tv_presentation);
        mGroupFarmaco =  root.findViewById(R.id.tv_groupFarmaco);
        mGroupTerapics =  root.findViewById(R.id.tv_GroupTerapics);
        mRiskPregnancy =  root.findViewById(R.id.tv_RiskPregnancy);
        mMecanicsAction =  root.findViewById(R.id.tv_MecanicsAction);
        mCycleLife =  root.findViewById(R.id.tv_CycleLife);
        mAbsortion =  root.findViewById(R.id.tv_Absortion);
        mDistribution =  root.findViewById(R.id.tv_Distribution);
        mMetabolic =  root.findViewById(R.id.tv_Metabolic);
        mExcretion =  root.findViewById(R.id.tv_Excretion);
        mIndications =  root.findViewById(R.id.tv_Indications);
        mContradictions =  root.findViewById(R.id.tv_Contradictions);
        mCv =  root.findViewById(R.id.tv_cv);
        mDerma =  root.findViewById(R.id.tv_derma);
        mGi =  root.findViewById(R.id.tv_gi);
        mNeuro =  root.findViewById(R.id.tv_Neuro);
        mGu =  root.findViewById(R.id.tv_gu);
        mOrl =  root.findViewById(R.id.tv_Orl);
        mOthers =  root.findViewById(R.id.tv_Others);
        mInteractionMedics =  root.findViewById(R.id.tv_InteractionMedics);
        mCareNursing =  root.findViewById(R.id.tv_CareNursing);



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


    private void showLawyer(MedicsData medicsData) {
        mCollapsingView.setTitle(medicsData.getNameGeneric());
        Glide.with(this)
                .load(Uri.parse("file:///android_asset/" + medicsData.getAvatarUri()))
                .centerCrop()
                .into(mAvatar);

        //mNameGeneric.setText(medicsData.getNombre());
        mNameEcomerce.setText(medicsData.getNameEcomerce());
        mPresentation.setText(medicsData.getPresentation());
        mGroupFarmaco.setText(medicsData.getGroupFarmaco());
        mGroupTerapics.setText(medicsData.getGroupTerapics());
        mRiskPregnancy.setText(medicsData.getRiskPregnancy());
        mMecanicsAction.setText(medicsData.getMecanicsAction());
        mCycleLife.setText(medicsData.getCycleLife());
        mAbsortion.setText(medicsData.getAbsortion());
        mDistribution.setText(medicsData.getDistribution());
        mMetabolic.setText(medicsData.getMetabolic());
        mExcretion.setText(medicsData.getExcretion());

        mIndications.setText(medicsData.getIndications());

        mContradictions.setText(medicsData.getContradictions());

        mCv.setText(medicsData.getCv());
        mDerma.setText(medicsData.getDerma());
        mGi.setText(medicsData.getGi());
        mNeuro.setText(medicsData.getNeuro());
        mGu.setText(medicsData.getGu());
        mOrl.setText(medicsData.getOrl());
        mOthers.setText(medicsData.getOthers());

        mInteractionMedics.setText(medicsData.getInteractionMedics());
        mCareNursing.setText(medicsData.getCareNursing());
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
                showLawyer(new MedicsData(cursor));
            } else {
                showLoadError();
            }
        }

    }


}
