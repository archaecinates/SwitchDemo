package org.example;

import java.util.Scanner;

public class jumlahHari {
    public static void main(String[] args) {
        Scanner Hari = new Scanner(System.in);

        int hari = 0; //deklarasi hari tipe int
        String bulan; //deklarasi bulan tipe string

        System.out.print("masukkan bulan: "); //input bulan
        bulan = Hari.nextLine(); //baca bulan

        switch (bulan.toLowerCase()) { //menentukan bulan dan mengubah/membaca sesuai input user apakah huruf kapital atau huruf kecil
            case "januari": //ekspresi adalah januari
                hari = 31; //januari memiliki 31 hari
                break; //menghentikan secara paksa proses switch setelah case cocok
            case "februari": //ekspresi adalah februari
                hari = 28; //februari memiliki 28 hari
                break; //menghentikan secara paksa proses switch setelah case cocok
            case "maret": //ekspresi adalah maret
                hari = 31; //maret memiliki 31 hari
                break; //menghentikan secara paksa proses switch setelah case cocok
            case "april": //ekspresi adalah april
                hari = 30; //april memiliki 30 hari
                break; //menghentikan secara paksa proses switch setelah case cocok
            case "mei": //ekspresi adalah mei
                hari = 31; //mei memiliki 31 hari
                break; //menghentikan secara paksa proses switch setelah case cocok
            case "juni": //ekspresi adalah juni
                hari = 30; //juni memiliki 30 hari
                break; //menghentikan secara paksa proses switch setelah case cocok
            case "juli": //ekspresi adalah juli
                hari = 31; //juli memiliki 31 hari
                break;  //menghentikan secara paksa proses switch setelah case cocok
            case "agustus": //ekpresi adalah agustus
                hari = 31; //agustus memiliki 31 hari
                break;  //menghentikan secara paksa proses switch setelah case cocok
            case "september": //ekspresi adalah agustus
                hari = 30; //september memiliki 30 hari
                break;  //menghentikan secara paksa proses switch setelah case cocok
            case "oktober": //ekspresi adalah oktober
                hari = 31; //oktober memiliki 31 hari
                break;  //menghentikan secara paksa proses switch setelah case cocok
            case "november": //ekspresi adalah november
                hari = 30; //november memiliki 30 hari
                break;  //menghentikan secara paksa proses switch setelah case cocok
            case "desember": //ekspresi adalh desember
                hari = 31; //desember memiliki 31 hari
                break; //menghentikan secara paksa proses switch setelah case cocok
            default:
                bulan = "invalid data"; //jika tidak ada input yang cocok dengan salah satu case,maka akan mencetak invalis data
                break; //menghentikan secara paksa proses switch setelah case cocok
        }
        System.out.println("jumlah hari di bulan " + bulan + " adalah " + hari + " hari"); //mencetak jumlah bulan dan hari
    } //menutup fungsi main
} //menutup fungsi class
