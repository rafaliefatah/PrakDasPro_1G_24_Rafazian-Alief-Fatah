package P2Jobsheet10;
import java.util.Scanner;

public class LayananAkademikSIAKAD23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        AntrianLayanan23 antrian = new AntrianLayanan23(5);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Cek Antrian Paling Belakang");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc23.nextInt();
            sc23.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc23.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc23.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc23.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc23.nextLine();
                    Mahasiswa23 mhs = new Mahasiswa23(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa23 dilayani = antrian.layaniMahasiswa();
                    if (dilayani!=null) {
                        System.out.print("Melayani mahasiswa: ");
                        dilayani.tampilkanData();
                    }
                    break;
                case 3:
                    antrian.lihatTerdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Jumlah dalan antrian: "+antrian.getJumlahAntrian());
                    break;
                case 6:
                    antrian.LihatAkhir();
                    break;
                case 0:
                    System.out.println("Terima kasih");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan!=0);
        sc23.close();
    }
}