package com.example.rycyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    ListView lvcontact;
    ArrayList<contact_tien> contact_tien1234 = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        lvcontact = findViewById(R.id.lvcontact);
        Intent intent = getIntent();


        int t = (int) intent.getIntExtra("i", 0);
        contact_tien1234 = (ArrayList<contact_tien>) intent.getSerializableExtra("List");

       CustomAdapter customAdapter = new CustomAdapter(this, R.layout.item2, contact_tien1234);
       lvcontact.setAdapter(customAdapter);
//      int a12 = 0;
//
//        tien2.setText(intent.getIntExtra("a12",a12)+"");


    }
}
