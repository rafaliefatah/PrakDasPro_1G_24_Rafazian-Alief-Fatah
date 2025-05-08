package Jobsheet10Tugas;
import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Persetujuan KRS ===");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Mengosongkan Antrian");
            System.out.println("4. Menambahkan Antrian");
            System.out.println("5. Memanggil Antrian");
            System.out.println("6. Tampilkan Semua Antrian");
            System.out.println("7. Tampilkan 2 Antrian Terdepan");
            System.out.println("8. Tampilkan Antrian Terakhir");
            System.out.println("9. Cek Jumlah Antrian");
            System.out.println("10. Cek Jumlah yang Sudah Melakukan Proses KRS");
            System.out.println("11. Cek Jumlah yang Belum Melakukan Proses KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc23.nextInt();
            sc23.nextLine();

            switch (pilihan) {
                case 1:
                    if (antrian.isEmpty()) {
                        System.out.println("Antrian kosong");
                    } else {
                        System.out.println("Antrian terisi");
                    }
                    break;
                case 2:
                    if (antrian.isFull()) {
                        System.out.println("Antrian penuh");
                    } else {
                        System.out.println("Antrian tidak penuh");
                    }
                    break;
                case 3:
                    antrian.clear();
                    break;
                case 4:
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
                case 5:
                    System.out.println("Memanggil mahasiswa: ");
                    for (int i = 0; i < 2; i++) {
                        Mahasiswa23 dipanggil = antrian.panggilMahasiswa();
                        if (dipanggil!=null) {
                            dipanggil.tampilkanData();
                        }    
                    }
                    break;
                case 6:
                    antrian.tampilkanSemua();
                    break;
                case 7:
                    antrian.tampilTerdepan();
                    break;
                case 8:
                    antrian.tampilTerakhir();
                    break;
                case 9:
                    System.out.println("Jumlah antrian: "+antrian.getJumlahAntrian());
                    break;
                case 10:
                    System.out.println("Jumlah antrian yang sudah melakukan proses: "+antrian.jumlahSudah());
                    break;
                case 11:
                    System.out.println("Jumlah antrian yang belum melakukan proses: "+antrian.jumlahBelum());
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