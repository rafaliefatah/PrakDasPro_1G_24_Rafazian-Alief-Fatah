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
    }
    public static int hitungLuas (int pjg, int lb) {
        int Luas = pjg*lb;
        return Luas;
    }
    public static int hitungVolume (int tinggi, int a, int b) {
        int volume = hitungLuas(a, b)*tinggi;
        return volume;
    }
}