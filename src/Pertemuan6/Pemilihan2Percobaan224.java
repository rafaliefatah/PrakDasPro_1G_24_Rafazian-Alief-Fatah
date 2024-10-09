package Pertemuan6;

import java.util.Scanner;

public class Pemilihan2Percobaan224 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner (System.in);
        String member;
        int pilihan_menu;
        double diskon,harga,total_bayar;

        System.out.println("-----------------------------------------");
        System.out.println("============= MENU KAFE JTI =============");
        System.out.println("-----------------------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan angka dari menu yang anda pilih: ");
        pilihan_menu = input24.nextInt();
        input24.nextLine();
        System.out.print("Apakah anda punya member(y/n)? = ");
        member = input24.nextLine();
        System.out.println("-----------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.1;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu==1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = "+harga);
            } else  if (pilihan_menu==2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = "+harga);
            } else  if (pilihan_menu==3) {
                harga = 15000;
                System.out.println("Harga Bundling = "+harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga - (harga*diskon);
            System.out.println("Total bayar setelah diskon = "+total_bayar);

        } else if (member.equalsIgnoreCase("n")){
            if (pilihan_menu==1) {
                harga = 14000;
                System.out.println("Harga Ricebowl = "+harga);
            } else  if (pilihan_menu==2) {
                harga = 3000;
                System.out.println("Harga Ice Tea = "+harga);
            } else  if (pilihan_menu==3) {
                harga = 15000;
                System.out.println("Harga Bundling = "+harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            total_bayar = harga;
            System.out.println("Total bayar = "+total_bayar);
            
        } else {
            System.out.println("Member tidak valid");
        }
    }
}