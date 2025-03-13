import java.util.Scanner;

public class MainTugas1_23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        String namaMhs[] = {"Ahmad","Budi","Cindy","Dian","Eko","Fajar","Gina","Hadi"};
        System.out.println("Banyaknya mahasiswa: "+namaMhs.length);

        Tugas1_23 tugas = new Tugas1_23(namaMhs.length);
        for (int i = 0; i < namaMhs.length; i++) {
            System.out.print("Masukkan Nilai UTS untuk "+namaMhs[i]+": ");
            tugas.nilaiUTS[i] = input23.nextDouble();
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < namaMhs.length; i++) {
            System.out.print("Masukkan Nilai UAS untuk "+namaMhs[i]+": ");
            tugas.nilaiUAS[i] = input23.nextDouble();
        }
        System.out.println("-----------------------------------");
        System.out.println("Nilai UTS tertinggi nilai adalah "+tugas.nilaiUtsTinggi(tugas.nilaiUTS, 0, namaMhs.length-1));
        System.out.println("Nilai UTS terendah nilai adalah "+tugas.nilaiUtsRendah(tugas.nilaiUTS, 0, namaMhs.length-1));
        System.out.println("Rata-rata nilai UAS semua mahasiswa adalah "+tugas.rataUAS());
    }
}