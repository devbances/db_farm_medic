package com.example.dbfarmmedic.DataMedic;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MedicsDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "MedicsData.db";

    public MedicsDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + MedicsContract.MedicsEntry.TABLE_NAME +"("
                + MedicsContract.MedicsEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + MedicsContract.MedicsEntry.ID + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.AVATAR_URI + " TEXT ,"
                + MedicsContract.MedicsEntry.GROUP_MEDICS + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.NAME_GENERIC + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.NAME_ECOMERCE + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.PRESENTATION + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.GROUP_FARMACO + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.GROUP_TERAPICS + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.RISK_PREGNANCY + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.MECANICS_ACTION + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.CYCLE_LIFE + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.ABSORTION + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.DISTRIBUTION + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.METABOLIC + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.EXCRETION + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.INDICATIONS + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.CONTRADICTIONS + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.CV + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.DERMA + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.GI + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.NEURO + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.GU + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.ORL + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.OTHERS + " TEXT NOT NULL,"

                + MedicsContract.MedicsEntry.CARE_NURSING + " TEXT NOT NULL,"
                + MedicsContract.MedicsEntry.INTERACTION_MEDICS + " TEXT NOT NULL,"

                + "UNIQUE (" + MedicsContract.MedicsEntry.ID + "))");
        mockData(db);
    }

    private void mockData(SQLiteDatabase sqLiteDatabase){
        mockLawyer(sqLiteDatabase, new MedicsData("1", "antibioticos.jpg","333333","44444","55555", "6666666","777777","8888888","999999", "10",
                                                    "oooooo11","eeeeee12","eeeee13", "eeeeee14","eeeeeeee15","eeeeeeooooo16","qqqqq17", "ooooooo18","oooooo19","oooooo20",
                                                    "21", "22","23","24","25"));

        //mockLawyer(sqLiteDatabase, new MedicsData("Arroz Cocido 1 Porción","1","62 gr 1/2 Taza Casera","71.20 Kcal","1.49 gr", "0.06 gr","15.62 gr","0.06 gr","ND gr","A_arroz_1pc.jpg"));

    }



    public long mockLawyer(SQLiteDatabase db, MedicsData medicsData){
        return db.insert(MedicsContract.MedicsEntry.TABLE_NAME,
                null, medicsData.toContentValues());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

    public long saveLawyer(MedicsData medicsData){
        SQLiteDatabase sqLiteDatabase = getReadableDatabase();

        return sqLiteDatabase.insert(
                MedicsContract.MedicsEntry.TABLE_NAME,
                null,
                medicsData.toContentValues());
    }
    public Cursor getAllLawyers(String tipoId) {
        return getReadableDatabase()
                .query(
                        MedicsContract.MedicsEntry.TABLE_NAME,
                        null,
                        MedicsContract.MedicsEntry.GROUP_MEDICS + " LIKE ?",
                        new String[]{tipoId},
                        null,
                        null,
                        null,
                        null);

    }

    public Cursor getLawyerById(String lawyerId) {
        Cursor c = getReadableDatabase().query(
                MedicsContract.MedicsEntry.TABLE_NAME,
                null,
                MedicsContract.MedicsEntry.ID + " LIKE ?",
                new String[]{lawyerId},
                null,
                null,
                null,
                null);
        return c;
    }
}
