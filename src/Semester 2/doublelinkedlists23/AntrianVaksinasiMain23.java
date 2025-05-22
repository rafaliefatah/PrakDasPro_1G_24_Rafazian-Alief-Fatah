import java.util.Scanner;

public class AntrianVaksinasiMain23 {
    public static void main(String[] args) throws Exception {
        Scanner sc23 = new Scanner(System.in);
        QueueVaksinasi23 antrian = new QueueVaksinasi23();
        int pilihan;

        do {
        System.out.println();
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
        System.out.println("+++++++++++++++++++++++++++++");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("+++++++++++++++++++++++++++++");
        pilihan = sc23.nextInt();
        sc23.nextLine();

        switch (pilihan) {
            case 1:
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Penerima Vaksin");
                System.out.println("-----------------------------");
                System.out.println("Nomor Antrian: ");
                String no = sc23.nextLine();
                System.out.println("Nama Antrian: ");
                String nama = sc23.nextLine();
                AntrianVaksinasi23 daftar = new AntrianVaksinasi23(no, nama);
                antrian.tambahAntrian(daftar);
                break;
            case 2:
                antrian.hapusAntrian();
                break;
            case 3:
                antrian.tampilkanAntrian();
                break;
            case 4:
                System.out.println("Keluar");
                break;
            default:
                System.out.println("Pilihan tidak valid");
                break;
        }
        } while (pilihan!=4);
    }
}