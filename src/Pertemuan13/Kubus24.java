package Pertemuan13;

import java.util.Scanner;

public class Kubus24 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner(System.in);
        int sisi;

        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = sc24.nextInt();
        
        System.out.println("Volume kubus adalah: "+volumeKubus(sisi,sisi,sisi));
        System.out.println("Luas permukaan kubus adalah: "+luasPermKubus(sisi, sisi));
    }
    public static int volumeKubus (int s1, int s2, int s3) {
        return (s1*s2*s3);
    }
    public static int luasPermKubus (int s1, int s2) {
        return (6*s1*s2);
    }
}