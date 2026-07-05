package com.mycompany.kantinku.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/kantinku";
    private static final String USER = "root";
    private static final String PASS = "";

    public Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(URL, USER, PASS);

            System.out.println("Koneksi berhasil!");

        } catch (ClassNotFoundException | SQLException e) {

            System.out.println("Koneksi gagal!");
            System.out.println(e.getMessage());

        }

        return con;
    }
}