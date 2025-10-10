package org.example;

import java.util.Scanner;

public class zodiac { //mendeklarasikan kelas utama yakni zodiac
    public static void main(String[] args) {
        Scanner zodiac = new Scanner(System.in);

        int tanggal, bulan; //deklarasi tangggal, bulan dengan tipe int
        String nama, alamat, bintang = "", sifat = ""; //deklarasi nama, alamat, bintang, sifat dengan tipe String

        System.out.print("masukkan nama: "); //masukkan nama
        nama = zodiac.nextLine(); //baca nama
        System.out.print("masukkan alamat: "); //masukkan alamat
        alamat = zodiac.nextLine(); //baca alamat
        System.out.print("masukkan tanngal lahir: "); //masukkan tanggal lahir
        tanggal = zodiac.nextInt(); //baca tanggal lahir
        System.out.print("masukkan bulan: "); //masukkan bulan
        bulan = zodiac.nextInt(); //baca bulan

        switch (bulan) { //menentukan zodiak berdasarkan bulan
            case 1: //bulan januari
                //menggunakan operator ternary untuk menentukan zodiak dan sifat berdasarkan tanggal yang diinputkan user
                bintang = (tanggal >= 20) ? "aquarius" : "capricorn"; //kondisi jika tanggal >=20 maka zodiak adalah aquarius, atau capricorn
                //kondisi jika tanggal >=20 maka sifat aquarius akan muncul, atau jika salah sifat capricorn akan muncul
                sifat = (tanggal >= 20) ? "independen, kreatif, humanis, visioner, dan inovatif" : "ambisius, pekerja keras, disiplin, dan bertanggung jawab";
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 2: //bulan februari
                bintang = (tanggal >= 19) ? "pisces" : "aquarius"; //kondisi jika tanggal >=19 maka zodiak adalah pisces, atau aquarius
                //kondisi jika tanggal >=19 maka sifat pisces akan muncul, atau jika salah sifat aquarius akan muncul
                sifat = (tanggal >= 19) ? "empati tinggi, penyayang, kreatif, dan imajinatif" : "independen, kreatif, humanis, visioner, dan inovatif";
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 3:
                bintang = (tanggal >= 21) ? "aries" : "pisces"; //kondisi jika tanggal >=21 maka zodiak adalah aries, atau pisces
                //kondisi jika tanggal >=20 maka sifat aries akan muncul, atau jika salah sifat pisces akan muncu
                sifat = (tanggal >= 21) ? "pemberani, ambisus, dan jiwa kepimpinan sangat kuat" : "empati tinggi, penyayang, kreatif, dan imajinatif";
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 4:
                bintang = (tanggal >= 20) ? "taurus" : "aries"; //kondisi jika tanggal >=20 maka zodiak adalah taurus, atau aries
                //kondisi jika tanggal >=20 maka sifat taurus akan muncul, atau jika salah sifat aries akan muncul
                sifat = (tanggal >= 20) ? "setia, sabar, mandiri, dan menyukai kenyamanan" : "pemberani, ambisus, dan jiwa kepimpinan sangat kuat";
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 5:
                bintang = (tanggal >= 21) ? "gemini" : "taurus"; //kondisi jika tanggal >=21 maka zodiak adalah gemini, atau taurus
                //kondisi jika tanggal >=21 maka sifat gemini akan muncul, atau jika salah sifat taurus akan muncul
                sifat = (tanggal >= 21) ? "cerdas, adaptif, konsisten, dan mudah bergaul" : "setia, sabar, mandiri, dan menyukai kenyamanan";
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 6:
                bintang = (tanggal >= 21) ? "cancer" : "gemini"; //kondisi jika tanggal >=21 maka zodiak adalah cancer, atau gemini
                //kondisi jika tanggal >=21 maka sifat cacer akan muncul, atau jika salah sifat gemini akan muncul
                sifat = (tanggal >= 21) ? "penyayang, intuisif, loyal, dan tekun" : "cerdas, adaptif, konsisten, dan mudah bergaul";
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 7:
                bintang = (tanggal >= 23) ? "leo" : "cancer"; //kondisi jika tanggal >=23 maka zodiak adalah leo, atau cancer
                //kondisi jika tanggal >=23 maka sifat leo akan muncul, atau jika salah sifat cancer akan muncul
                sifat = (tanggal >= 23) ? "percaya diri, penuh semangat, dan karismatik" : "penyayang, intuisif, loyal, dan tekun";
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 8:
                bintang = (tanggal >= 23) ? "virgo" : "leo"; //kondisi jika tanggal >=23 maka zodiak adalah virgo, atau leo
                //kondisi jika tanggal >=23 maka sifat virgo akan muncul, atau jika salah sifat leo akan muncul
                sifat = (tanggal >= 23) ? "perfeksionis, teliti, dan setia" : "percaya diri, penuh semangat, dan karismatik";
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 9:
                bintang = (tanggal >= 23) ? "libra" : "virgo"; //kondisi jika tanggal >=23 maka zodiak adalah libra, atau virgo
                //kondisi jika tanggal >=23 maka sifat libra akan muncul, atau jika salah sifat virgo akan muncul
                sifat = (tanggal >= 23) ? "adil, jujur, pendengar yang baik, dan kreatif" : "perfeksionis, teliti, dan setia";
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 10:
                bintang = (tanggal >= 23) ? "scorpio" : "libra"; //kondisi jika tanggal >=23 maka zodiak adalah scorpio, atau libra
                //kondisi jika tanggal >=23 maka sifat scorpio akan muncul, atau jika salah sifat libra akan muncul
                sifat = (tanggal >= 23) ? "misterius, tegas, loyal, dan cerdas" : "adil, jujur, pendengar yang baik, dan kreatif";
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 11:
                bintang = (tanggal >= 22) ? "sagitarius" : "scorpio"; //kondisi jika tanggal >=22 maka zodiak adalah sagitarius, atau scorpio
                //kondisi jika tanggal >=22 maka sifat sagitarius akan muncul, atau jika salah sifat scorpio akan muncul
                sifat = (tanggal >= 22) ? "optimis, setia, dan ceria" : "misterius, tegas, loyal, dan cerdas";
                break; //menghentikan secara paksa proses switch setelah case cocok
            case 12:
                bintang = (tanggal >= 22) ? "capricornus" : "sagitarius"; //kondisi jika tanggal >=22 maka zodiak adalah capricornus, atau sagitarius
                //kondisi jika tanggal >=22 maka sifat capricornus akan muncul, atau jika salah sifat sagitarius akan muncul
                sifat = (tanggal >= 22) ? "ambisius, pekerja keras, disiplin, dan bertanggung jawab" : "optimis, setia, dan ceria";
                break; //menghentikan secara paksa proses switch setelah case cocok
            default: //mengembalikan jika tidak ada kondisi yang terpenuhi
                //mencetak tidak ada bulan dan tanggal yang cocok...
                System.out.println("tidak ada bulan dan tanggal yang cocok, sehingga kamu kemungkinan entitas planet lain!!");
                return; //mengentikan eksekusi dan tidak akan mencetak print dibawahnya
        }
        System.out.println("nama kamu adalah " + nama); //mencetak nama
        System.out.println("kamu tinggal di " + alamat); //mencetak alamat
        System.out.println("kamu lahir di bulan " + bulan); //mencetak bulan
        System.out.println("dan tanggal " + tanggal); //mencetak tanggal
        System.out.println("maka zodiak kamu adalah " + bintang); //mencetak bintang
        System.out.println("dan sifat kamu itu " + sifat); //mencetak sifat
    } //menutup fungsi main
} //menutup fungsi class
