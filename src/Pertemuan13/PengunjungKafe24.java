package Pertemuan13;

public class PengunjungKafe24 {
    public static void daftarPengunjung(String... namaPengunjung){
        System.out.println("Daftar Nama Pengunjung: ");
        for (String daftarNama : namaPengunjung) {
            System.out.println("- "+daftarNama);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali","Budi","Citra");
    }
}