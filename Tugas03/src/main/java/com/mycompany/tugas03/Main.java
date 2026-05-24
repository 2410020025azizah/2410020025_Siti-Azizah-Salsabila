package com.mycompany.tugas03;

public class Main {

    public static void main(String[] args) {

        // Constructor 1
        Film film1 = new Film();

        System.out.println("========================");

        // Constructor 2
        Film film2 = new Film("Harry Potter", "Fantasy");

        film2.studio = "Warner Bros";
        film2.tahunRilis = 2001;
        film2.rating = 8.5;

        film2.tampilData();

        System.out.println("Kategori : " + film2.kategoriFilm());

        film2.createData();
        film2.readData();
        film2.updateData();
        film2.deleteData();

        System.out.println("========================");

        // Constructor 3
        Film film3 = new Film(
                "Frozen",
                "Animation",
                "Disney",
                2013,
                7.8
        );

        film3.tampilData();

        System.out.println("Kategori : " + film3.kategoriFilm());

        System.out.println("========================");

        // Object inheritance
        FilmFantasy fantasy = new FilmFantasy(
                "Harry Potter and the Goblet of Fire",
                "Fantasy",
                "Warner Bros",
                2005,
                8.7,
                "Harry Potter",
                "Hogwarts"
        );

        fantasy.tampilData();
        fantasy.tampilKarakter();

        System.out.println(fantasy.infoDunia());

        fantasy.createData();
        fantasy.readData();
        fantasy.updateData();
        fantasy.deleteData();
    }
}