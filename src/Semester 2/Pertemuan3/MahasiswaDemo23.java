import java.util.Scanner;

public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        Mahasiswa23[] arrayOfMahasiswa23 = new Mahasiswa23[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa23[i] = new Mahasiswa23();
            
            System.out.println("Masukkan Data Mahasiswa ke-"+(i+1));
            System.out.print("NIM     :");
            arrayOfMahasiswa23[i].nim = sc23.nextLine();
            System.out.print("Nama    :");
            arrayOfMahasiswa23[i].nama = sc23.nextLine();
            System.out.print("Kelas   :");
            arrayOfMahasiswa23[i].kelas = sc23.nextLine();
            System.out.print("IPK     :");
            dummy = sc23.nextLine();
            arrayOfMahasiswa23[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-"+(i+1));
            System.out.println("NIM     : "+arrayOfMahasiswa23[i].nim);
            System.out.println("Nama    : "+arrayOfMahasiswa23[i].nama);
            System.out.println("Kelas   : "+arrayOfMahasiswa23[i].kelas);
            System.out.println("IPK     : "+arrayOfMahasiswa23[i].ipk);
            System.out.println("------------------------------------");    
        }
    }
}