package Pertemuan3;

import java.util.Scanner;

public class Siakad24 {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
         String nama,nim,kelas;
         byte absen;
         double nilaiKuis,nilaiTugas,nilaiUTS,nilaiUAS,nilaiAkhir;
         float bobotNilaiKuis = 20 / 100f,bobotNilaiTugas = 15 / 100f,bobotNilaiUTS = 30 / 100f,bobotNilaiUAS = 35 / 100f;

            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan NIM: ");
            nim = sc.nextLine();
            System.out.print("Masukkan kelas: ");
            kelas = sc.nextLine();
            System.out.print("Masukkan absen: ");
            absen = sc.nextByte();
            System.out.print("Masukkan nilai kuis: ");
            nilaiKuis = sc.nextDouble();
            System.out.print("Masukkan nilai tugas: ");
            nilaiTugas = sc.nextDouble();
            System.out.print("Masukkan nilai UTS: ");
            nilaiUTS = sc.nextDouble();
            System.out.print("Masukkan nilai UAS: ");
            nilaiUAS = sc.nextDouble();
            
            nilaiAkhir = (nilaiKuis*bobotNilaiKuis) + (nilaiTugas*bobotNilaiTugas) + (nilaiUTS*bobotNilaiUTS) + (nilaiUAS*bobotNilaiUAS);

            System.out.println("Nama: "+nama+ "     NIM: "+nim);
            System.out.println("Kelas: "+kelas+ "   Absen: "+absen);
            System.out.println("Nilai Akhir: "+nilaiAkhir);
    }
}