package com.mycompany.uts;

public class Penerbit {
    int id;
    String namaPenerbit;
    String alamatPenerbit;

    void index() {
        System.out.println("SELECT * FROM penerbit;");
    }

    void create() {
        System.out.println("Menampilkan form tambah penerbit");
    }

    void store() {
        System.out.println("INSERT INTO penerbit (id, namaPenerbit, alamatPenerbit) VALUES (" 
                + id + ", '" + namaPenerbit + "', '" + alamatPenerbit + "');");
    }

    void edit() {
        System.out.println("Menampilkan form edit penerbit dengan id = " + id);
    }

    void update() {
        System.out.println("UPDATE penerbit SET namaPenerbit='" + namaPenerbit 
                + "', alamatPenerbit='" + alamatPenerbit + "' WHERE id=" + id + ";");
    }

    void destroy() {
        System.out.println("DELETE FROM penerbit WHERE id=" + id + ";");
    }
}
