public class MahasiswaMain23 {
    String nim,nama,kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("Nama: "+nama);
        System.out.println("NIM: "+nim);
        System.out.println("IPK: "+ipk);
        System.out.println("Kelas: "+kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas=kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        if (ipk>=0.0 && ipk<=4.0) {
            ipk=ipkBaru;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja(double ipk) {
        if (ipk>=3.5) {
            return "Kinerja sangat baik";
        } else if (ipk>=3.0) {
            return "Kinerja baik";
        } else if (ipk>=2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public static void main(String[] args) {
        MahasiswaMain23 mhs1 = new MahasiswaMain23();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
    }
}
