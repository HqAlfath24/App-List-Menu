package com.example.applistmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter recyclerViewAdapter;
    RecyclerView.LayoutManager recyclerLayoutMAnager;
    ArrayList<ItemModel>data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rec_item);
        recyclerView.setHasFixedSize(true);

        recyclerLayoutMAnager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(recyclerLayoutMAnager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                DividerItemDecoration.VERTICAL));

        data = new ArrayList<>();
        for (int i = 0; i< Item.Nama.length;i++){
            data.add(new ItemModel(
                    Item.Nama[i],
                    Item.Harga[i],
                    Item.Iconlist[i] ));
        }

        recyclerViewAdapter=new AdapterRecView(this,data);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}