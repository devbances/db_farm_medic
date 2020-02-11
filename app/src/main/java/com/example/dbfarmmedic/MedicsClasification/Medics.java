package com.example.dbfarmmedic.MedicsClasification;

import com.example.dbfarmmedic.R;

public class Medics {
    private String nombre;
    private String idTipo;
    private int idDrawable;

    public Medics(String nombre, String idTipo, int idDrawable){
        this.nombre=nombre;
        this.idTipo=idTipo;
        this.idDrawable=idDrawable;
    }
    public String getNombre() {
        return nombre;
    }

    public String getIdTipo() {
        return idTipo;
    }

    public int getIdDrawable() {
        return idDrawable;
    }


    public int getId() {
        return nombre.hashCode();
    }

    public static Medics[] ITEMS={
            new Medics("generales","1", R.drawable.generales),
            new Medics("Antibioticos","2", R.drawable.antibioticos),
            new Medics("Vacunas","3", R.drawable.vacunas),
            new Medics("Jarabes","4", R.drawable.jarabes),
    };


    public static Medics getItem(int id) {
        for (Medics item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }
}
