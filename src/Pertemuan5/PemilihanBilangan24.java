package Pertemuan5;

import java.util.Scanner;

public class PemilihanBilangan24 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan sebuah angka: ");
        angka = sc.nextInt();

        String hasil;
        hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println(angka+" adalah "+hasil);
    }
}