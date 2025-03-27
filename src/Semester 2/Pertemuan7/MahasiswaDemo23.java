import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
        Scanner sc23 = new Scanner(System.in);
        int jumMhs=5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan data mahasiswa ke-"+(i+1));
            System.out.print("NIM\t : ");
            String nim = sc23.nextLine();
            System.out.print("Nama\t : ");
            String nama = sc23.nextLine();
            System.out.print("Kelas\t : ");
            String kelas = sc23.nextLine();
            System.out.print("IPK\t : ");
            String ip = sc23.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("-------------------------");
            list.tambah(new Mahasiswa23(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("-------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-------------------------");
        System.out.println("Masukkan IPK mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc23.nextDouble();

        // System.out.println("Menggunakan sequential searching");
        // double posisi = list.sequentialSearching(cari);
        // int pss = (int)posisi;
        // list.tampilPosisi(cari, pss);
        // list.tampilDataSearch(cari, pss);

        System.out.println("-------------------------");
        System.out.println("Menggunakan binary search");
        System.out.println("-------------------------");
        double posisi2 = list.findBinarySearch(cari,0,jumMhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
    }
}