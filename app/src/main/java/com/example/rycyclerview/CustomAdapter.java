package com.example.rycyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<contact_tien> {

    private  Context context;
    private ArrayList<contact_tien> contact_tiens;
    private int resource;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<contact_tien> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.contact_tiens= objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView= LayoutInflater.from(context).inflate(R.layout.item2,parent,false);
        TextView tv_nameview=convertView.findViewById(R.id.nameview);
        TextView tv_numberview=convertView.findViewById(R.id.numberview);


        contact_tien contact_tiens1234=contact_tiens.get(position);
tv_nameview.setText(contact_tiens1234.getName());
tv_numberview.setText("("+contact_tiens1234.getNumber()+")");
        return convertView;
    }
}
