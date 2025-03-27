import java.util.Scanner;

public class DosenDemo23 {
    public static void main(String[] args) {
        DataDosen23 list = new DataDosen23();
        Scanner sc23 = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumDsn = sc23.nextInt();
        sc23.nextLine();
        System.out.println("-------------------------");

        for (int i = 0; i < jumDsn; i++) {
            System.out.println("Masukkan data dosen ke-"+(i+1));
            System.out.print("Kode\t\t : ");
            String kode = sc23.nextLine();
            System.out.print("Nama\t\t : ");
            String nama = sc23.nextLine();
            System.out.print("Jenis Kelamin\t : ");
            String jenisKel = sc23.nextLine();
            boolean jk;
            if (jenisKel.equalsIgnoreCase("pria")) {
                jk=true;
            } else {
                jk=false;
            }
            System.out.print("Usia\t\t : ");
            String age = sc23.nextLine();
            int usia = Integer.parseInt(age);
            System.out.println("-------------------------");
            list.tambah(new Dosen23(kode, nama, jk, usia));
        }

        list.sortingASC();
        list.tampil();
        System.out.println("-------------------------");
        System.out.println("Pencarian Data");
        System.out.println("-------------------------");
        System.out.println("Masukkan nama dosen yang dicari: ");
        System.out.print("Nama: ");
        String cariNama = sc23.nextLine();
        System.out.println("Masukkan usia dosen yang dicari: ");
        System.out.print("Usia: ");
        double cariUsia = sc23.nextDouble();

        System.out.println("-------------------------");
        System.out.println("Menggunakan sequential searching");
        System.out.println("-------------------------");
        list.PencarianDataSequential23(cariNama);

        System.out.println("-------------------------");
        System.out.println("Menggunakan binary searching");
        System.out.println("-------------------------");
        double posisi2 = list.PencarianDataBinary23(cariUsia,0,jumDsn-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cariUsia, pss2);
        list.tampilDataSearch(cariUsia, pss2);
        list.DeteksiHasilPencarian(cariUsia);
    }
}