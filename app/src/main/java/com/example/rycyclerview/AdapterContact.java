package com.example.rycyclerview;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterContact extends RecyclerView.Adapter<AdapterContact.ViewHoder> {
    List<Contact> contacts;
    IonClickContact ionClickContact;

    public AdapterContact(List<Contact> contacts) {
        this.contacts = contacts;

    }



    public void setIonClickContact(IonClickContact ionClickContact) {
        this.ionClickContact = ionClickContact;
    }

    @NonNull
    @Override
    public AdapterContact.ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view, parent, false);
        ViewHoder viewHoder = new ViewHoder(view);
        return viewHoder;

    }

    @Override
    public void onBindViewHolder(@NonNull AdapterContact.ViewHoder holder,final int position) {
final  Contact contact=contacts.get(position);
holder.name.setText(contact.getName());
holder.anh.setImageResource(contact.getAnh());
holder.name.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
    ionClickContact.onClickName(contact.getName());
    }
});
    }

    @Override
    public int getItemCount() {
        return  contacts.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder {
        TextView name;
        ImageView anh;
        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            anh=itemView.findViewById(R.id.anh12);
        }
    }
}
