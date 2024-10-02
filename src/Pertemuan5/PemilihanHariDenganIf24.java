package Pertemuan5;

import java.util.Scanner;

public class PemilihanHariDenganIf24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int hari;

        System.out.print("Masukkan angka: ");
        hari = sc.nextInt();

        if ((hari == 1) || (hari == 2) || (hari == 3) || (hari == 4) || (hari == 5)) {
            System.out.println("Weekday");
        } else if ((hari == 6) || (hari == 7)) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid number");
        }
    }
}