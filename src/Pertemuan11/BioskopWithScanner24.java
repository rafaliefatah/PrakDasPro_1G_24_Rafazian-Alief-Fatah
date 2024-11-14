package Pertemuan11;

import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner(System.in);
        int baris,kolom;
        String nama,next,penonton[][] = new String [4][2];

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc24.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc24.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc24.nextInt();
            sc24.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc24.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
