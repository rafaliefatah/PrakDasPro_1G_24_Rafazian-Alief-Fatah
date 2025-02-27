import java.util.Scanner;

public class MataKuliahDemo23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.print("Masukkan panjang (jumlah elemen) : ");
        int panjang = sc23.nextInt();
        MataKuliah23[] arrayOfMatakuliah23 = new MataKuliah23[panjang];

        for (int i = 0; i < panjang; i++) {
            arrayOfMatakuliah23[i] = new MataKuliah23();
            System.out.println("Masukkan Data Mata Kuliah ke-"+(i+1));
            arrayOfMatakuliah23[i].tambahData();
        }

        for (int i = 0; i < panjang; i++) {
            System.out.println("Data Mata Kuliah ke-"+(i+1));
            arrayOfMatakuliah23[i].cetakInfo();
        }
    }
}