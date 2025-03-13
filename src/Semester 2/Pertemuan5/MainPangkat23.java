import java.util.Scanner;

public class MainPangkat23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input23.nextInt();

        Pangkat23[] png = new Pangkat23[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-"+(i+1)+": ");
            int basis = input23.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-"+(i+1)+": ");
            int pangkat = input23.nextInt();
            png[i] = new Pangkat23(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTE FORCE: ");
        for (Pangkat23 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatBF());
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER");
        for (Pangkat23 p : png) {
            System.out.println(p.nilai+"^"+p.pangkat+": "+p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}