package org.example;

public class SwitchCaseExercise {
    public static void main(String[] args) {
        jalankanVendingMachine();
    }
    static void jalankanVendingMachine() {

        int nomorTombol = 1;

        System.out.println("=== VENDING MACHINE MINUMAN ===");
        System.out.println("1. Coca Cola");
        System.out.println("2. Sprite");
        System.out.println("3. Fanta");
        System.out.println("-----------------------------");
        System.out.println("Tombol yang ditekan: " + nomorTombol);

        switch (nomorTombol) {
            case 1:
                System.out.println("Keluar: Coca Cola (Rp 5.000)");
                break;

            case 2:
                System.out.println("Keluar: Sprite (Rp 4.500)");
                break;

            case 3:
                System.out.println("Keluar: Fanta (Rp 4.500)");
                break;

            default:
                System.out.println("Error: Minuman tidak tersedia!");
                break;
        }

        System.out.println();
    }

}