package com.example.dbfarmmedic.DataMedic;

import android.provider.BaseColumns;

public class MedicsContract {
    public static abstract class MedicsEntry implements BaseColumns {
        public static final String TABLE_NAME= "medics";

        public static final String ID = "id";
        public static final String GROUP_MEDICS = "groupMedics";
        public static final String AVATAR_URI = "avatarUri";

        public static final String NAME_GENERIC = "nameGeneric";
        public static final String NAME_ECOMERCE = "nameEcomerce";
        public static final String PRESENTATION = "presentation";

        public static final String GROUP_FARMACO = "groupFarmaco";
        public static final String GROUP_TERAPICS= "groupTerapics";
        public static final String RISK_PREGNANCY = "riskPregnancy";

        public static final String MECANICS_ACTION = "mecanicsAction";

        public static final String CYCLE_LIFE = "cycleLife";
        public static final String ABSORTION = "absortion";
        public static final String DISTRIBUTION = "distribution";
        public static final String METABOLIC = "metabolic";
        public static final String EXCRETION = "excretion";

        public static final String INDICATIONS = "indications";

        public static final String CONTRADICTIONS = "contradictions";

        public static final String CV = "cv";
        public static final String DERMA = "derma";
        public static final String GI = "gi";
        public static final String NEURO = "neuro";
        public static final String GU = "gu";
        public static final String ORL = "orl";
        public static final String OTHERS = "others";

        public static final String INTERACTION_MEDICS = "interactionMedics";
        public static final String CARE_NURSING = "careNursing";

    }
}
