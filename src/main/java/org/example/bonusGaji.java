package org.example;

import java.util.Scanner;

public class bonusGaji { //mendeklarasikan kelas utama yakni bonusGaji
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //membuat objek Scanner

        String golongan; //deklarasi golongan bertipe String
        int masaKerja; //deklarasi masaKerja bertipe int
        double gajiPokok, persen = 0, Bonus=0; //deklarasi gajiPokok, persen, dan Bonus bertipe double, dan inisialisasi value 0

        System.out.print("masukkan gaji pokok: "); //input gaji pokok
        gajiPokok = input.nextDouble(); //baca gajiPokok
        input.nextLine(); //berfungsi agar user dapat menginputkan gaji pokok, jika tidak ada ini maka kode akan menjalankan baris berikutnya

        System.out.print("masukkan golongan: "); //input golongan
        golongan = input.nextLine(); //baca golongan

        System.out.print("Masa kerja: "); //input masa kerja
        masaKerja = input.nextInt(); //baca masa kerja

        if (masaKerja < 0 || masaKerja > 30) { //kondisi masa kerja 0-30 tahun
            System.out.println("Masa kerja tidak valid!"); //mencetak jika masa kerja tidak valid
            return; //mengembalikan nilai
        }

        switch (golongan) {  //menentukan golongan
            case "I": //golongan I
                if (masaKerja <= 10) persen = 50; //kondisi jika masa kerja <=10 maka jumlah bonus adalah 50%
                else if (masaKerja <= 20) persen = 60; //kondisi jika masa kerja <=20 maka jumlah bonus adalah 60%
                else persen = 70; //kondisi jika masa kerja <=30 maka jumlah bonus adalah 70%
                break; //menghentikan secara paksa proses switch setelah case cocok

            case "II": //golongan II
                if (masaKerja <= 10) persen = 60; //kondisi jika masa kerja <=10 maka jumlah bonus adalah 60%
                else if (masaKerja <= 20) persen = 70; //kondisi jika masa kerja <=10 maka jumlah bonus adalah 70%
                else persen = 80; //kondisi jika masa kerja <=10 maka jumlah bonus adalah 80%
                break; //menghentikan secara paksa proses switch setelah case cocok

            case "III": //golongan III
                if (masaKerja <= 10) persen = 70; //kondisi jika masa kerja <=10 maka jumlah bonus adalah 70%
                else if (masaKerja <= 20) persen = 80; //kondisi jika masa kerja <=10 maka jumlah bonus adalah 80%
                else persen = 90; //kondisi jika masa kerja <=10 maka jumlah bonus adalah 90%
                break; //menghentikan secara paksa proses switch setelah case cocok

            case "IV": //golongan IV
                if (masaKerja <= 10) persen = 80; //kondisi jika masa kerja <=10 maka jumlah bonus adalah 80%
                else if (masaKerja <= 20) persen = 90; //kondisi jika masa kerja <=10 maka jumlah bonus adalah 90%
                else persen = 100; //kondisi jika masa kerja <=10 maka jumlah bonus adalah 100%
                break; //menghentikan secara paksa proses switch setelah case cocok

            default:  //mengembalikan jika tidak ada kondisi yang terpenuhi
                System.out.println("Golongan tidak valid!"); //mencetak golongan tidak valid
                return; //mengentikan eksekusi dan tidak akan mencetak print dibawahnya
        }

        double bonusAkhir = gajiPokok * (persen / 100); //menghitung bonusAkhir dengan rumus gajiPokok * (persen/100)
        double total = gajiPokok + bonusAkhir; //menghitung total dengan rumus gajiPokok + bonusAkhir

        System.out.println("Golongan: " + golongan); //mencetak golongan
        System.out.println("Masa kerja : " + masaKerja + " tahun"); //mencetak masaKerja
        System.out.println("Persentase bonus   : " + persen + " %"); //mencetak besaran persen
        System.out.println("Bonus akhir tahun  : Rp " + bonusAkhir); //mencetak bonus akhir
        System.out.println("Total gaji akhir tahun: Rp " + total); //mencetak total
    } //menutup fungsi main
} //menutup fungsi class
