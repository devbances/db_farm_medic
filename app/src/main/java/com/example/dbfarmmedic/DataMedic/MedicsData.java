package com.example.dbfarmmedic.DataMedic;

import android.content.ContentValues;
import android.database.Cursor;
import android.media.browse.MediaBrowser;

import com.example.dbfarmmedic.DataMedic.MedicsContract.MedicsEntry;

import java.util.UUID;
/**

/**
 * Entidad "alimento"
 */
public class MedicsData {
    private String id;
    private String groupMedics;
    private String avatarUri;

    private String nameGeneric;
    private String nameEcomerce;
    private String presentation;

    private String groupFarmaco;
    private String groupTerapics;
    private String riskPregnancy;

    private String mecanicsAction;

    private String cycleLife;
    private String absortion;
    private String distribution;
    private String metabolic;
    private String excretion;

    private String indications;

    private String contradictions;

    private String cv;
    private String derma;
    private String gi;
    private String neuro;
    private String gu;
    private String orl;
    private String others;

    private String interactionMedics;
    private String careNursing;



    public MedicsData(String groupMedics, String avatarUri,
                      String nameGeneric, String nameEcomerce, String presentation,
                      String groupFarmaco, String groupTerapics, String riskPregnancy,
                      String mecanicsAction,
                      String cycleLife, String absortion, String distribution, String metabolic, String excretion,
                      String indications, String contradictions,
                      String cv, String dermma, String gi, String neuro, String gu, String orl, String others,
                      String interactionMedics, String careNursing) {

        this.id = UUID.randomUUID().toString();

        this.avatarUri = avatarUri;
        this.groupMedics = groupMedics;

        this.nameGeneric = nameGeneric;
        this.nameEcomerce = nameEcomerce;
        this.presentation = presentation;

        this.groupFarmaco = groupFarmaco;
        this.groupTerapics = groupTerapics;
        this.riskPregnancy = riskPregnancy;

        this.mecanicsAction = mecanicsAction;

        this.cycleLife = cycleLife;
        this.absortion = absortion;
        this.distribution = distribution;
        this.metabolic = metabolic;
        this.excretion = excretion;

        this.indications = indications;

        this.contradictions = contradictions;

        this.cv = cv;
        this.derma = dermma;
        this.gi = gi;
        this.neuro = neuro;
        this.gu = gu;
        this.orl = orl;
        this.others = others;

        this.interactionMedics = interactionMedics;
        this.careNursing = careNursing;

    }

    public MedicsData(Cursor cursor) {
        id = cursor.getString(cursor.getColumnIndex(MedicsContract.MedicsEntry.ID));
        groupMedics = cursor.getString(cursor.getColumnIndex(MedicsEntry.GROUP_MEDICS));
        avatarUri = cursor.getString(cursor.getColumnIndex(MedicsEntry.AVATAR_URI));
        nameGeneric = cursor.getString(cursor.getColumnIndex(MedicsContract.MedicsEntry.NAME_GENERIC));


        nameEcomerce = cursor.getString(cursor.getColumnIndex(MedicsEntry.NAME_ECOMERCE));
        presentation = cursor.getString(cursor.getColumnIndex(MedicsEntry.PRESENTATION));

        groupFarmaco = cursor.getString(cursor.getColumnIndex(MedicsEntry.GROUP_FARMACO));
        groupTerapics = cursor.getString(cursor.getColumnIndex(MedicsEntry.GROUP_TERAPICS));
        riskPregnancy = cursor.getString(cursor.getColumnIndex(MedicsEntry.RISK_PREGNANCY));

        mecanicsAction = cursor.getString(cursor.getColumnIndex(MedicsEntry.MECANICS_ACTION));

        cycleLife = cursor.getString(cursor.getColumnIndex(MedicsEntry.CYCLE_LIFE));
        absortion = cursor.getString(cursor.getColumnIndex(MedicsEntry.ABSORTION));
        distribution = cursor.getString(cursor.getColumnIndex(MedicsEntry.DISTRIBUTION));
        metabolic = cursor.getString(cursor.getColumnIndex(MedicsEntry.METABOLIC));
        excretion = cursor.getString(cursor.getColumnIndex(MedicsEntry.EXCRETION));

        indications = cursor.getString(cursor.getColumnIndex(MedicsEntry.INDICATIONS));

        contradictions = cursor.getString(cursor.getColumnIndex(MedicsEntry.CONTRADICTIONS));

        cv = cursor.getString(cursor.getColumnIndex(MedicsEntry.CV));
        derma = cursor.getString(cursor.getColumnIndex(MedicsEntry.DERMA));
        gi = cursor.getString(cursor.getColumnIndex(MedicsEntry.GI));
        neuro = cursor.getString(cursor.getColumnIndex(MedicsEntry.NEURO));
        gu = cursor.getString(cursor.getColumnIndex(MedicsEntry.GU));
        orl = cursor.getString(cursor.getColumnIndex(MedicsEntry.ORL));
        others = cursor.getString(cursor.getColumnIndex(MedicsEntry.OTHERS));

        interactionMedics = cursor.getString(cursor.getColumnIndex(MedicsEntry.INTERACTION_MEDICS));
        careNursing = cursor.getString(cursor.getColumnIndex(MedicsEntry.CARE_NURSING));






    }

    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(MedicsEntry.ID, id);
        values.put(MedicsEntry.AVATAR_URI, avatarUri);
        values.put(MedicsEntry.NAME_GENERIC, nameGeneric);
        values.put(MedicsEntry.GROUP_MEDICS, groupMedics);

        values.put(MedicsEntry.NAME_ECOMERCE, nameEcomerce);
        values.put(MedicsEntry.PRESENTATION, presentation);

        values.put(MedicsEntry.GROUP_FARMACO, groupFarmaco);
        values.put(MedicsEntry.GROUP_TERAPICS, groupTerapics);
        values.put(MedicsEntry.RISK_PREGNANCY, riskPregnancy);

        values.put(MedicsEntry.MECANICS_ACTION, mecanicsAction);

        values.put(MedicsEntry.CYCLE_LIFE, cycleLife);
        values.put(MedicsEntry.ABSORTION, absortion);
        values.put(MedicsEntry.DISTRIBUTION, distribution);
        values.put(MedicsEntry.METABOLIC, metabolic);
        values.put(MedicsEntry.EXCRETION, excretion);

        values.put(MedicsEntry.INDICATIONS, indications);

        values.put(MedicsEntry.CONTRADICTIONS, contradictions);

        values.put(MedicsEntry.CV, cv);
        values.put(MedicsEntry.DERMA, derma);
        values.put(MedicsEntry.GI, gi);
        values.put(MedicsEntry.NEURO, neuro);
        values.put(MedicsEntry.GU, gu);
        values.put(MedicsEntry.ORL, orl);
        values.put(MedicsEntry.OTHERS, others);

        values.put(MedicsEntry.INTERACTION_MEDICS, interactionMedics);
        values.put(MedicsEntry.CARE_NURSING, careNursing);


        return values;
    }

    public String getId() {
        return id;
    }
    public String getAvatarUri() {
        return avatarUri;
    }

    public String getNameGeneric() {
        return nameGeneric;
    }


    public String getGroupMedics(){return groupMedics;}

    public String getNameEcomerce() {
        return nameEcomerce;
    }

    public String getPresentation() {
        return presentation;
    }


    public String getGroupFarmaco() {
        return groupFarmaco;
    }

    public String getGroupTerapics() {
        return groupTerapics;
    }

    public String getRiskPregnancy() { return riskPregnancy;  }

    public String getMecanicsAction() { return mecanicsAction;  }

    public String getCycleLife() { return cycleLife;  }

    public String getAbsortion() {
        return absortion;
    }

    public String getDistribution() {
        return distribution;
    }

    public String getMetabolic() {
        return metabolic;
    }

    public String getExcretion() {
        return excretion;
    }


    public String getIndications() {
        return indications;
    }

    public String getContradictions() {
        return contradictions;
    }


    public String getCv() {
        return cv;
    }

    public String getDerma() {
        return derma;
    }

    public String getGi() {
        return gi;
    }

    public String getNeuro() {
        return neuro;
    }

    public String getGu() {
        return gu;
    }

    public String getOrl() {
        return orl;
    }

    public String getOthers() {
        return others;
    }


    public String getInteractionMedics() {
        return interactionMedics;
    }

    public String getCareNursing() {
        return careNursing;
    }

}

