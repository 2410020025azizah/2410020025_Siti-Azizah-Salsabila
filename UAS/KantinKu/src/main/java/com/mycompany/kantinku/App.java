package com.mycompany.kantinku;

import com.mycompany.kantinku.connection.ConnectionDB;

public class App {

    public static void main(String[] args) {

        ConnectionDB db = new ConnectionDB();
        db.getConnection();

    }

}