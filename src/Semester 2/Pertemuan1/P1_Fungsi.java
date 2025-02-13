import java.util.Scanner;

public class P1_Fungsi {
    static Scanner rafa = new Scanner(System.in);
    static String cabang[] = {"RoyalGarden 1","RoyalGarden 2","RoyalGarden 3","RoyalGarden 4"};
    static String bunga[] = {"Aglonema","Keladi","Alocasia","Mawar"};
    static int stock[][] = {
        {10,5,15,7},
        {6,11,9,12},
        {2,10,10,5},
        {5,7,12,9}
    };
    static double hargaAglonema=75000,hargaKeladi=50000,hargaAlocasia=60000,hargaMawar=10000;
    public static void main(String[] args) {
        tampilPendapatan();
        stockCabang4();
    }
    
    public static void tampilPendapatan() {
        System.out.println("======================");
        System.out.println("Pendapatan setiap cabang jika terjual habis\n");
        for (int i = 0; i < cabang.length; i++) {
            double pendapatan=0;
            for (int j = 0; j < stock[0].length; j++) {
                if (j==0) {
                    pendapatan += stock[i][j]*hargaAglonema;
                } else if (j==1) {
                    pendapatan += stock[i][j]*hargaKeladi;
                } else if (j==2) {
                    pendapatan += stock[i][j]*hargaAlocasia;
                } else if (j==3) {
                    pendapatan += stock[i][j]*hargaMawar;
                }
            }
            System.out.println("Pendapatan cabang "+cabang[i]+": "+pendapatan);
        }
        System.out.println("======================\n");
    }

    public static void stockCabang4() {
        System.out.println("======================");
        System.out.println("Stock bunga pada cabang RoyalGarden 4: ");
        System.out.println("Bunga "+bunga[0]+": "+(stock[3][0]-1));
        System.out.println("Bunga "+bunga[1]+": "+(stock[3][1]-2));
        System.out.println("Bunga "+bunga[2]+": "+(stock[3][2]-0));
        System.out.println("Bunga "+bunga[3]+": "+(stock[3][3]-5));

        System.out.println("\nPengurangan stock karena bunga mati: ");
        System.out.println("Bunga "+bunga[0]+": 1");
        System.out.println("Bunga "+bunga[1]+": 2");
        System.out.println("Bunga "+bunga[2]+": 0");
        System.out.println("Bunga "+bunga[3]+": 5");
        System.out.println("======================");
    }
}