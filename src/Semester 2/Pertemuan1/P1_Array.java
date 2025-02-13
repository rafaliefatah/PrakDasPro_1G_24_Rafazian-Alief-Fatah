import java.util.Scanner;

public class P1_Array {
    public static void main(String[] args) {
        Scanner rafa = new Scanner(System.in);
        String tabel[] = {"MK","Nilai Angka","Nilai Huruf","Bobot Nilai"};

        System.out.println("=====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=====================");
        System.out.print("Masukkan jumlah matkul : ");
        int jmlMatkul = rafa.nextInt();
        rafa.nextLine();
        System.out.println("=====================");

        int nilaiAngka[] = new int[jmlMatkul];
        String nilaiHuruf[] = new String[jmlMatkul];
        double bobotNilai[] = new double[jmlMatkul];
        String matkul[] = new String[jmlMatkul];

        for (int i = 0; i < matkul.length; i++) {
            System.out.print("Masukkan nama MK ke-"+(i+1)+" : ");
            matkul[i] = rafa.nextLine();
        }
        System.out.println("=====================");
        for (int i = 0; i < nilaiAngka.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK "+matkul[i]+" : ");
            nilaiAngka[i] = rafa.nextInt();
            rafa.nextLine();
        }
        System.out.println("=====================");
        for (int i = 0; i < nilaiHuruf.length; i++) {
            System.out.print("Masukkan nilai huruf untuk MK "+matkul[i]+" : ");
            nilaiHuruf[i] = rafa.nextLine();
            if (nilaiHuruf[i].equalsIgnoreCase("a")) {
                bobotNilai[i]=4;
            } else if (nilaiHuruf[i].equalsIgnoreCase("b+")) {
                bobotNilai[i]=3.5;
            } else if (nilaiHuruf[i].equalsIgnoreCase("b")) {
                bobotNilai[i]=3;
            } else if (nilaiHuruf[i].equalsIgnoreCase("c+")) {
                bobotNilai[i]=2.5;
            } else if (nilaiHuruf[i].equalsIgnoreCase("c")) {
                bobotNilai[i]=2;
            } else if (nilaiHuruf[i].equalsIgnoreCase("d")) {
                bobotNilai[i]=1;
            } else if (nilaiHuruf[i].equalsIgnoreCase("e")) {
                bobotNilai[i]=0;
            }
        }
        System.out.println("=====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================");
        for (int i = 0; i < tabel.length; i++) {
            if (i==0) {
                System.out.print(tabel[i]);
            } else if (i==1) {
                System.out.print("\t\t\t"+tabel[i]+"\t");
            } else if (i==2) {
                System.out.print(tabel[i]+"\t");
            } else if (i==3) {
                System.out.print(tabel[i]+"\t");
            }
        }
        System.out.println();
        for (int i = 0; i < jmlMatkul; i++) {
            System.out.print(matkul[i]);
            System.out.print("\t\t\t"+nilaiAngka[i]+"\t");
            System.out.print("\t"+nilaiHuruf[i]+"\t");
            System.out.print("\t"+bobotNilai[i]+"\t");
            System.out.println();
        }
        System.out.println("=====================");
        double jmlBobot=0;
        for (int i = 0; i < bobotNilai.length; i++) {
            jmlBobot+=bobotNilai[i];
        }
        double ip = jmlBobot/jmlMatkul;
        System.out.println("IP : "+ip);
    }
}
