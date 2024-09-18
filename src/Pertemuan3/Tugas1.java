import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int jmlPenggunaanListrik,totalTagihan;
        boolean melebihi500;

        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        jmlPenggunaanListrik = sc.nextInt();

        totalTagihan = jmlPenggunaanListrik * 1500;
        melebihi500 = jmlPenggunaanListrik > 500;

        System.out.println("Total tagihan listrik anda: Rp. " +totalTagihan);
        System.out.println("Penggunaan listrik melebihi 500 kWh: " +melebihi500);
    }
}