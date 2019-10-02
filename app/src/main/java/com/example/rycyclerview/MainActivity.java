package com.example.rycyclerview;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textView1, textView2;
    RecyclerView recyclerView;
    Contact contact1, contact2, contact3, contact4, contact5, contact6;
    List<Contact> contacts;
    AdapterContact adapterContact;
    Button order;
    ArrayList<contact_tien> contact_tien1 = new ArrayList<>();

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.demso);
        textView2 = findViewById(R.id.tien);
        order = findViewById(R.id.order);
        recyclerView = findViewById(R.id.recyclerview);
        contacts = new ArrayList<>();
        final Contact contact1 = new Contact(R.drawable.pizapnada, "Pizza Panda");
        final Contact contact2 = new Contact(R.drawable.kfcsuper,"KFC Super");
        Contact contact3 = new Contact(R.drawable.bkeadeggs,"Bread Eggs");
        Contact contact4 = new Contact(R.drawable.coca,"Coca Cola");
        Contact contact5 = new Contact(R.drawable.chickensuper,"Chicken super");
        Contact contact6 = new Contact(R.drawable.cupcake,"Cup Cake");

        contacts.add(contact1);
        contacts.add(contact2);
        contacts.add(contact3);
        contacts.add(contact4);
        contacts.add(contact5);
        contacts.add(contact6);
        final contact_tien contact_tien_1 = new contact_tien("(trống)",0);
        final contact_tien contact_tien_2 = new contact_tien("(trống)", 0);
        final contact_tien contact_tien_3 = new contact_tien("(trống)", 0);
        final contact_tien contact_tien_4 = new contact_tien("(trống)", 0);
        final contact_tien contact_tien_5 = new contact_tien("(trống)", 0);
        final contact_tien contact_tien_6 = new contact_tien("(trống)", 0);
        contact_tien1.add(contact_tien_1);
        contact_tien1.add(contact_tien_2);
        contact_tien1.add(contact_tien_3);
        contact_tien1.add(contact_tien_4);
        contact_tien1.add(contact_tien_5);
        contact_tien1.add(contact_tien_6);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getBaseContext(), 2, RecyclerView.VERTICAL, false);

        adapterContact = new AdapterContact(contacts);


        final Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        adapterContact.setIonClickContact(new IonClickContact() {


            int d = 0;
            int a = 0;


            @Override
            public void onClickName(String name) {

                for (int i = 0; i < 6; i++) {
                    if (contacts.get(i).getName().equals(name)) {
                        switch (i+1) {
                            case 1:
                                contact_tien_1.setName(name);
                                contact_tien_1.setNumber(contact_tien_1.getNumber() + 1);
                                break;
                            case 2:
                                contact_tien_2.setName(name);
                                contact_tien_2.setNumber(contact_tien_2.getNumber() + 1);
                                break;
                            case 3:
                                contact_tien_3.setName(name);
                                contact_tien_3.setNumber(contact_tien_3.getNumber() + 1);
                                break;
                            case 4:
                                contact_tien_4.setName(name);
                                contact_tien_4.setNumber(contact_tien_4.getNumber() + 1);
                                break;
                            case 5:
                                contact_tien_5.setName(name);
                                contact_tien_5.setNumber(contact_tien_5.getNumber() + 1);
                                break;
                            case 6:
                                contact_tien_6.setName(name);
                                contact_tien_6.setNumber(contact_tien_6.getNumber() + 1);
                                break;
                        }


                    }

                }



                intent.putExtra("name", name);


                d++;
                a += 10;
                textView1.setText(d + "");
                textView2.setText(a + "$");


                order.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {/////nut button

                        intent.putExtra("List", (Serializable) contact_tien1);
                        startActivity(intent);

                    }
                });
                Toast.makeText(getBaseContext(), name, Toast.LENGTH_LONG).show();
            }
        });


        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterContact);
    }
}
