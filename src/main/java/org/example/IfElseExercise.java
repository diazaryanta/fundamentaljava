package org.example;

public class IfElseExercise {
    public static void main(String[] args) {

        //Hapus tanda "//" di depan method yang ingin dijalankan:

        //testAngka();
        //testCekCuaca();
        cekBaterai();
        //cekPromoKingVapeStore();
    }
    //single-If
    static void testAngka() {
        if (20 > 18) {
            System.out.println("10 itu lebih besar dari 8"); // obviously
        }
    }
    //If-Else
    static void testCekCuaca() {
        int cuaca = 3; // 1 = Hujan, 2 = cerah, 3 = berawan

        if (cuaca == 1) {
            System.out.println("Bawa payung.");
        } else if (cuaca == 2) {
            System.out.println("Pakai kacamata hitam.");
        } else {
            System.out.println("Keluar rumah seperti biasa.");
        }
    }

    //If-Else-If-Else
    static void cekBaterai() {
        int baterai = 0; /*coba ganti angka ini: 100, 80, 30, atau 5*/

        System.out.println("=== STATUS BATERAI HP ===");
        System.out.println("Persentase: " + baterai + "%");

        if (baterai == 100) {
            System.out.println("baterai udah full, cabut aja.");

        } else if (baterai >= 50) {
            System.out.println("masih kuat sejam lagi.");

        } else if (baterai >= 20) {
            System.out.println("baterai udah low cepet cari casan.");

        } else {
            System.out.println("matot. Cari charger sekarang!!!");
        }

        System.out.println();
    }

    //Nested If
    static void cekPromoKingVapeStore() {
        boolean isMember = true;   /*coba ganti jadi true/false*/
        int totalBelanja = 1000000;  /*coba ganti jadi diatas 50000/dibawah 50000*/

        System.out.println("=== SISTEM PROMO TOKO ===");

        if (isMember == true) {
            System.out.println("1. kartu member terdeteksi.");

            if (totalBelanja > 50000) {
                System.out.println("2. selamat kamu mendapetkan liquid 150ml.");
            } else {
                System.out.println("2. belanjaan kurang banyak, belanja lagi gih.");
            }

        } else {
            System.out.println("Promo ini khusus Member King Vape Store saja.");
        }
    }
}