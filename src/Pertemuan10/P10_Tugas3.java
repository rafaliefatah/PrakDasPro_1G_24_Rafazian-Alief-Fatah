package Pertemuan10;

import java.util.Scanner;

public class P10_Tugas3 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner (System.in);
        String arrMenu[] = {"Nasi Goreng","Mie Goreng","Roti Bakar","Kentang Goreng","Teh Tarik","Cappucino","Chocolate Ice"},key;

        System.out.println("Daftar menu: ");
        System.out.println("Nasi Goreng");
        System.out.println("Mie Goreng");
        System.out.println("Roti Bakar");
        System.out.println("Kentang Goreng");
        System.out.println("Teh Tarik");
        System.out.println("Cappucino");
        System.out.println("Chocolate Ice\n");
        System.out.print("Masukkan nama menu yang akan dipesan: ");
        key = sc24.nextLine();

        for (int i = 0; i < arrMenu.length; i++) {
            if (key.equalsIgnoreCase(arrMenu[i])) {
                System.out.println("Nama menu yang dipesan: "+key);
                System.out.println();
                break;
            }
            if (key!=arrMenu[i] && i==(arrMenu.length-1)) {
                System.out.println("Nama menu yang anda cari tidak ditemukan");
                System.out.println();
            }
        }
    }
}
