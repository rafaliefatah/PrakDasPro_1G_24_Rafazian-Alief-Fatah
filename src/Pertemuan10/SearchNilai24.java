package Pertemuan10;

import java.util.Scanner;

public class SearchNilai24 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner (System.in);
        int arrNilai[],key,hasil = 0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int banyakNilai = sc24.nextInt();
        arrNilai = new int [banyakNilai];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+": ");
            arrNilai[i] = sc24.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        key = sc24.nextInt();
        for (int i = 0; i < arrNilai.length; i++) {
            if (key==arrNilai[i]) {
                hasil = i;
                System.out.println();
                System.out.println("Nilai "+key+" ketemu, merupakan mahasiswa ke-"+(hasil+1));
                System.out.println();            
                break;
            } else {
                System.out.println();
                System.out.println("Nilai yang dicari tidak ditemukan");
                System.out.println();
                break;
            }
        }
    }
}