package org.example;

public class LoopingExercise {

    public static void main(String[] args) {

        //ForLoop();
        WhileLoop();
    }
//SampleForLoop
    static void ForLoop() {
        System.out.println("=== MULAI FOR LOOP ===");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }
        System.out.println("For Loop Selesai.");
    }
//SampleWhileLoop
    static void WhileLoop() {
        System.out.println("=== MULAI WHILE LOOP ===");
        int bensin = 5;
        while (bensin > 0) {
            System.out.println("Menyalakan mesin... Sisa bensin: " + bensin + " liter");
            bensin--;
        }
        System.out.println("Mobil mogok! Bensin habis.");
    }
}
