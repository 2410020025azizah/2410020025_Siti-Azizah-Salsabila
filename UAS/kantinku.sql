CREATE DATABASE kantinku;
USE kantinku;

CREATE TABLE user (
    id_user INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL,
    nama VARCHAR(100) NOT NULL
);

CREATE TABLE menu (
    id_menu INT AUTO_INCREMENT PRIMARY KEY,
    kode_menu VARCHAR(10) NOT NULL,
    nama_menu VARCHAR(100) NOT NULL,
    kategori VARCHAR(50),
    harga DOUBLE NOT NULL,
    stok INT NOT NULL
);


CREATE TABLE pelanggan (
    id_pelanggan INT AUTO_INCREMENT PRIMARY KEY,
    nama_pelanggan VARCHAR(100) NOT NULL,
    no_hp VARCHAR(20),
    alamat VARCHAR(200)
);

CREATE TABLE pesanan (
    id_pesanan INT AUTO_INCREMENT PRIMARY KEY,
    id_pelanggan INT NOT NULL,
    id_menu INT NOT NULL,
    jumlah INT NOT NULL,
    total DOUBLE NOT NULL,
    status VARCHAR(30),

    CONSTRAINT fk_pelanggan
    FOREIGN KEY(id_pelanggan)
    REFERENCES pelanggan(id_pelanggan),

    CONSTRAINT fk_menu
    FOREIGN KEY(id_menu)
    REFERENCES menu(id_menu)
);
