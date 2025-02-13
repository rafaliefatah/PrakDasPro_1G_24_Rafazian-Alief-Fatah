import java.util.Scanner;

public class P1_Tugas1 {
    public static void main(String[] args) {
        Scanner rafa = new Scanner(System.in);
        char kode[] = {'A','B','D','E','F','G','H','L','N','T'};
        char kota[][] = {
            {'B','A','N','T','E','N',' ',' ',' ',' ',' ',' '},
            {'J','A','K','A','R','T','A',' ',' ',' ',' ',' '},
            {'B','A','N','D','U','N','G',' ',' ',' ',' ',' '},
            {'C','I','R','E','B','O','N',' ',' ',' ',' ',' '},
            {'B','O','G','O','R',' ',' ',' ',' ',' ',' ',' '},
            {'P','E','K','A','L','O','N','G','A','N',' ',' '},
            {'S','E','M','A','R','A','N','G',' ',' ',' ',' '},
            {'S','U','R','A','B','A','Y','A',' ',' ',' ',' '},
            {'M','A','L','A','N','G',' ',' ',' ',' ',' ',' '},
            {'T','E','G','A','L',' ',' ',' ',' ',' ',' ',' '}
        };

        System.out.println("Plat nomor: ");
        for (int i = 0; i < kota.length; i++) {
            System.out.print(kode[i]+" ");
        }
        System.out.print("\nMasukkan kode plat nomor: ");
        char input = rafa.next().charAt(0);
        switch (input) {
            case 'A':
            for (int i = 0; i < kota.length; i++) {
                for (int j = 0; j < kota[0].length; j++) {
                    System.out.print(kota[0][j]);
                }
                break;
            } break;
            case 'B':
            for (int i = 0; i < kota.length; i++) {
                for (int j = 0; j < kota[0].length; j++) {
                    System.out.print(kota[1][j]);
                }
                break;
            } break;
            case 'D':
            for (int i = 0; i < kota.length; i++) {
                for (int j = 0; j < kota[0].length; j++) {
                    System.out.print(kota[2][j]);
                }
                break;
            } break;
            case 'E':
            for (int i = 0; i < kota.length; i++) {
                for (int j = 0; j < kota[0].length; j++) {
                    System.out.print(kota[3][j]);
                }
                break;
            } break;
            case 'F':
            for (int i = 0; i < kota.length; i++) {
                for (int j = 0; j < kota[0].length; j++) {
                    System.out.print(kota[4][j]);
                }
                break;
            } break;
            case 'G':
            for (int i = 0; i < kota.length; i++) {
                for (int j = 0; j < kota[0].length; j++) {
                    System.out.print(kota[5][j]);
                }
                break;
            } break;
            case 'H':
            for (int i = 0; i < kota.length; i++) {
                for (int j = 0; j < kota[0].length; j++) {
                    System.out.print(kota[6][j]);
                }
                break;
            } break;
            case 'L':
            for (int i = 0; i < kota.length; i++) {
                for (int j = 0; j < kota[0].length; j++) {
                    System.out.print(kota[7][j]);
                }
                break;
            } break;
            case 'N':
            for (int i = 0; i < kota.length; i++) {
                for (int j = 0; j < kota[0].length; j++) {
                    System.out.print(kota[8][j]);
                }
                break;
            } break;
            case 'T':
            for (int i = 0; i < kota.length; i++) {
                for (int j = 0; j < kota[0].length; j++) {
                    System.out.print(kota[9][j]);
                }
                break;
            } break;
            default:
                break;
        }
    }
}
