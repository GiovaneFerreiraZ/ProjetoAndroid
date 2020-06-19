package com.example.rango.Adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.rango.Model.Comidas;
import com.example.rango.R;
import com.example.rango.TelaAlimento;

import java.util.List;

public class AdapterComida extends BaseAdapter {
    private final List<Comidas> comidas;
    private final TelaAlimento telaAlimento;

    public AdapterComida(List<Comidas> comidas,TelaAlimento alimento) {
        this.comidas = comidas;
        this.telaAlimento = alimento;
    }


    @Override
    public int getCount() {
        return comidas.size();
    }

    @Override
    public Object getItem(int i) {
        return comidas.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewLista telaAlimento.getLayoutInflater().inflate(R.layout.listviewcomida,viewGroup,false);
        Comidas comidas = comidas.get(i);
        TextView id = (TextView)
                viewLista.findViewById(R.id.txtId);
        TextView comida1 = (TextView)
                viewLista.findViewById(R.id.txtComida1);
        TextView comida2 = (TextView)
                viewLista.findViewById(R.id.Comida2);
        TextView comida3 = (TextView)
                viewLista.findViewById(R.id.Comida3);

        id.setText(String.valueOf(comidas.getId()));
        comida1.setText(comidas.getComida1());
        comida2.setText(comidas.getComida2());
        comida3.setText(comidas.getComida3());
        return viewLista;
    }
}
