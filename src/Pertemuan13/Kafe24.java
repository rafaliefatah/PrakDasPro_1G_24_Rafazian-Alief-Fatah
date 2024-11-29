package Pertemuan13;

import java.util.Scanner;

public class Kafe24 {
    public static void Menu(String namaPelanggan,boolean isMember,String kodePromo){
        System.out.println("Selamat datang, "+namaPelanggan);
        if (kodePromo.equalsIgnoreCase("diskon50")) {
            System.out.println("Diskon 50%");
        } else if (kodePromo.equalsIgnoreCase("diskon30")) {
            System.out.println("Diskon 30%");
        } else {
           System.out.println("Invalid"); 
        }

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan");
    }
    public static int hitungTotalHarga24(int pilihanMenu,int banyakItem){
        int hargaItem[] = {15000,20000,22000,12000,10000,18000};
        int hargaTotal = hargaItem[pilihanMenu-1]*banyakItem;
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc24 = new Scanner(System.in);
        Menu("Andi",true,"DISKON50");

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc24.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc24.nextInt();

        int totalHarga = hitungTotalHarga24(pilihanMenu, banyakItem);
        System.out.println("Total harga untuk pesanan Anda: Rp "+totalHarga);
    }
}