package org.example;

import java.util.Scanner;

public class jumlahHari {
    public static void main(String[] args) {
        Scanner Hari=new Scanner(System.in);

        int hari=0; //deklarasi hari tipe int
        String bulan; //deklarasi bulan tipe string

        System.out.print("masukkan bulan: ");
        bulan=Hari.nextLine();

        switch (bulan.toUpperCase()){ //mengevaluasi bulan
            case "januari": //ekspresi adalah januari
            hari=31; //value adalah 31
            break; //berhenti paksa
            case "februari":
                hari=28;
                break;
            case "maret":
                hari=31;
                break;
            case "april":
                hari=30;
                break;
            case "mei":
                hari=31;
                break;
            case "juni":
                hari=30;
                break;
            case "juli":
                hari=31;
                break;
            case "agustus":
                hari=30;
                break;
            case "september":
                hari=31;
                break;
            case "oktober":
                hari=30;
                break;
            case "november":
                hari=31;
                break;
            case "desember":
                hari=31;
                break;
            default: bulan = "invalid data";
            break;
        }
        System.out.println("jumlah hari di bulan "+bulan +" adalah "+hari +" hari"); //mencetak jumlah bulan dan hari
    }
}
