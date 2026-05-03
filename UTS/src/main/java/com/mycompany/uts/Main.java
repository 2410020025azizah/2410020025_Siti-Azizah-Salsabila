package com.mycompany.uts;

public class Main {
    public static void main(String[] args) {

        // Object User
        User user = new User();
        user.id = 1;
        user.email = "2410020025azizah@gmail.com";
        user.password = "1234#";

        user.index();
        user.store();
        user.update();
        user.destroy();

        System.out.println();

        // Object Penerbit
        Penerbit penerbit = new Penerbit();
        penerbit.id = 10;
        penerbit.namaPenerbit = "Gramedia";
        penerbit.alamatPenerbit = "Jakarta";

        penerbit.index();
        penerbit.store();
        penerbit.update();
        penerbit.destroy();

        System.out.println();

        // Object Buku
        Buku buku = new Buku();
        buku.id = 100;
        buku.judul = "Belajar Java";
        buku.penulis = "Andi";
        buku.tahun = 2024;
        buku.penerbit = penerbit;

        buku.index();
        buku.store();
        buku.update();
        buku.destroy();
    }
}