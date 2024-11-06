package Pertemuan10;

import java.util.Scanner;

public class ArrayRataNilai24 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner (System.in);
        int nilaiMhs[],lulus=0,tidakLulus=0, jumlahMhs;
        double totalLulus=0,totalTidakLulus=0,rataLulus,rataTidakLulus;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMhs = sc24.nextInt();
        nilaiMhs = new int [jumlahMhs];
        for (int i = 0; i < jumlahMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            nilaiMhs[i] = sc24.nextInt();
            if (nilaiMhs[i]>70) {
                totalLulus+=nilaiMhs[i];
                lulus++;
            } else {
                totalTidakLulus+=nilaiMhs[i];
                tidakLulus++;
            }
        }
        rataLulus = totalLulus/lulus;
        System.out.println("Rata-rata nilai lulus = "+rataLulus);
        rataTidakLulus = totalTidakLulus/tidakLulus;
        System.out.println("Rata-rata nilai tidak lulus = "+rataTidakLulus);
    }
}