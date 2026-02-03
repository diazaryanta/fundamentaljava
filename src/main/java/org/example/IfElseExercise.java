package org.example;

public class IfElseExercise {
    public static void main(String[] args) {
        System.out.println("=== TEST CASE IF-ELSE ===\n");

        //contohSingleIf();
        contohIfElse();
        //contohIfElseIfElse();
        //contohNestedIf();
    }

    static void contohSingleIf() {
        System.out.println("1. SINGLE IF");
        System.out.println("   Cek apakah umur sudah 17 tahun (boleh buat KTP)");

        int umur = 15;
        System.out.println("   Umur: " + umur);

        if (umur >= 17) {
            System.out.println("     ✓ Anda boleh membuat KTP");
        }
        System.out.println();
    }

    static void contohIfElse() {
        System.out.println("2. IF-ELSE STATEMENT");
        System.out.println("   Cek kelulusan ujian (nilai minimal 70)");

        int nilai = 80;
        System.out.println("   Umur: " + nilai);

        if (nilai >= 70) {
            System.out.println( "✓ LULUS - selamat, Anda berhasil!");
        } else  {
            System.out.println("x TIDAK LULUS - coba lagi tahun depan");
        }
    }
}
