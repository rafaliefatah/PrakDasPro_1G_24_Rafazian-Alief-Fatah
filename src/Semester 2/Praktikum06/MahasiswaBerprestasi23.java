import java.util.Scanner;

public class MahasiswaBerprestasi23 {
    Scanner sc23 = new Scanner(System.in);
    Mahasiswa23 listMhs[] = new Mahasiswa23[5];
    int idx;

    void tambah(Mahasiswa23 m) {
        if (idx<listMhs.length) {
            listMhs[idx] = m;
            System.out.println("Masukkan data mahasiswa ke-"+(idx+1));
            System.out.print("Masukkan NIM mahasiswa: ");
            m.nim = sc23.nextLine();
            System.out.print("Masukkan nama mahasiswa: ");
            m.nama = sc23.nextLine();
            System.out.print("Masukkan kelas mahasiswa: ");
            m.kelas = sc23.nextLine();
            System.out.print("Masukkan IPK mahasiswa: ");
            m.ipk = sc23.nextDouble();
            sc23.nextLine();
            System.out.println("-------------------------");
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampil() {
        for (Mahasiswa23 m : listMhs) {
            m.tampilInformasi();
            System.out.println("-------------------------");
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk>listMhs[j-1].ipk) {
                    Mahasiswa23 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxMin=i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk<listMhs[idxMin].ipk) {
                    idxMin=j;
                }
            }
            Mahasiswa23 tmp = listMhs[idxMin];
            listMhs[idxMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa23 temp = listMhs[i];
            int j=i;
            while (j>0 && listMhs[j-1].ipk>temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}