package com.mycompany.tugas03;

public class Film {

    // 5 atribut
    String judul;
    String genre;
    String studio;
    int tahunRilis;
    double rating;

    // Constructor 1
    public Film() {
        System.out.println("Constructor tanpa parameter");
    }

    // Constructor 2
    public Film(String judul, String genre) {
        this.judul = judul;
        this.genre = genre;
    }

    // Constructor 3
    public Film(String judul, String genre, String studio,
            int tahunRilis, double rating) {

        this.judul = judul;
        this.genre = genre;
        this.studio = studio;
        this.tahunRilis = tahunRilis;
        this.rating = rating;
    }

    // Method tanpa nilai balik
    public void tampilData() {
        System.out.println("Judul Film  : " + judul);
        System.out.println("Genre       : " + genre);
        System.out.println("Studio      : " + studio);
        System.out.println("Tahun Rilis : " + tahunRilis);
        System.out.println("Rating      : " + rating);
    }

    // Method dengan nilai balik
    public String kategoriFilm() {
        if (rating >= 8.0) {
            return "Film Populer";
        } else {
            return "Film Biasa";
        }
    }

    // CREATE
    public void createData() {
        String sql = "INSERT INTO film VALUES ('"
                + judul + "','" + genre + "','" + studio + "',"
                + tahunRilis + "," + rating + ")";

        System.out.println("SQL CREATE:");
        System.out.println(sql);
    }

    // READ
    public void readData() {
        String sql = "SELECT * FROM film";

        System.out.println("SQL READ:");
        System.out.println(sql);
    }

    // UPDATE
    public void updateData() {
        String sql = "UPDATE film SET genre='"
                + genre + "' WHERE judul='" + judul + "'";

        System.out.println("SQL UPDATE:");
        System.out.println(sql);
    }

    // DELETE
    public void deleteData() {
        String sql = "DELETE FROM film WHERE judul='" + judul + "'";

        System.out.println("SQL DELETE:");
        System.out.println(sql);
    }
}