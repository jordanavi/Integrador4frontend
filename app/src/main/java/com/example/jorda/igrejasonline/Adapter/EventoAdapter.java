package com.example.jorda.igrejasonline.Adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.jorda.igrejasonline.R;
import com.example.jorda.igrejasonline.domain.ModeloEvento;

import java.util.List;

public class EventoAdapter extends ArrayAdapter<ModeloEvento> {

    private Context context;
    private List<ModeloEvento> eventos;

    public EventoAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<ModeloEvento> objects) {
        super(context, resource, objects);
        this.context = context;
        this.eventos = objects;
    }

    @Override
    public View getView(final int pos, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.unica_evento, parent, false);

        // Montar a imagem com base na primeira letra do nome

        TextView txt_eventoTitulo = (TextView) rowView.findViewById(R.id.txt_eventoTitulo);
        TextView txt_eventoDataInicio = (TextView) rowView.findViewById(R.id.txt_eventoDataInicio);
        TextView txt_eventoDataTermino = (TextView) rowView.findViewById(R.id.txt_eventoDataTermino);
        TextView txt_eventoHoraInicio = (TextView) rowView.findViewById(R.id.txt_eventoHoraInicio);
        TextView txt_eventoHoraTermino = (TextView) rowView.findViewById(R.id.txt_eventoHoraTermino);

        txt_eventoTitulo.setText(String.format("Evento: %s",eventos.get(pos).getTitulo()));
        txt_eventoDataInicio.setText((String.format("Data início: %s",eventos.get(pos).getDataInicio())));
        txt_eventoDataTermino.setText((String.format("Data término: %s",eventos.get(pos).getDataTermino())));
        txt_eventoHoraInicio.setText((String.format("Hora início: %s",eventos.get(pos).getHoraInicio())));
        txt_eventoHoraTermino.setText((String.format("Hora término: %s",eventos.get(pos).getHoraTermino())));


        return rowView;
    }

    public int getItemCount() {
        return eventos.size();
    }


}