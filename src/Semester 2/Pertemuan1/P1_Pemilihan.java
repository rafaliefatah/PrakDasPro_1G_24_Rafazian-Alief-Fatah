import java.util.Scanner;

public class P1_Pemilihan {
    public static void main(String[] args) {
    Scanner rafa = new Scanner(System.in);
        double nilaiKuis,nilaiTugas,nilaiUTS,nilaiUAS,nilaiAkhir;
        String nilaiHuruf=null;

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = rafa.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = rafa.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = rafa.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = rafa.nextDouble();
        System.out.println("==============================");
        System.out.println("==============================");

        if (nilaiTugas>100||nilaiTugas<0||nilaiKuis>100||nilaiKuis<0||nilaiUTS>100||nilaiUTS<0||nilaiUAS>100||nilaiUAS<0) {
            System.out.println("Nilai Tidak Valid");
        } else {
            nilaiAkhir = (nilaiTugas*0.2) + (nilaiKuis*0.2) + (nilaiUTS*0.3) + (nilaiUAS*0.3);
            System.out.println("Nilai akhir : "+nilaiAkhir);
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                System.out.println("Nilai huruf: A");
                nilaiHuruf="A";
              } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                System.out.println("Nilai huruf: B+");
                nilaiHuruf="B+";
              } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                System.out.println("Nilai huruf: B");
                nilaiHuruf="B";
              } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                System.out.println("Nilai huruf: C+");
                nilaiHuruf="C+";
              } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                System.out.println("Nilai huruf: C");
                nilaiHuruf="C";
              } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                System.out.println("Nilai huruf: D");
                nilaiHuruf="D";
              } else if (nilaiAkhir <= 39) {
                System.out.println("Nilai huruf: E");
                nilaiHuruf="E";
              }
        }
        System.out.println("==============================");
        System.out.println("==============================");
        if (nilaiHuruf=="A"||nilaiHuruf=="B+"||nilaiHuruf=="B"||nilaiHuruf=="C+"||nilaiHuruf=="C") {
            System.out.println("SELAMAT ANDA LULUS");
        } else if (nilaiHuruf=="D"||nilaiHuruf=="E") {
            System.out.println("MAAF ANDA TIDAK LULUS");
        }
    }
}