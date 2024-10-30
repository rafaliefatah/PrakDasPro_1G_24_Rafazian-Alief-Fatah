package Pertemuan9;

import java.util.Scanner;

public class Star24 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner (System.in);
        System.out.print("Masukkan nilai N = ");
        int N = sc24.nextInt();

        for (int i = 1; i <=N; i--) {
            System.out.print("*");
        }
    }
}