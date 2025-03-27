import java.util.Scanner;

public class MahasiswaBerprestasi23 {
    Scanner sc23 = new Scanner(System.in);
    Mahasiswa23 listMhs[] = new Mahasiswa23[5];
    int idx;

    void tambah(Mahasiswa23 m) {
        if (idx<listMhs.length) {
            listMhs[idx] = m;
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

    // int sequentialSearching(double cari) {
    //     int posisi = -1;
    //     for (int i = 0; i < listMhs.length; i++) {
    //         if (listMhs[i].ipk == cari) {
    //             posisi=i;
    //             break;
    //         }
    //     }
    //     return posisi;
    // }

    int findBinarySearch(double cari, int left, int right) {
        int mid;
        if (right>=left) {
            mid = (left+right)/2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            } else if (cari > listMhs[mid].ipk) {
                return findBinarySearch(cari, left, mid-1);
            } else {
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK "+x+" ditemukan pada indeks "+pos);
        } else {
            System.out.println("Data "+x+" tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t : "+listMhs[pos].nim);
            System.out.println("Nama\t : "+listMhs[pos].nama);
            System.out.println("Kelas\t : "+listMhs[pos].kelas);
            System.out.println("IPK\t : "+x);
        } else {
            System.out.println("Data mahasiswa dengan IPK "+x+" tidak ditemukan");
        }
    }
}