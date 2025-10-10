package org.example;

public class switchDemo { //deklarasi kelas utama yakni switchDemo
    public static void main(String[] args) {
        int month = 8; //deklarasi variabel month dengan tipe int dan memberi value 8
        String monthString; //deklarasi monthString
        switch (month) { //menentukan month
            case 1:
                monthString = "januari"; //jika month memiliki value 1, maka akan menampilkan januari
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 2:
                monthString = "februari"; //jika month memiliki value 2, maka akan menampilkan februari
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 3:
                monthString = "maret"; //jika month memiliki value 3, maka akan menampilkan maret
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 4:
                monthString = "april"; //jika month memiliki value 4, maka akan menampilkan april
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 5:
                monthString = "mei"; //jika month memiliki value 5, maka akan menampilkan mei
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 6:
                monthString = "juni"; //jika month memiliki value 6, maka akan menampilkan juni
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 7:
                monthString = "juli"; //jika month memiliki value 7, maka akan menampilkan juli
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 8:
                monthString = "agustus"; //jika month memiliki value 8, maka akan menampilkan agustus
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 9:
                monthString = "september"; //jika month memiliki value 9, maka akan menampilkan september
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 10:
                monthString = "oktober"; //jika month memiliki value 10, maka akan menampilkan oktober
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 11:
                monthString = "november"; //jika month memiliki value 11, maka akan menampilkan november
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 12:
                monthString = "desember"; //jika month memiliki value 12, maka akan menampilkan desember
                break; //menghentikan secara paksa proses switch setelah case cocok
            default:
                monthString = "invalid month";
                break; //menghentikan secara paksa proses switch setelah case cocok
        }
        System.out.println(monthString); //mencetak monthString
    } //menutup fungsi main
} //menutup fungsi class

