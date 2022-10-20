package com.example.applistmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class DescActivity extends AppCompatActivity {

    TextView txtDescMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc);

        ImageView imgDefault = findViewById(R.id.imgDefault);
        TextView txtNamaMenu = findViewById(R.id.txtNamaMenu);
        TextView txtHargaMenu = findViewById(R.id.txtHargaMenu);
        txtDescMenu = findViewById(R.id.txtDescMenu);
        txtDescMenu.setMovementMethod(new ScrollingMovementMethod());

        Intent intent= getIntent();

        int imgMenu = intent.getIntExtra("Gambar_Default",0);
        String nmMenu = intent.getStringExtra("Nama_Default");
        String hrgMenu = intent.getStringExtra("Harga_Default");
        String descMenu = intent.getStringExtra("Deskripsi_Default");

        imgDefault.setImageResource(imgMenu);
        txtNamaMenu.setText(nmMenu);
        txtHargaMenu.setText(hrgMenu);
        txtDescMenu.setText(descMenu);
    }
}