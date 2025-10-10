package org.example;

import java.util.Scanner;

public class kaos { //mendeklarasikan kelas utama yakni kaos
    public static void main(String[] args) {
        Scanner Kaos = new Scanner(System.in); //membuat objek Scanner

        String ukuran = ""; //mendeklarasikan ukuran dengan tipe String
        int harga = 0, total, jumlah = 0; //mendeklarasikan harga, total, dan jumlah dengan tipe int

        System.out.print("masukkan ukuran: "); //input ukuran
        ukuran = Kaos.nextLine(); //baca ukuran
        System.out.print("masukkan jumlah: "); //input jumlah
        jumlah = Kaos.nextInt(); //baca jumlah

        switch (ukuran) { //menentukan ukuran kaos
            case "S": //ekspresi adalah S
                harga = 30000; //S memiliki harga 30000
                break; //menghentikan secara paksa proses switch setelah case cocok
            case "M": //ekspresi adalah M
                harga = 38000; //M memiliki harga 38000
                break; //menghentikan secara paksa proses switch setelah case cocok
            case "L": //ekspresi adalah L
                harga = 45000; //L mimiliki harga 45000
                break; //menghentikan secara paksa proses switch setelah case cocok
            case "XL": //ekpresi adalah XL
                harga = 50000; //Xl memiliki harga 50000
                break; //menghentikan secara paksa proses switch setelah case cocok
            case "XXL": //ekspresi adalah XXL
                harga = 60000; //XXL memiliki harga 60000
                break; //menghentikan secara paksa proses switch setelah case cocok
            default:
                ukuran = "invalid"; //mengembalikan jika tidak ada yang valid
                break; //menghentikan secara paksa proses switch setelah case cocok
        }

        total = jumlah * harga; //menghitung total dengan rumus jumlah * harga

        System.out.println("harga: "+harga); //mencetak harga
        System.out.println("jumlah: "+jumlah); //mencetak total
        System.out.println("harga kaos adalah: " + total); //mencetak total harga kaos
    } //menutup fungsi main
} //menutup fungsi class
