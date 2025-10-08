package org.example;

import java.util.Scanner;

public class kaos { //mendeklarasikan kelas utama yakni kaos
    public static void main(String[] args) {
        Scanner Kaos = new Scanner(System.in);

        String ukuran = ""; //mendeklarasikan ukuran dengan tipe String
        int harga = 0, total, jumlah = 0; //mendeklarasikan harga, total, dan jumlah dengan tipe int

        System.out.print("masukkan ukuran: ");
        ukuran=Kaos.nextLine();
        System.out.print("masukkan jumlah: ");
        jumlah=Kaos.nextInt();

        switch (ukuran){ //mengevaluasi ekspresi ukuran
            case "S": //ekspresi adalah S
                harga=30000; //value adalah 30000
                break; //berhenti paksa
            case "M":
                harga=38000;
                break;
            case "L":
                harga=45000;
                break;
            case "XL":
                harga=50000;
                break;
            case "XXL":
                harga=60000;
                break;
            default: ukuran = "invalid"; //
            break;
        }

        total = jumlah * harga;
        
        System.out.println("harga kaos adalah: "+total);
    }
}
