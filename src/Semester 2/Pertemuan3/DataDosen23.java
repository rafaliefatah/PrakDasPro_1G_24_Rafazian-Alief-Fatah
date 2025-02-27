public class DataDosen23 {
    public DataDosen23(Dosen23[] arrayOfDosen23) {
    }

    void dataSemuaDosen(Dosen23[] arrayOfDosen23) {
        int i=0;
        for (Dosen23 output : arrayOfDosen23) {
            System.out.println("Data Dosen ke-"+(i+1));
            System.out.println("Kode          : "+output.kode);
            System.out.println("Nama          : "+output.nama);
            System.out.print("Jenis Kelamin : ");
            if (output.jenisKelamin==true) {
                System.out.print("Pria");
            } else if (output.jenisKelamin==false) {
                System.out.print("Wanita");
            }
            System.out.println("\nUsia          : "+output.usia);
            System.out.println("------------------------------------");
            i++;
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen23[] arrayOfDosen23) {
        int pria=0,wanita=0;
        for (int i = 0; i < arrayOfDosen23.length; i++) {
            if (arrayOfDosen23[i].jenisKelamin==true) {
                pria++;
            } else if (arrayOfDosen23[i].jenisKelamin==false) {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria : "+pria+" orang");
        System.out.println("Jumlah Dosen Wanita : "+wanita+" orang");
        System.out.println("------------------------------------");
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen23[] arrayOfDosen23) {
        int pria=0,wanita=0;
        double usiaPria=0,usiaWanita=0,rataPria,rataWanita;
        for (int i = 0; i < arrayOfDosen23.length; i++) {
            if (arrayOfDosen23[i].jenisKelamin==true) {
                usiaPria+=arrayOfDosen23[i].usia;
                pria++;
            } else if (arrayOfDosen23[i].jenisKelamin==false) {
                usiaWanita+=arrayOfDosen23[i].usia;
                wanita++;
            }
        }
        rataPria=usiaPria/pria;
        System.out.println("Rata-rata usia dosen pria : "+rataPria);
        rataWanita=usiaWanita/wanita;
        System.out.println("Rata-rata usia dosen wanita : "+rataWanita);
        System.out.println("------------------------------------");
    }
    
    void infoDosenPalingTua(Dosen23[] arrayOfDosen23) {
        String dosenTertua=null;
        int usiaTertua=0;
        for (int i = 0; i < arrayOfDosen23.length; i++) {
            if (arrayOfDosen23[i].usia > usiaTertua) {
                usiaTertua=arrayOfDosen23[i].usia;
                dosenTertua=arrayOfDosen23[i].nama;
            }
        }
        System.out.println("Dosen dengan usia tertua adalah : "+dosenTertua+" dengan usia "+usiaTertua+" tahun");
        System.out.println("------------------------------------");
    }

    void infoDosenPalingMuda(Dosen23[] arrayOfDosen23) {
        String dosenTermuda=null;
        int usiaTermuda=100;
        for (int i = 0; i < arrayOfDosen23.length; i++) {
            if (arrayOfDosen23[i].usia < usiaTermuda) {
                usiaTermuda=arrayOfDosen23[i].usia;
                dosenTermuda=arrayOfDosen23[i].nama;
            }
        }
        System.out.println("Dosen dengan usia termuda adalah : "+dosenTermuda+" dengan usia "+usiaTermuda+" tahun");
        System.out.println("------------------------------------");
    }
}