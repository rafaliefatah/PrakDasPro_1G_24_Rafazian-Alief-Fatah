public class Mahasiswa23 {
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
        ipk=ipkBaru;
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
}