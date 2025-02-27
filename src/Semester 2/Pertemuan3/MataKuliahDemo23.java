import java.util.Scanner;

public class MataKuliahDemo23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        MataKuliah23[] arrayOfMatakuliah23 = new MataKuliah23[3];
        String kode,nama,dummy;
        int sks,jumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-"+(i+1));
            System.out.print("Kode       : ");
            kode = sc23.nextLine();
            System.out.print("Nama       : ");
            nama = sc23.nextLine();
            System.out.print("SKS        : ");
            dummy = sc23.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc23.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            arrayOfMatakuliah23[i] = new MataKuliah23(kode, nama, sks, jumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-"+(i+1));
            System.out.println("Kode        : "+arrayOfMatakuliah23[i].kode);
            System.out.println("Nama        : "+arrayOfMatakuliah23[i].nama);
            System.out.println("SKS         : "+arrayOfMatakuliah23[i].sks);
            System.out.println("Jumlah Jam  : "+arrayOfMatakuliah23[i].jumlahJam);
            System.out.println("------------------------------------");    
        }
    }
}