package Pertemuan13;

import java.util.Scanner;

public class PenjualanKafe {
    static String namaMenu[] = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static String hari[] = {"Hari ke 1", "Hari ke 2", "Hari ke 3", "Hari ke 4", "Hari ke 5", "Hari ke 6", "Hari ke 7"};
    static int penjualanMenu[][] = {
        {20,20,25,20,10,60,10},
        {30,80,40,10,10,20,25},
        {5,9,20,25,10,5,45},
        {50,8,17,18,10,30,6},
        {15,10,16,15,10,10,55}
    };

    public static void editData(int menu, int hari, int jumlah) {
        penjualanMenu[menu-1][hari-1] = jumlah;
        System.out.print("\nData penjualan ");
        if (menu==1) {
            System.out.print("kopi");
        } else if (menu==2) {
            System.out.print("teh");
        } else if (menu==3) {
            System.out.print("es degan");
        } else if (menu==4) {
            System.out.print("roti bakar");
        } else {
            System.out.println("gorengan");
        }
        System.out.println(" untuk hari ke-"+hari+" diedit menjadi "+jumlah+"\n");
    }
    
    public static void tampilData() {
        System.out.println("\n===== Data Penjualan Kafe =====");
        System.out.print("\t");
        for (int i = 0; i < hari.length; i++) {
            System.out.print("\t     " + hari[i]);
        }
        System.out.println();
        for (int i = 0; i < namaMenu.length; i++) {
            System.out.print(namaMenu[i] + "\t");
            if (i==0 || i==1) {
                System.out.print("\t");
            }
            for (int j = 0; j < penjualanMenu[i].length; j++) {
                System.out.print("|\t" + penjualanMenu[i][j] + "\t");
            }
            System.out.println("|");
        }
        System.out.println();
    }

    public static void menuTertinggi() {
        int maxJual = 0;
        String namaMenuTertinggi = "";
        for (int i = 0; i < namaMenu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualanMenu[i].length; j++) {
                total += penjualanMenu[i][j];
            }
            if (total>maxJual) {
                maxJual = total;
                namaMenuTertinggi = namaMenu[i];
            }
        }
        System.out.println("\nMenu dengan penjualan tertinggi adalah: "+namaMenuTertinggi+"\n");
    }

    public static void rataPenjualan() {
        System.out.println("\nRata-rata penjualan untuk setiap menu:");
        for (int i = 0; i < namaMenu.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualanMenu[i].length; j++) {
                total+=penjualanMenu[i][j];
            }
            double rata =  total/penjualanMenu[i].length;
            System.out.println(namaMenu[i]+": "+rata);
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc24 = new Scanner(System.in);
        int pilihanMenu;
        do {
            System.out.println("===== Menu Penjualan Kafe =====");
            System.out.println("1. Mengedit data penjualan");
            System.out.println("2. Menampilkan data penjualan");
            System.out.println("3. Menampilkan menu yang memiliki penjualan tertinggi");
            System.out.println("4. Menampilkan rata-rata penjualan setiap menu");
            System.out.println("5. Keluar dari menu");
            System.out.print("Pilih menu: ");
            pilihanMenu = sc24.nextInt();

            if (pilihanMenu==1) {
                System.out.println("\n===== Edit data penjualan =====");
                for (int i = 0; i < namaMenu.length; i++) {
                    System.out.println((i + 1) + ". " + namaMenu[i]);
                }
                System.out.print("Masukkan menu untuk diedit: ");
                int pilihMenu = sc24.nextInt();
                System.out.print("Masukkan hari: ");
                int hari = sc24.nextInt();
                System.out.print("Masukkan jumlah penjualan baru: ");
                int jumlah = sc24.nextInt();
                editData(pilihMenu, hari, jumlah);
                continue;
            } else if (pilihanMenu==2) {
                tampilData();
                continue;
            } else if (pilihanMenu==3) {
                menuTertinggi();
                continue;
            } else if (pilihanMenu==4) {
                rataPenjualan();
                continue;
            } else if (pilihanMenu==5) {
                break;
            } else {
                System.out.println("\nPilihan tidak tersedia. Masukkan kembali\n");
                continue;
            }
            
        } while (pilihanMenu != 5);
    }
}