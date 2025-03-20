public class DataDosen23 {
    Dosen23 dataDosen[] = new Dosen23[10];
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
        for (Dosen23 m : dataDosen) {
            m.tampilInformasi();
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

    void sortingDSC() {
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen23 temp = dataDosen[i];
            int j=i;
            while (j>0 && dataDosen[j-1].usia<temp.usia) {
                dataDosen[j] = dataDosen[j-1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }
}