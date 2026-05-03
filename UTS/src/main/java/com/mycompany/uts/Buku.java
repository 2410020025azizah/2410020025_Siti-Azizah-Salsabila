package com.mycompany.uts;

public class Buku {
    int id;
    String judul;
    String penulis;
    int tahun;
    Penerbit penerbit;

    void index() {
        System.out.println("SELECT * FROM buku;");
    }

    void create() {
        System.out.println("Menampilkan form tambah buku");
    }

    void store() {
        System.out.println("INSERT INTO buku (id, judul, penulis, tahun, penerbit_id) VALUES (" 
                + id + ", '" + judul + "', '" + penulis + "', " + tahun + ", " 
                + penerbit.id + ");");
    }

    void edit() {
        System.out.println("Menampilkan form edit buku dengan id = " + id);
    }

    void update() {
        System.out.println("UPDATE buku SET judul='" + judul + "', penulis='" + penulis 
                + "', tahun=" + tahun + ", penerbit_id=" + penerbit.id 
                + " WHERE id=" + id + ";");
    }

    void destroy() {
        System.out.println("DELETE FROM buku WHERE id=" + id + ";");
    }
}
