import java.util.Scanner;

public class MainSum23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input23.nextInt();

        Sum23 sm = new Sum23(elemen);
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan keuntungan ke-"+(i+1)+": ");
            sm.keuntungan[i] = input23.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruce Force: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
}