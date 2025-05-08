package Jobsheet9;
import java.util.Scanner;

public class SuratMain23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        StackSurat23 surat = new StackSurat23(5);
        int pilih;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat Izin");
            System.out.print("Pilih: ");
            pilih = sc23.nextInt();
            sc23.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID surat: ");
                    String id = sc23.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc23.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc23.nextLine();
                    System.out.print("Jenis izin (Isi S untuk sakit / I untuk izin): ");
                    char izin = sc23.next().charAt(0);
                    System.out.print("Durasi izin: ");
                    int durasi = sc23.nextInt();
                    Surat23 s = new Surat23(id, nama, kelas, izin, durasi);
                    surat.push(s);
                    System.out.println("Surat izin "+s.namaMahasiswa+" berhasil dikumpulkan");
                    break;
                case 2:
                    Surat23 proses = surat.pop();
                    if (proses!=null) {
                        System.out.println("Memroses surat izin dari "+proses.namaMahasiswa);
                        System.out.println("Surat izin telah diproses");
                    }
                    break;
                case 3:
                    Surat23 lihat = surat.peek();
                    if (lihat!=null) {
                        System.out.println("Surat izin terakhir adalah dari "+lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama yang ingin dicari: ");
                    String cari = sc23.nextLine();
                    surat.search(cari);
                    break;
                default:
                    break;
            }

        } while (pilih>=1 && pilih<=4);
    }
}