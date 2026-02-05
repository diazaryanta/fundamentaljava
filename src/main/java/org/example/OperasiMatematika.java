package org.example;

public class OperasiMatematika {
    public static void main(String[] args) {
        System.out.println("===== TEST OPERASI INTEGER =====\n");


        testPenjumlahan();
        //testPengurangan();
        //testPerkalian();
        //testPembagian();
        //testSisaBagi();


        System.out.println("\n===== TEST INTEGER SELESAI! =====");
    }


    private static void testPenjumlahan() {
        System.out.println("TEST PENJUMLAHAN:");


        int hasil1 = KalkulatorSederhana.tambah(10, 5);
        System.out.println("  10 + 5 = " + hasil1);


        int hasil2 = KalkulatorSederhana.tambah(100, 50);
        System.out.println("  100 + 50 = " + hasil2);


        int hasil3 = KalkulatorSederhana.tambah(-10, 5);
        System.out.println("  -10 + 5 = " + hasil3);


        System.out.println();
    }


    private static void testPengurangan() {
        System.out.println("TEST Pengurangan:");


        int hasil1 = KalkulatorSederhana.kurang(10, 5);
        System.out.println("  10 - 5 = " + hasil1);


        int hasil2 = KalkulatorSederhana.kurang(100, 50);
        System.out.println("  100 - 50 = " + hasil2);


        int hasil3 = KalkulatorSederhana.kurang(-10, 5);
        System.out.println("  -10 - 5 = " + hasil3);


        System.out.println();
    }

}
