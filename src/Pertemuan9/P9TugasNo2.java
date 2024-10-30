package Pertemuan9;

import java.util.Scanner;

public class P9TugasNo2 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner (System.in);
        System.out.print("Masukkan jumlah Politeknik yang mendaftar = ");
        int daftar = sc24.nextInt();
        sc24.nextLine();

        for (int i = 1; i <=daftar; i++) {
            System.out.print("Masukkan nama Politeknik ke-"+i+": ");
            String poltek = sc24.nextLine();
            String daftarBadminton="",daftarTenis="",daftarBasket="",daftarVoli="";

            System.out.println("Masukkan nama atlet badminton: ");
            for (int j = 1; j <=5; j++) {
                System.out.print("Atlet ke-"+j+": ");
                String atletBadminton = sc24.nextLine();
                daftarBadminton+=atletBadminton+"\n";
            }
            System.out.println("Masukkan nama atlet tenis meja: ");
            for (int k = 1; k <=5; k++) {
                System.out.print("Atlet ke-"+k+": ");
                String atletTenis = sc24.nextLine();
                daftarTenis+=atletTenis+"\n";
            }
            System.out.println("Masukkan nama atlet basket: ");
            for (int l = 1; l <=5; l++) {
                System.out.print("Atlet ke-"+l+": ");
                String atletBasket = sc24.nextLine();
                daftarBasket+=atletBasket+"\n";
            }
            System.out.println("Masukkan nama atlet bola voli: ");
            for (int m = 1; m <=5; m++) {
                System.out.print("Atlet ke-"+m+": ");
                String atletVoli = sc24.nextLine();
                daftarVoli+=atletVoli+"\n";
            }
            System.out.println("\nDaftar nama atlet dari "+poltek);
            System.out.println("Atlet badminton: \n"+daftarBadminton);
            System.out.println("Atlet tenis meja: \n"+daftarTenis);
            System.out.println("Atlet basket: \n"+daftarBasket);
            System.out.println("Atlet bola voli: \n"+daftarVoli);
        }
    }
}