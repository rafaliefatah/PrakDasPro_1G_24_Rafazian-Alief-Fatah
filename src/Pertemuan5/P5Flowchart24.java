package Pertemuan5;

import java.util.Scanner;

public class P5Flowchart24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String namaMakanan;
        int hargaMakanan,jmlMakanan,totalBelanja,totalHrg;

        System.out.print("Makanan yang dipesan: ");
        namaMakanan = sc.nextLine();
        System.out.print("Jumlah yang dipesan: ");
        jmlMakanan = sc.nextInt();
        System.out.print("Harga makanan per porsi: ");
        hargaMakanan = sc.nextInt();

        totalBelanja = jmlMakanan * hargaMakanan;

        if (totalBelanja<100000) {
            totalHrg = totalBelanja;
            System.out.println("Total harga: " +totalHrg);
        } else if (totalBelanja>=100000 && totalBelanja<200000) {
            totalHrg = totalBelanja - (totalBelanja*2/100);
            System.out.println("Total harga: " +totalHrg);
        } else if (totalBelanja>=200000 && totalBelanja<500000) {
            totalHrg = totalBelanja - (totalBelanja*5/100);
            System.out.println("Total harga: " +totalHrg);
        } else {
            totalHrg =  totalBelanja - (totalBelanja*10/100);
            System.out.println("Total harga: " +totalHrg);
        }
    }
}