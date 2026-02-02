package org.example;

    public class SwitchCaseExercise {
        public static void main(String[] args) {
            System.out.println("=== TEST CASE SWITCH CASE ===\n");

            contohSwitchHari();
        /*contohSwitchBulan();
        contohSwitchMenu();
        contohSwitchNilai();
        contohSwitchTipeKendaraan();*/
        }

        static void contohSwitchHari() { //
            System.out.println("1. SWITCH CASE - HARI DALAM SEMINGGU");

            int nomorHari = 8;
            String namaHari;

            System.out.println("   Nomor hari: " + nomorHari);
            System.out.print("   Nama hari: ");

            switch (nomorHari) {
                case 1: //jika nomorHari bernilai 1 maka akan return Senin, jika tidak lanjut ke case berikutnya
                    namaHari = "Senin";
                    break;
                case 2: //jika nomorHari bernilai 2 maka akan return Selasa, jika tidak lanjut ke case berikutnya
                    namaHari = "Selasa";
                    break;
                case 3: //jika nomorHari bernilai 3 maka akan return Rabu, jika tidak lanjut ke case berikutnya
                    namaHari = "Rabu";
                    break;
                case 4: //jika nomorHari bernilai 3 maka akan return Rabu, jika tidak lanjut ke case berikutnya
                    namaHari = "Kamis";
                    break;
                case 5: //jika nomorHari bernilai 3 maka akan return Rabu, jika tidak lanjut ke case berikutnya
                    namaHari = "Jumat";
                    break;
                case 6: //jika nomorHari bernilai 3 maka akan return Rabu, jika tidak lanjut ke case berikutnya
                    namaHari = "Sabtu";
                    break;
                case 7: //jika nomorHari bernilai 3 maka akan return Rabu, jika tidak lanjut ke case berikutnya
                    namaHari = "Minggu";
                    break;
                default: //jika nomorHari tidak sesuai dengan case manapun, maka akan masuk ke default
                    namaHari = "Hari tidak valid";
                    break;
            }

            System.out.println(namaHari);
            System.out.println();
        }
    }
