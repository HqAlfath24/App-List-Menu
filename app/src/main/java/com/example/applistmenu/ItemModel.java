package com.example.applistmenu;

public class ItemModel {

    String nama, harga, daerah;
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

    public String getDaerah() { return daerah; }

    public void setDaerah(String daerah) {
        this.nama = daerah;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
