package Pertemuan9;

import java.util.Scanner;

public class P9TugasNo1 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner (System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc24.nextInt();

        if (N<3) {
            System.out.println("N minimal bernilai 3");
        } else {
            for (int i = 1; i <=N; i++) {
                for (int j = 1; j <=N; j++) {
                    if (i==1||j==1||i==N||j==N) {
                        System.out.print(N+" ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }    
        }
    }
}

