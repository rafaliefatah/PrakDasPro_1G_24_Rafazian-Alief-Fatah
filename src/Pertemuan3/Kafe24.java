package Pertemuan3;

import java.util.Scanner;

public class Kafe24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi,jmlTeh,jmlRoti;
        float diskon = 10/100f;
        double hrgKopi = 12000.0,hrgTeh = 7000.0,hrgRoti = 20000.0,nominalByr,totalHrg;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        jmlRoti = input.nextInt();

        totalHrg = (hrgKopi*jmlKopi)+(hrgTeh*jmlTeh)+(hrgRoti*jmlRoti);
        nominalByr = totalHrg-(diskon*totalHrg);

        System.out.println("Keanggotaan pelanggan: "+keanggotaan);
        System.out.println("Item pembelian: "+jmlKopi+" kopi, "+jmlTeh+" teh, "+jmlRoti+" roti");
        System.out.println("Nominal bayar: "+nominalByr);
    }
    
}