package Pertemuan13;

import java.util.Scanner;

public class Kafe24 {
    public static void Menu(String namaPelanggan,boolean isMember){
        System.out.println("Selamat datang, "+namaPelanggan);

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
    public static int hitungTotalHarga24(int pilihanMenu,int banyakItem,String kodePromo){
        int hargaItem[] = {15000,20000,22000,12000,10000,18000};
        int hargaTotal = hargaItem[pilihanMenu-1]*banyakItem;
        if (kodePromo.equalsIgnoreCase("diskon50")) {
            System.out.println("Diskon 50%");
            hargaTotal = hargaTotal - (int) (hargaTotal*0.5);
        } else if (kodePromo.equalsIgnoreCase("diskon30")) {
            System.out.println("Diskon 30%");
            hargaTotal = hargaTotal - (int) (hargaTotal*0.3);
        } else {
           System.out.println("Invalid");
        }
        return hargaTotal;
    }
    public static void main(String[] args) {
        Scanner sc24 = new Scanner(System.in);
        Menu("Andi",true);
        boolean ulang = true;
        int totalSeluruh = 0;

        while (ulang = true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc24.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc24.nextInt();
            sc24.nextLine();
    
            int totalHarga = hitungTotalHarga24(pilihanMenu, banyakItem, "DISKON50");
            System.out.println("Total harga untuk pesanan Anda: Rp "+totalHarga);
            totalSeluruh+=totalHarga;
    
            System.out.print("Apakah anda ingin memesan lagi? (y/n): ");
            String pesanLagi = sc24.nextLine();
            if (pesanLagi.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("\nTotal keseluruhan pesanan: "+totalSeluruh);
    }
}