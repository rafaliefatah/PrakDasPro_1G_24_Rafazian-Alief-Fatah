import java.util.Scanner;

public class MainFaktorial23 {
    public static void main(String[] args) {
        Scanner input23 = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input23.nextInt();

        Faktorial23 fk = new Faktorial23();
        System.out.println("Nilai faktorial "+nilai+" menggunakan BF: "+fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial "+nilai+" menggunakan DC: "+fk.faktorialDC(nilai));
    }
}