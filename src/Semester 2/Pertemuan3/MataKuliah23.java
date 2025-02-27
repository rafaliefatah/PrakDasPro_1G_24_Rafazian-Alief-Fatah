import java.util.Scanner;

public class MataKuliah23 {
    Scanner sc23 = new Scanner(System.in);
    public String kode,nama,dummy;
    public int sks,jumlahJam;

    public MataKuliah23 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public MataKuliah23() {
    }

    void tambahData() {
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
    }

    void cetakInfo() {
            System.out.println("Kode        : "+kode);
            System.out.println("Nama        : "+nama);
            System.out.println("SKS         : "+sks);
            System.out.println("Jumlah Jam  : "+jumlahJam);
            System.out.println("------------------------------------");    
    }
}
