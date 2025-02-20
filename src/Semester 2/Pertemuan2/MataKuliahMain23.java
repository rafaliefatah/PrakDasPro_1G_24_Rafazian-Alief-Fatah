public class MataKuliahMain23 {
    public static void main(String[] args) {
        MataKuliah23 mhs1 = new MataKuliah23();
        mhs1.kodeMK = "PRAKALSD_TI";
        mhs1.nama = "Rafazian Alief Fatah";
        mhs1.sks = 4;
        mhs1.jumlahJam = 4;

        mhs1.tampilInformasi();
        mhs1.ubahSKS(2);
        mhs1.tambahJam(4);
        mhs1.kurangiJam(2);
        mhs1.tampilInformasi();

        MataKuliah23 mhs2 = new MataKuliah23("ALSD_TI","Rafazian Alief Fatah",2,4);
        mhs2.tampilInformasi();
        mhs2.kurangiJam(5);
        mhs2.tampilInformasi();
    }
}