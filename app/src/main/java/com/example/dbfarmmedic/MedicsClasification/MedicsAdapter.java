package com.example.dbfarmmedic.MedicsClasification;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dbfarmmedic.R;

public class MedicsAdapter extends BaseAdapter {
    private Context context;

    public MedicsAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return Medics.ITEMS.length;
    }

    @Override
    public Medics getItem(int position) {
        return Medics.ITEMS[position];
    }

    @Override
    public long getItemId(int position) {
        return getItem(position).getId();
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.grid_item_clasification_medics, viewGroup, false);
        }

        ImageView imagenCoche =  view.findViewById(R.id.imagen_grupo_medics);
        TextView nombreCoche =  view.findViewById(R.id.nombre_grupo_medics);

        final Medics item = getItem(position);
        Glide.with(imagenCoche.getContext())
                .load(item.getIdDrawable())
                .into(imagenCoche);

        nombreCoche.setText(item.getNombre());

        return view;
    }
}
