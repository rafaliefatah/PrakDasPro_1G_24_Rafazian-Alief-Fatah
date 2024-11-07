package Pertemuan10;

import java.util.Scanner;

public class P10Tugas1 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner (System.in);
        int nilaiMhs[],banyakNilai,nilaiTertinggi=0,nilaiTerendah=100,totalNilai=0;
        double rataNilai;

        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        banyakNilai = sc24.nextInt();
        nilaiMhs = new int[banyakNilai];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiwa ke-"+(i+1)+": ");
            nilaiMhs[i] = sc24.nextInt();
            totalNilai+=nilaiMhs[i];
            if (nilaiMhs[i]> nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerendah) {
                nilaiTerendah = nilaiMhs[i];
            }    
        }
        rataNilai = totalNilai/banyakNilai;
        System.out.println("Rata-rata nilai mahasiswa = "+rataNilai);
        System.out.println("Nilai tertinggi = "+nilaiTertinggi);
        System.out.println("Nilai terendah = "+nilaiTerendah);
        System.out.print("Nilai mahasiswa = ");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print(nilaiMhs[i]+" ");    
        }
    }
}