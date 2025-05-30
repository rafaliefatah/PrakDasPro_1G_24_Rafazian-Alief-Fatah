package P1Jobsheet10;
import java.util.Scanner;

public class QueueMain23 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        Scanner sc23 = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc23.nextInt();
        sc23.nextLine();
        Queue23 Q = new Queue23(n);
        int pilih;

        do {
            menu();
            pilih = sc23.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc23.nextInt();
                    if (Q.isFull()) {
                        pilih=0;
                        System.out.println("Queue Overflow");
                        break;
                    }
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    if (Q.isEmpty()) {
                        pilih=0;
                        System.out.println("Queue Underflow");
                        break;
                    }
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar!=0) {
                        System.out.println("Data yang dikeluarkan: "+dataKeluar);
                        break;
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } while (pilih==1 || pilih==2 || pilih==3 || pilih==4 || pilih==5);
    }
}