package Pertemuan9;

import java.util.Scanner;

public class RataNilai24 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner (System.in);
        int i,j,nilaiMhs;
        float totalNilai,rataNilai24;

        i=1;
        while (i<=5) {
            System.out.println("Input nilai mahasiswa ke-"+i);
            totalNilai=0;
            for (j = 1; j <=5; j++) {
                System.out.print("Nilai ke-"+j+" = ");
                nilaiMhs = sc24.nextInt();
                totalNilai+=nilaiMhs;
            }
            rataNilai24 = totalNilai/5;
            System.out.println("Rata-rata nilai mahasiswa ke-"+i+" adalah "+rataNilai24);
            i++;
        }
    }
}