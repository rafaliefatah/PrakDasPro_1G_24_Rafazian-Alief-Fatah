package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan324 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner (System.in);
        String kategori;
        int penghasilan,gajiBersih;
        double pajak=0;

        System.out.print("Masukkan kategori: ");
        kategori = input24.nextLine();
        System.out.print("Masukkan besarnya penghasilan: ");
        penghasilan = input24.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000) {
                pajak = 0.1;
            } else if (penghasilan <= 3000000) {
                pajak = 0.15;
            } else {
                pajak = 0.2;
            }
            gajiBersih = (int) (penghasilan - (penghasilan*pajak));
            System.out.println("Penghasilan bersih: "+gajiBersih);

        } else if (kategori.equalsIgnoreCase("pebisnis")) {
            if (penghasilan <= 2500000) {
                pajak = 0.15;
            } else if (penghasilan <= 3500000) {
                pajak = 0.2;
            } else {
                pajak = 0.25;
            }
            gajiBersih = (int) (penghasilan - (penghasilan*pajak));
            System.out.println("Penghasilan bersih: "+gajiBersih);
            
        } else {
            System.out.println("Masukan kategori salah");
        }
    }
}