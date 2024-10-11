package Pertemuan7;

import java.util.Scanner;

public class KafeDoWhile24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int kopi,teh,roti,hargaKopi=12000,hargaTeh=7000,hargaRoti=20000;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (Ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            int totalHarga = (kopi*hargaKopi) + (teh*hargaTeh) + (roti*hargaRoti);
            System.out.println("Harga yang harus dibayar: Rp "+totalHarga);
            sc.nextLine();

        } while (true);
    }
}