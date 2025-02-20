public class Dosen23 {
    String idDosen,nama,bidangKeahlian;
    boolean statusAktif;
    int tahunBergabung;

    public Dosen23() {
    }

    public Dosen23(String id, String nm, boolean status, int thnGabung, String bidang) {
        idDosen=id;
        nama=nm;
        statusAktif=status;
        tahunBergabung=thnGabung;
        bidangKeahlian=bidang;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen: "+idDosen);
        System.out.println("Nama: "+nama);
        if (statusAktif==true) {
            System.out.println("Status: Aktif");
        } else {
            System.out.println("Status: Tidak aktif");
        }
        System.out.println("Tahun Bergabung: "+tahunBergabung);
        System.out.println("Bidang Keahlian: "+bidangKeahlian);
        System.out.println();
    }

    void setStatusAktif(boolean status) {
        statusAktif=status;
        if (status==true) {
            System.out.println("Ubah status dosen menjadi aktif");
        } else {
            System.out.println("Ubah status dosen menjadi tidak aktif");
        }
    }

    int hitungMasaKerja(int thnSkrg) {
        thnSkrg-=tahunBergabung;
        return thnSkrg;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian=bidang;
    }
}