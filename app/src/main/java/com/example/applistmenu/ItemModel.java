package com.example.applistmenu;

public class ItemModel {

    String nama, harga, deskripsi;
    int image;

    public ItemModel(String nama, String harga, int image) {
        this.nama = nama;
        this.harga = harga;
        this.image = image;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() { return deskripsi; }

    public void setDeskripsi(String deskripsi) {
        this.nama = deskripsi;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
