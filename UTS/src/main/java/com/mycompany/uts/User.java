package com.mycompany.uts;

public class User {
    int id;
    String email;
    String password;

    // Method index
    void index() {
        System.out.println("SELECT * FROM user;");
    }

    // Method create
    void create() {
        System.out.println("Menampilkan form tambah user");
    }

    // Method store
    void store() {
        System.out.println("INSERT INTO user (id, email, password) VALUES (" 
                + id + ", '" + email + "', '" + password + "');");
    }

    // Method edit
    void edit() {
        System.out.println("Menampilkan form edit user dengan id = " + id);
    }

    // Method update
    void update() {
        System.out.println("UPDATE user SET email='" + email + "', password='" 
                + password + "' WHERE id=" + id + ";");
    }

    // Method destroy
    void destroy() {
        System.out.println("DELETE FROM user WHERE id=" + id + ";");
    }
}