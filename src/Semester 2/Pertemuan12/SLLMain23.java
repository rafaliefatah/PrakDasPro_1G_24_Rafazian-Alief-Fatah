import java.util.Scanner;

public class SLLMain23 {
    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        SingleLinkedList23 sll = new SingleLinkedList23();
        System.out.print("Input jumlah mahasiswa: ");
        int jmlMhs = sc23.nextInt();
        sc23.nextLine();
        sll.print();
        for (int i = 0; i < jmlMhs; i++) {
            System.out.print("NIM: ");
            String nim = sc23.nextLine();
            System.out.print("Nama: ");
            String nama = sc23.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc23.nextLine();
            System.out.print("IPK: ");
            double ipk = sc23.nextDouble();
            sc23.nextLine();
            Mahasiswa23 mhs = new Mahasiswa23(nim, nama, kelas, ipk);
            sll.addLast(mhs);
            sll.print();
        }

        System.out.println("Data index 1: ");
        sll.getData(1);
        System.out.println("Data mahasiswa Bimon berada pada index: "+sll.indexOf("bimon"));
        System.out.println();
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}