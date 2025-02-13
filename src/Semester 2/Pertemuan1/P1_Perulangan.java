import java.util.Scanner;

public class P1_Perulangan {
    public static void main(String[] args) {
        Scanner rafa = new Scanner(System.in);
        long nim,n;
    
        System.out.print("Masukkan NIM : ");
        nim = rafa.nextLong();
        System.out.println("======================");
        n = nim%100;
        if (n<10) {
            n+=10;
        }
        System.out.println("n : "+n);
        for (int i = 1; i <= n; i++) {
            if (i==6||i==10) {
                continue;
            } else {
                if (i%2==1) {
                    System.out.print(" *");
                } else {
                    System.out.print(" "+i);
                }
            }
        }
    }
}
