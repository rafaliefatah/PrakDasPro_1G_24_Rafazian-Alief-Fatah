public class DataDosen23 {
    Dosen23 dataDosen[] = new Dosen23[5];
    int idx;

    void tambah(Dosen23 dsn) {
        if (idx<dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh");
        }
    }
    
    void tampil() {
        for (Dosen23 dsn : dataDosen) {
            dsn.tampilInformasi();
            System.out.println("-------------------------");
        }
    }

    void sortingASC() {
        for (int i = 0; i < dataDosen.length-1; i++) {
            for (int j = 1; j < dataDosen.length-i; j++) {
                if (dataDosen[j].usia<dataDosen[j-1].usia) {
                    Dosen23 temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j-1];
                    dataDosen[j-1] = temp;
                }
            }
        }
    }

    void PencarianDataSequential23(String cari) {
        for (int i = 0; i < dataDosen.length; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(cari)) {
                System.out.println("Indeks ke-"+i);
                System.out.println("Kode\t\t : "+dataDosen[i].kode);
                System.out.println("Nama\t\t : "+dataDosen[i].nama);
                System.out.println("Jenis Kelamin\t : "+(dataDosen[i].jenisKelamin?"Pria":"Wanita"));
                System.out.println("Usia\t\t : "+dataDosen[i].usia);
                break;
            }
        }
    }

    int PencarianDataBinary23(double cari, int left, int right) {
        int mid;
        if (right>=left) {
            mid = (left+right)/2;
            if (cari == dataDosen[mid].usia) {
                return mid;
            } else if (cari < dataDosen[mid].usia) {
                return PencarianDataBinary23(cari, left, mid-1);
            } else {
                return PencarianDataBinary23(cari, mid+1, right);
            }
        }
        return -1;
    }

    void DeteksiHasilPencarian(double cari) {
        int banyakData=0;
        for (int i = 0; i < dataDosen.length; i++) {
            if (dataDosen[i].usia==cari) {
                banyakData++;
            }
        }
        System.out.println("-------------------------");
        if (banyakData>1) {
            System.out.println("Data usia yang dicari lebih dari 1: ");
            for (int i = 0; i < dataDosen.length; i++) {
                if (cari==dataDosen[i].usia) {
                    System.out.println("Indeks ke-"+i);
                    System.out.println("Kode\t\t : "+dataDosen[i].kode);
                    System.out.println("Nama\t\t : "+dataDosen[i].nama);
                    System.out.println("Jenis Kelamin\t : "+(dataDosen[i].jenisKelamin?"Pria":"Wanita"));
                    System.out.println("Usia\t\t : "+dataDosen[i].usia);    
                    System.out.println("-------------------------");
                }
            }
        } else {
            System.out.println("Data usia yang dicari hanya ada 1");
        }
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data dosen dengan usia "+x+" ditemukan pada indeks "+pos);
        } else {
            System.out.println("Data "+x+" tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos) {
        if (pos != -1) {
            System.out.println("Kode\t\t : "+dataDosen[pos].kode);
            System.out.println("Nama\t\t : "+dataDosen[pos].nama);
            System.out.println("Jenis Kelamin\t : "+(dataDosen[pos].jenisKelamin?"Pria":"Wanita"));
            System.out.println("Usia\t\t : "+x);
        } else {
            System.out.println("Data mahasiswa dengan IPK "+x+" tidak ditemukan");
        }
    }
}