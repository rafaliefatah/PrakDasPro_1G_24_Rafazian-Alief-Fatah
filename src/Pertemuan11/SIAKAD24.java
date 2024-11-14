package Pertemuan11;

import java.util.Scanner;

public class SIAKAD24 {
    public static void main(String[] args) {
       Scanner sc24 = new Scanner(System.in);
       int siswa,matkul;
       System.out.println("Masukkan jumlah siswa: ");
       siswa = sc24.nextInt();
       System.out.println("Masukkan jumlah mata kuliah: ");
       matkul = sc24.nextInt();
       int nilai[][] = new int [siswa][matkul];

       for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-"+(i+1)+":");
            double totalPerSiswa=0;
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah ke-"+(j+1)+": ");
                nilai[i][j] = sc24.nextInt();
                totalPerSiswa+=nilai[i][j];
            }
            System.out.println("Nilai rata-rata: "+totalPerSiswa/nilai[0].length);
        }
        System.out.println("\n=========================================");
        System.out.println("Rata-rata nilai setiap mata kuliah");

        for (int j = 0; j < nilai[0].length; j++) {
            double totalPerMatkul=0;
            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul+=nilai[i][j];
            }
            System.out.println("Mata kuliah ke-"+(j+1)+": "+totalPerMatkul/nilai.length);
        }
    }
}