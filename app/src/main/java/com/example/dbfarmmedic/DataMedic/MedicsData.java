package com.example.dbfarmmedic.DataMedic;

import android.content.ContentValues;
import android.database.Cursor;

import com.bamsac.NutriCom.Data.AlimentosContract.AlimentoEntry;

import java.util.UUID;
/**

/**
 * Entidad "alimento"
 */
public class MedicsData {
    private String id;
    private String name;
    private String grupoAlimento;
    private String peso;
    private String energy;
    private String proteinas;
    private String lipidos;
    private String carb;
    private String fibCrud;
    private String fibDiet;
    private String avatarUri;

    public MedicsData(String name, String grupoAlimento,
                      String peso, String energy, String proteinas,
                      String lipidos, String carb, String fibCrud, String fibDiet, String avatarUri) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.grupoAlimento = grupoAlimento;
        this.peso = peso;
        this.energy = energy;
        this.proteinas = proteinas;
        this.lipidos = lipidos;
        this.carb = carb;
        this.fibCrud = fibCrud;
        this.fibDiet = fibDiet;
        this.avatarUri = avatarUri;
    }

    public MedicsData(Cursor cursor) {
        id = cursor.getString(cursor.getColumnIndex(AlimentosContract.AlimentoEntry.ID));
        name = cursor.getString(cursor.getColumnIndex(AlimentosContract.AlimentoEntry.NAME));
        grupoAlimento = cursor.getString(cursor.getColumnIndex(AlimentoEntry.GRUPO_ALIMENTO));
        peso = cursor.getString(cursor.getColumnIndex(AlimentoEntry.PESO));
        energy = cursor.getString(cursor.getColumnIndex(AlimentoEntry.ENERGY));
        proteinas = cursor.getString(cursor.getColumnIndex(AlimentoEntry.PROTEINAS));
        lipidos = cursor.getString(cursor.getColumnIndex(AlimentoEntry.LIPIDOS));
        carb = cursor.getString(cursor.getColumnIndex(AlimentoEntry.CARB));
        fibCrud = cursor.getString(cursor.getColumnIndex(AlimentoEntry.FIBCRUD));
        fibDiet = cursor.getString(cursor.getColumnIndex(AlimentoEntry.FIBDIET));
        avatarUri = cursor.getString(cursor.getColumnIndex(AlimentoEntry.AVATAR_URI));
    }

    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(AlimentoEntry.ID, id);
        values.put(AlimentoEntry.NAME, name);
        values.put(AlimentoEntry.GRUPO_ALIMENTO, grupoAlimento);
        values.put(AlimentoEntry.PESO, peso);
        values.put(AlimentoEntry.ENERGY, energy);
        values.put(AlimentoEntry.PROTEINAS, proteinas);
        values.put(AlimentoEntry.LIPIDOS, lipidos);
        values.put(AlimentoEntry.CARB, carb);
        values.put(AlimentoEntry.FIBCRUD, fibCrud);
        values.put(AlimentoEntry.FIBDIET, fibDiet);
        values.put(AlimentoEntry.AVATAR_URI, avatarUri);
        return values;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGrupoAlimento(){return grupoAlimento;}

    public String getPeso() {
        return peso;
    }

    public String getEnergy() {
        return energy;
    }

    public String getProteinas() {
        return proteinas;
    }

    public String getLipidos() {
        return lipidos;
    }

    public String getCarb() { return carb;  }

    public String getFibCrud() { return fibCrud;  }

    public String getFibDiet() { return fibDiet;  }

    public String getAvatarUri() {
        return avatarUri;
    }
}

