package com.example.ux32vd.geofunny;

public class DeklarasiMenuBangunDatar{

    private String Nama ;
    private String Rumus ;
    private String Deskripsi ;
    private int Thumbnail ;

    public DeklarasiMenuBangunDatar() {
    }

    public DeklarasiMenuBangunDatar(String nama, String rumus, String deskripsi, int thumbnail) {
        Nama = nama;
        Rumus = rumus;
        Deskripsi = deskripsi;
        Thumbnail = thumbnail;
    }

    public String getNama() {
        return Nama;
    }

    public String getRumus() { return Rumus ;}

    public String getDeskripsi() { return Deskripsi; }

    public int getThumbnail() {
        return Thumbnail;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public void setKategori(String rumus) { Rumus = rumus; }

    public void setDeskripsi(String deskripsi) {
        Deskripsi = deskripsi;
    }

    public void setThumbnail(int thumbnail) { Thumbnail = thumbnail; }

}
