package Pertemuan13;

import java.util.Scanner;

public class Percobaan524 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.print("Masukkan panjang: ");
        p = input24.nextInt();
        System.out.print("Masukkan lebar: ");
        l = input24.nextInt();
        System.out.print("Masukkan tinggi: ");
        t = input24.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah: "+L);
        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah: "+vol);

        int temp = Jumlah(1, 1);
        TampilJumlah(temp, 5);
    }
    public static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }
    public static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }
    public static void TampilHinggaKei (int i) {
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }
    }
    public static int Jumlah (int bil1, int bil2) {
        return (bil1+bil2);
    }
    public static void TampilJumlah (int bil1, int bil2) {
        TampilHinggaKei(Jumlah(bil1, bil2));
    }
}