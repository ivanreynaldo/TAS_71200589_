package com.rplbo.uasprojectpos;

public class Barang {
    private String kode;
    private int stok;
    private int nexNum=1;
    private String nama;
    private long harga;

    public Barang(String nama, int stok , long harga) {
        this.stok = stok;
        this.nama = nama;
        this.harga = harga;

        if (nama.split(" ")[0]=="Keyboard"){
            kode = "KB"+"00"+nexNum;
            nexNum++;
        }else if (nama.split(" ")[0]=="Mouse"){
            kode = "MS"+"00"+nexNum;
            nexNum++;
        }else if (nama.split(" ")[0]=="Headset"){
            kode = "HS"+"00"+nexNum;
            nexNum++;
        }
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public String getKode() {
        return kode;
    }

    public int getStok() {
        return stok;
    }

    public String getNama() {
        return nama;
    }

    public long getHarga() {
        return harga;
    }
}
