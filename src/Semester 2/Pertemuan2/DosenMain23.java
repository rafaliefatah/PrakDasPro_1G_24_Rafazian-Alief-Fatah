public class DosenMain23 {
    public static void main(String[] args) {
        Dosen23 dsn1 = new Dosen23();
        dsn1.idDosen = "244107020100";
        dsn1.nama = "Rafazian Alief Fatah";
        dsn1.statusAktif = false;
        dsn1.tahunBergabung = 2021;
        dsn1.bidangKeahlian = "Algoritma dan Struktur Data";

        dsn1.tampilInformasi();
        dsn1.setStatusAktif(true);
        System.out.println("Masa kerja: "+dsn1.hitungMasaKerja(2025)+" tahun");
        dsn1.ubahKeahlian("Basis Data");
        dsn1.tampilInformasi();

        Dosen23 dsn2 = new Dosen23("244107020100", "Rafazian Alief Fatah", true, 2018, "Algoritma dan Struktur Data");
        dsn2.tampilInformasi();
        dsn2.setStatusAktif(false);
        System.out.println("Masa kerja: "+dsn2.hitungMasaKerja(2025)+" tahun");
        dsn2.tampilInformasi();
    }
}