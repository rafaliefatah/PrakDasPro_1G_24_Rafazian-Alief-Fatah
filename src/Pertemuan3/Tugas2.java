import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);;
        double bonusKaryawan,pajak,jmlJamKerja,upahPerJam,gajiKaryawan,totalGajiStlhPajak;

        System.out.print("Masukkan jumlah jam kerja karyawan: ");
        jmlJamKerja = sc.nextInt();
        System.out.print("Masukkan upah per jam: ");
        upahPerJam = sc.nextInt();

        gajiKaryawan = jmlJamKerja * upahPerJam;
        bonusKaryawan = gajiKaryawan * 0.1;
        pajak = (gajiKaryawan+bonusKaryawan) * 0.05;
        totalGajiStlhPajak = (gajiKaryawan+bonusKaryawan) - pajak;

        System.out.println("Gaji karyawan: " +gajiKaryawan);
        System.out.println("Bonus karyawan: " +bonusKaryawan);
        System.out.println("Pajak yang dikenakan: " +pajak);
        System.out.println("Total gaji setelah pajak: " +totalGajiStlhPajak);
    }
}
