package Pertemuan10;

import java.util.Scanner;

public class ArrayNilai24 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner (System.in);
        int nilaiAkhir[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Masukkan nilai akhir ke-"+i+": ");
            nilaiAkhir[i] = sc24.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
        }
    }
}