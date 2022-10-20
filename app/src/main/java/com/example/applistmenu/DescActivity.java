package com.example.applistmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);

        ImageView imgDefault = findViewById(R.id.imgDefault);
        TextView txtNamaMenu = findViewById(R.id.txtNamaMenu);

        Intent intent= getIntent();

        int imgMenu = intent.getIntExtra("Gambar_Default",0);
        String nmMenu = intent.getStringExtra("Nama_Default");

        imgDefault.setImageResource(imgMenu);
        txtNamaMenu.setText(nmMenu);
    }
}