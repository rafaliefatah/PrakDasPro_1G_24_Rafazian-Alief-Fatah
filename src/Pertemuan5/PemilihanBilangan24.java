package Pertemuan5;

import java.util.Scanner;

public class PemilihanBilangan24 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan sebuah angka: ");
        angka = sc.nextInt();

        if(angka % 2 == 0){
            System.out.println("Angka "+angka+" termasuk angka genap");
        }else{
            System.out.println("Angka "+angka+" termasuk angka ganjil");
        }
    }
}