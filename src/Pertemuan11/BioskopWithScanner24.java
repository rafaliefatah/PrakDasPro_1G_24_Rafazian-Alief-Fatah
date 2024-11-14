package Pertemuan11;

import java.util.Scanner;

public class BioskopWithScanner24 {
    public static void main(String[] args) {
        Scanner sc24 = new Scanner(System.in);
        int baris,kolom,menu;
        String nama,next,penonton[][] = new String [4][2];

        do {
            System.out.println("-------------------------------------");
            System.out.println("Menu 1: Input data penonton");
            System.out.println("Menu 2: Tampilkan daftar penonton");
            System.out.println("Menu 3: Exit");
            System.out.println("-------------------------------------");
            System.out.print("Pilih opsi menu: ");
            menu = sc24.nextInt();
            sc24.nextLine();
    
            if (menu==1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc24.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc24.nextInt();
                    sc24.nextLine();
                    if (baris<1 || baris>penonton.length) {
                        System.out.println("Baris tidak tersedia, mohon input kembali");
                        continue;
                    }
                    System.out.print("Masukkan kolom: ");
                    kolom = sc24.nextInt();
                    sc24.nextLine();
                    if (kolom<1 || kolom>penonton[0].length) {
                        System.out.println("Kolom tidak tersedia, mohon input kembali");
                        continue;
                    }

                    if (penonton[baris-1][kolom-1] == null) {
                        penonton[baris-1][kolom-1] = nama;
                    } else {
                        System.out.println("Kursi telah diisi, mohon input kembali");
                        continue;
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc24.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu==2) {
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[0].length; j++) {
                        if (penonton[i][j]==null) {
                            penonton[i][j] = "***";
                        }
                        System.out.println("Penonton pada baris ke-"+(i+1)+" dan kolom ke-"+(j+1)+": "+penonton[i][j]);
                    }
                }
            } else if (menu==3) {
                for (int i = 0; i < penonton.length; i++) {
                    break;
                }
            } else {
                System.out.println("Opsi yang dimasukkan salah");
                continue;
            }

        } while (menu!=3);
    }
}
