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

        mNameGeneric = (TextView) root.findViewById(R.id.tv_name);
        mNameEcomerce = (TextView) root.findViewById(R.id.tv_nameEcomerce);
        mPresentation = (TextView) root.findViewById(R.id.tv_presentation);
        mGroupFarmaco = (TextView) root.findViewById(R.id.tv_groupFarmaco);
        mGroupTerapics = (TextView) root.findViewById(R.id.tv_GroupTerapics);
        mRiskPregnancy = (TextView) root.findViewById(R.id.tv_RiskPregnancy);
        mMecanicsAction = (TextView) root.findViewById(R.id.tv_MecanicsAction);
        mCycleLife = (TextView) root.findViewById(R.id.tv_CycleLife);
        mAbsortion = (TextView) root.findViewById(R.id.tv_Absortion);
        mDistribution = (TextView) root.findViewById(R.id.tv_Distribution);
        mMetabolic = (TextView) root.findViewById(R.id.tv_Metabolic);
        mExcretion = (TextView) root.findViewById(R.id.tv_Excretion);
        mIndications = (TextView) root.findViewById(R.id.tv_Indications);
        mContradictions = (TextView) root.findViewById(R.id.tv_Contradictions);
        mCv = (TextView) root.findViewById(R.id.tv_cv);
        mDerma = (TextView) root.findViewById(R.id.tv_derma);
        mGi = (TextView) root.findViewById(R.id.tv_gi);
        mNeuro = (TextView) root.findViewById(R.id.tv_Neuro);
        mGu = (TextView) root.findViewById(R.id.tv_gu);
        mOrl = (TextView) root.findViewById(R.id.tv_Orl);
        mOthers = (TextView) root.findViewById(R.id.tv_Others);
        mInteractionMedics = (TextView) root.findViewById(R.id.tv_InteractionMedics);
        mCareNursing = (TextView) root.findViewById(R.id.tv_CareNursing);



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
        mCollapsingView.setTitle(medics.getNombre());
        Glide.with(this)
                .load(Uri.parse("file:///android_asset/" + medics.getIdDrawable()))
                .centerCrop()
                .into(mAvatar);

        mNameGeneric.setText(medics.getNombre());
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
