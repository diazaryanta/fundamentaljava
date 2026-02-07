package org.example;

public class FunctionTest {

    public static void main(String[] args) {
        System.out.println("=== TEST CASE FUNCTION/METHOD ===\n");

        // Membuat Object baru agar bisa memanggil method non-static di bawah
        FunctionTest test = new FunctionTest();

        System.out.println("1. FUNCTION TANPA PARAMETER TANPA RETURN VALUE (void)");
        System.out.println("----------------------------------------------");

        // Memanggil method-method yang sudah dibuat
        //test.tampilkanSalam();
        //test.tampilkanGaris();
        //test.tampilkanInfoSekolah();

        System.out.println("2. FUNCTION DENGAN PARAMETER TANPA RETURN VALUE (void)");
        System.out.println("----------------------------------------------");

        test.sapaNama("Diaz");
        test.sapaNama("QA Dibimbing");

        System.out.println();

        test.tampilkanBiodata("Citra", 20, "Jakarta");
        test.tampilkanBiodata("Doni", 22, "Bandung");
        System.out.println("3. FUNCTION DENGAN RETURN VALUE (int)");
        System.out.println("----------------------------------------------");
        int hasilTambah = test.tambah(15, 10);
        System.out.println("15 + 10 = " + hasilTambah);

        int hasilKali = test.kali(7, 8);
        System.out.println("7 x 8 = " + hasilKali);

        System.out.println();

        String grade = test.tentukanGrade(88);
        System.out.println("Nilai: 88 -> Grade: " + grade);

        String grade2 = test.tentukanGrade(75);
        System.out.println("Nilai: 75 -> Grade: " + grade2);

        String grade3 = test.tentukanGrade(55);
        System.out.println("Nilai: 55 -> Grade: " + grade3);

        System.out.println(); // Jarak kosong

        boolean lulus = test.cekKelulusan(85);
        System.out.println("Nilai: 85");
        // Tanda tanya (?) adalah operator singkat untuk If-Else
        System.out.println("Status: " + (lulus ? "LULUS ✓" : "TIDAK LULUS ✕"));

        boolean tidakLulus = test.cekKelulusan(60);
        System.out.println("Nilai: 60");
        System.out.println("Status: " + (tidakLulus ? "LULUS ✓" : "TIDAK LULUS ✕"));

        System.out.println();
    }

    // Method 1: Menampilkan Salam
    public void tampilkanSalam() {
        System.out.println("  Selamat datang di Program Java!");
        System.out.println("  Kami adalah batch 3 QA");
    }

    // Method 2: Menampilkan Garis Pemisah
    public void tampilkanGaris() {
        System.out.println("  ============================================");
    }

    // Method 3: Menampilkan Info Sekolah
    public void tampilkanInfoSekolah() {
        System.out.println("  Nama Sekolah: Dibimbing.com");
        System.out.println("  Alamat: Jl. Pemrograman No. 123");
        System.out.println("  Telepon: (021) 12345678");
    }

    // Method 4: Sapa dengan Parameter
    public void sapaNama(String nama) {
        System.out.println("  Halo, " + nama + "! Selamat belajar Java!");
    }

    // Method 5: Biodata Lengkap
    public void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println("  === BIODATA ===");
        System.out.println("  Nama  : " + nama);
        System.out.println("  Umur  : " + umur + " tahun");
        System.out.println("  Kota  : " + kota);
        System.out.println("  ===============");
    }

    // Method 6: Test Matematika

    public int tambah(int a, int b) {
        return a + b;
    }

    // Method 7: Perkalian (Mengembalikan nilai angka/int)
    public int kali(int a, int b) {
        return a * b;
    }
    public String tentukanGrade(int nilai) {
        if (nilai >= 80) {
            return "A";
        } else if (nilai >= 70) {
            return "B";
        } else if (nilai >= 60) {
            return "C";
        } else {
            return "D";
        }
    }

    // Method 9: Cek Kelulusan (Mengembalikan Benar/Salah atau boolean)
    public boolean cekKelulusan(int nilai) {
        // Jika nilai lebih dari atau sama dengan 75, anggap Lulus (true)
        if (nilai >= 75) {
            return true;
        } else {
            return false;
        }
    }

}