package com.mycompany.tugas02;

public class MainMakanan {
    public static void main(String[] args) {

        Makanan m1 = new Makanan();
        m1.tampilData();
        System.out.println("Kategori: " + m1.kategoriHarga());

        System.out.println();

        Makanan m2 = new Makanan("Nasi Goreng Spesial", "Makanan Berat", 20000);
        m2.tampilData();
        System.out.println("Kategori: " + m2.kategoriHarga());
    }
}