# REST API Spring Boot with MySQL

Ini adalah aplikasi **REST API** yang dibangun dengan **Spring Boot** dan **MySQL** sebagai database, menggunakan **Java 17** dan **Maven** sebagai alat pengelola proyek. Aplikasi ini dirancang untuk menyediakan antarmuka layanan web yang dapat digunakan untuk melakukan operasi CRUD (Create, Read, Update, Delete) pada data yang disimpan di database MySQL.

## Fitur Utama
- RESTful API untuk mengelola data.
- CRUD operasi untuk entitas yang dikelola oleh aplikasi.
- Penggunaan **Spring Boot** untuk memudahkan pengembangan aplikasi.
- **MySQL** sebagai database untuk penyimpanan data.
- **Java 17** sebagai bahasa pemrograman.
- **Maven** sebagai alat pengelola proyek.

## Prasyarat

Sebelum menjalankan aplikasi ini, pastikan Anda memiliki hal-hal berikut:
- **Java 17** terinstal di komputer Anda. Anda bisa mengecek versi Java dengan perintah:
  ```bash
  java -version

- **Maven** terinstal di komputer Anda. Anda bisa mengecek versi Java dengan perintah:
  ```bash
  mvn -v

## Konfigurasi

- buat database MYSQL dengan cara :
  ```bash
  CREATE DATABASE rest_api_db;

## Menjalankan Aplikasi

- Clone Repositori
   ```bash
   git clone https://github.com/knightmaster11/Rest-Full-Api-Springboot-Mysql.git
   cd Rest-Full-Api-Springboot-Mysql
- Build dan Jalankan Aplikasi
  ```bash
  mvn clean install
  mvn spring-boot:run
