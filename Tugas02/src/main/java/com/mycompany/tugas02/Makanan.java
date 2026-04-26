package com.mycompany.tugas02;

public class Makanan {
    String nama;
    String jenis;
    int harga;

    public Makanan() {
        nama = "Nasi Goreng";
        jenis = "Makanan Berat";
        harga = 15000;
    }

    public Makanan(String nama, String jenis, int harga) {
        this.nama = nama;
        this.jenis = jenis;
        this.harga = harga;
    }

    public void tampilData() {
        System.out.println("Nama Makanan : " + nama);
        System.out.println("Jenis        : " + jenis);
        System.out.println("Harga        : " + harga);
    }

    public String kategoriHarga() {
        if (harga >= 20000) {
            return "Makanan Mahal";
        } else {
            return "Makanan Murah";
        }
    }
}