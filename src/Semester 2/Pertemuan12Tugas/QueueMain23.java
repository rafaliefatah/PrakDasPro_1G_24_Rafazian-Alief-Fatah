import java.util.Scanner;

public class QueueMain23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        Queue23 antrian = new Queue23(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Mengosongkan Antrian");
            System.out.println("4. Menambahkan Antrian");
            System.out.println("5. Memanggil Antrian");
            System.out.println("6. Tampilkan Antrian Terdepan");
            System.out.println("7. Tampilkan Antrian Terakhir");
            System.out.println("8. Cek Jumlah Antrian");
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
                    Kemahasiswaan23 mhs = new Kemahasiswaan23(nim, nama);
                    antrian.tambahAntrian(mhs);
                    break;
                case 5:
                    antrian.panggilMahasiswa();
                    System.out.println("Mahasiswa telah dipanggil");
                    break;
                case 6:
                    antrian.tampilTerdepan();
                    break;
                case 7:
                    antrian.tampilTerakhir();
                    break;
                case 8:
                    System.out.println("Jumlah antrian: "+antrian.getJumlahAntrian());
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