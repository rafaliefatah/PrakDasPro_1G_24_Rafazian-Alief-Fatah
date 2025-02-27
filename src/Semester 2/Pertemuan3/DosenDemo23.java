import java.util.Scanner;

public class DosenDemo23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        Dosen23[] arrayOfDosen23 = new Dosen23[3];
        String kode,nama,dummy;
        Boolean jenisKelamin;
        int usia;

        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Dosen ke-"+(i+1));
            System.out.print("Kode          : ");
            kode = sc23.nextLine();
            System.out.print("Nama          : ");
            nama = sc23.nextLine();
            System.out.print("Jenis Kelamin : ");
            dummy = sc23.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            if (dummy.equalsIgnoreCase("pria")) {
                jenisKelamin = true;
            } else if (dummy.equalsIgnoreCase("wanita")) {
                jenisKelamin = false;
            }
            System.out.print("Usia          : ");
            dummy = sc23.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("------------------------------------");

            arrayOfDosen23[i] = new Dosen23(kode, nama, jenisKelamin, usia);
        }
        
        int i=0;
        for (Dosen23 output : arrayOfDosen23) {
            System.out.println("Data Dosen ke-"+(i+1));
            System.out.println("Kode          : "+output.kode);
            System.out.println("Nama          : "+output.nama);
            System.out.print("Jenis Kelamin : ");
            if (output.jenisKelamin==true) {
                System.out.print("Pria");
            } else if (output.jenisKelamin==false) {
                System.out.print("Wanita");
            }
            System.out.println("\nUsia          : "+output.usia);
            System.out.println("------------------------------------");
            i++;
        }
    }
}
