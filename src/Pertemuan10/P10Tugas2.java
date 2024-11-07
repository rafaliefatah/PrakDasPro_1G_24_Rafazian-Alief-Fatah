package Pertemuan10;

import java.util.Scanner;

public class P10Tugas2 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner (System.in);
        int jmlPesanan,arrPesanan[];
        double arrHarga[],harga,totalHarga=0;
        String namaPesanan,daftarPesanan="";

        System.out.print("Masukkan jumlah pesanan: ");
        jmlPesanan = sc24.nextInt();
        sc24.nextLine();
        arrPesanan = new int[jmlPesanan];
        arrHarga = new double[jmlPesanan];
        
        for (int i = 0; i < arrPesanan.length; i++) {
            System.out.print("Masukkan nama makanan / minuman ke-"+(i+1)+": ");
            namaPesanan = sc24.nextLine();
            daftarPesanan+=namaPesanan+"\n";
        }
        for (int i = 0; i < arrHarga.length; i++) {
            System.out.print("Masukkan harga makanan / minuman ke-"+(i+1)+": ");
            harga = sc24.nextDouble();
            totalHarga+=harga;
        }
        System.out.println("\nDaftar pesanan: \n"+daftarPesanan);
        System.out.print("Total harga: "+totalHarga);
    }
}
