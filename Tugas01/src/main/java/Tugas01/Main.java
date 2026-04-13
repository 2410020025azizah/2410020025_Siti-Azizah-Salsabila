/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Tugas01;

import akademis.MataKuliah;

public class Main {
    public static void main(String[] args) {
        
        // Object Mahasiswa
        Mahasiswa mhs = new Mahasiswa();
        mhs.npm = "2410020025";
        mhs.nama = "Siti Azizah Salsabila";
        mhs.ipk = 3.85;
        mhs.semester = 4;
        
        System.out.println("Data Mahasiswa:");
        System.out.println("NPM: " + mhs.npm);
        System.out.println("Nama: " + mhs.nama);
        System.out.println("IPK: " + mhs.ipk);
        System.out.println("Semester: " + mhs.semester);
        
        // Object MataKuliah   
        MataKuliah mk = new MataKuliah();
        mk.kodeMk = "SIF1402";
        mk.namaMk = "Pemrograman Berbasis Objek";

        System.out.println("\nData Mata Kuliah:");
        System.out.println("Kode MK: " + mk.kodeMk);
        System.out.println("Nama MK: " + mk.namaMk);
    }
}
