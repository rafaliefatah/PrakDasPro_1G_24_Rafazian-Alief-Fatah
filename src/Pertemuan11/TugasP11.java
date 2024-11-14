package Pertemuan11;

import java.util.Scanner;

public class TugasP11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai[][] = new int [10][6];
        double rataResponden,rataPertanyaan,rataSeluruh,totalRata=0;

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Responden ke-"+(i+1));
            double totalPerResponden=0;
            int j=0;
            while (j < nilai[i].length) {
                System.out.print("Masukkan nilai (1-5) ke-"+(j+1)+": ");
                nilai[i][j] = sc.nextInt();
                if (nilai[i][j]>5 || nilai[i][j]<1) {
                    System.out.println("Nilai tidak sesuai");
                    continue;
                }
                totalPerResponden+=nilai[i][j];
                j++;
            }
            rataResponden = totalPerResponden/nilai[0].length;
            System.out.println("Rata-rata responden ke-"+(i+1)+": "+rataResponden);
            totalRata+=rataResponden;    
        }
        System.out.println("==================================================");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerPertanyaan=0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerPertanyaan+=nilai[i][j];
            }
            rataPertanyaan = totalPerPertanyaan/nilai.length;
            System.out.println("Rata-rata pertanyaan ke-"+(j+1)+": "+rataPertanyaan);
        }
        System.out.println("==================================================");
        rataSeluruh = totalRata/nilai.length;
        System.out.println("Rata-rata keseluruhan: "+rataSeluruh);
    }
}
