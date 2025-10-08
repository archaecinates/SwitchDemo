package org.example;

import java.util.Scanner;

public class bonusGaji {
    public static void main(String[] args) {
        Scanner bonus=new Scanner(System.in);

        String golongan;
        int masaKerja;
        double gajiPokok, persen, Bonus=0;

        System.out.print("Gaji pokok: ");
        gajiPokok=bonus.nextDouble();
        System.out.print("golongan: ");
        golongan=bonus.nextLine();
        System.out.print("masa kerja: ");
        masaKerja=bonus.nextInt();

        if (masaKerja >=0 && masaKerja <=10){
            Bonus=0.50;
        }else if (masaKerja >=11 && masaKerja <=20){
            Bonus=0.60;
        }else{
            Bonus=0.70;
        }if (masaKerja >=0 && masaKerja<=10){
            Bonus=0.60;
        }else if(masaKerja >=11 && masaKerja<=20){
            Bonus=0.70;
        }else{
            Bonus=0.80;
        }


        switch (golongan){
            case "I":
                persen = 0.50;
                break;
            case "II":
                persen = 0.60;
                break;
            case "III":
                persen = 0.70;
                break;
            case "IV":
                persen = 0.80;
            default: masaKerja = 0;
        }



        System.out.println("dsbuwegfyw" +Bonus);
    }
}
