package org.example;


public class MethodTest {


    public static void main(String[] args) {
        System.out.println("=== TEST CASE METHOD ===\n");


        MethodTest test = new MethodTest();


        System.out.println("1. METHOD TANPA PARAMETER DAN TANPA RETURN VALUE (void)");
        System.out.println("   -----------------------------------------------------");
        test.tampilkanJudul();
        test.cetakPesanSelamatDatang();
        test.tampilkanTanggalHariIni();
        System.out.println();




        // Contoh pemanggilan method dengan parameter Boolean
        boolean dewasa = test.cekUsiaDewasa(20);
        System.out.println("Umur 20 tahun → Status: " + (dewasa ? "Dewasa" : "Belum Dewasa"));


        //Method Overloading dengan return value
        System.out.println("3. METHOD OVERLOADING (Nama Method Sama, Parameter Beda)");
        System.out.println("   -----------------------------------------------------");
        System.out.println("   Contoh: Method hitung() dengan berbagai parameter\n");


        System.out.println("   a. Menghitung luas persegi:");
        int luasPersegi = test.hitung(5);
        System.out.println("      Sisi = 5 cm");
        System.out.println("      Luas = " + luasPersegi + " cm²");
        System.out.println();


        System.out.println("   b. Menghitung luas persegi panjang:");
        int luasPersegiPanjang = test.hitung(8, 6);
        System.out.println("      Panjang = 8 cm, Lebar = 6 cm");
        System.out.println("      Luas = " + luasPersegiPanjang + " cm²");
        System.out.println();


        //Method Overloading tanpa return value
        System.out.println("   Contoh: Method tampilkanInfo() dengan berbagai parameter\n");


        System.out.println("   a. Info dengan nama saja:");
        test.tampilkanInfo("Ani");
        System.out.println();


        System.out.println("   b. Info dengan nama dan umur:");
        test.tampilkanInfo("Budi", 22);
        System.out.println();


    }


    public void tampilkanJudul() {
        System.out.println("Halo semua warga QA ! ");
    }


    public void cetakPesanSelamatDatang() {
        System.out.println("   Selamat datang di kelas pemrograman!");
        System.out.println("   Mari belajar tentang Method di Java");
    }


    public void tampilkanTanggalHariIni() {
        System.out.println("   Tanggal: 1 Februari 2026");
        System.out.println("   Hari: Minggu");
    }




    public boolean cekUsiaDewasa(int umur) {
        return umur >= 17;
    }


    //Method Overloading dengan return value

    public int hitung(int sisi) {
        System.out.println("      → Menghitung luas persegi");
        return sisi * sisi;
    }


    public int hitung(int panjang, int lebar) {
        System.out.println("      → Menghitung luas persegi panjang");
        return panjang * lebar;
    }




    //Method Overloading tanpa return value


    public void tampilkanInfo(String nama) {
        System.out.println("      Nama: " + nama);
    }


    public void tampilkanInfo(String nama, int umur) {
        System.out.println("      Nama: " + nama);
        System.out.println("      Umur: " + umur + " tahun");
    }
}
