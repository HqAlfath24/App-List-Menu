package com.example.applistmenu;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecView extends RecyclerView.Adapter<AdapterRecView.ViewHolder> {

    private ArrayList<ItemModel>dataItem;

    private Context context;

    AdapterRecView(Context context,ArrayList<ItemModel>dataItem){
        this.context =context;
        this.dataItem = dataItem;
    }

    @NonNull
    @Override
    public AdapterRecView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent,
                                                        int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,
                parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecView.ViewHolder holder,
                                 int position) {
        TextView txtNama = holder.txtNama;
        TextView txtHarga = holder.txtHarga;
        ImageView imgIcon = holder.imgIcon;

        txtNama.setText(dataItem.get(position).getNama());
        txtHarga.setText(dataItem.get(position).getHarga());
        imgIcon.setImageResource(dataItem.get(position).getImage());

        holder.parentLayout.setOnClickListener(v->{

            Toast.makeText(context, dataItem.get(position).getNama(),
                    Toast.LENGTH_SHORT).show();

            if(dataItem.get(position).getNama().equals("Lumpia")){
                Intent intent = new Intent(context, DescActivity.class);
                intent.putExtra("Gambar_Default",R.drawable.lumpia);
                intent.putExtra("Nama_Default","Lumpia");
                intent.putExtra("Harga_Default", "15000");
                intent.putExtra("Deskripsi_Default","Lumpia Semarang");
                context.startActivity(intent);

            }if(dataItem.get(position).getNama().equals("Pempek")){
                Intent intent = new Intent(context, DescActivity.class);
                intent.putExtra("Gambar_Default",R.drawable.pempek);
                intent.putExtra("Nama_Default","Pempek");
                intent.putExtra("Harga_Default","12500");
                intent.putExtra("Deskripsi_Default","Pempek Palembang");
                context.startActivity(intent);

            }if(dataItem.get(position).getNama().equals("Tahu Bakso")){
                Intent intent = new Intent(context, DescActivity.class);
                intent.putExtra("Gambar_Default",R.drawable.tahubakso);
                intent.putExtra("Nama_Default","Tahu Bakso");
                intent.putExtra("Harga_Default","10000");
                intent.putExtra("Deskripsi_Default","Tahu Bakso Ungaran");
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtNama, txtHarga;
        ImageView imgIcon;

        LinearLayout parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtNama = itemView.findViewById(R.id.txtNama);
            txtHarga = itemView.findViewById(R.id.txtHarga);
            imgIcon = itemView.findViewById(R.id.imgList);

            parentLayout = itemView.findViewById(R.id.parentLayout);
        }
    }
}
