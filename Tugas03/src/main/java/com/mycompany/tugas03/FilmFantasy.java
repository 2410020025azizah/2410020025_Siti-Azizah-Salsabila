package com.mycompany.tugas03;

public class FilmFantasy extends Film {

    // tambahan 2 atribut
    String karakterUtama;
    String duniaSihir;

    // Constructor turunan
    public FilmFantasy(String judul, String genre, String studio,
            int tahunRilis, double rating,
            String karakterUtama, String duniaSihir) {

        super(judul, genre, studio, tahunRilis, rating);

        this.karakterUtama = karakterUtama;
        this.duniaSihir = duniaSihir;
    }

    // Method tambahan 1
    public void tampilKarakter() {
        System.out.println("Karakter Utama : " + karakterUtama);
    }

    // Method tambahan 2
    public String infoDunia() {
        return "Dunia Fantasi : " + duniaSihir;
    }
}