public class MataKuliah23 {
    String kodeMK,nama;
    int sks,jumlahJam;
    
    public MataKuliah23() {
    }
    
    public MataKuliah23(String mk, String nm, int sks, int jam) {
        kodeMK = mk;
        nama = nm;
        this.sks = sks;
        jumlahJam = jam;
    }

    void tampilInformasi() {
        System.out.println("\nKode Mata Kuliah: "+kodeMK);
        System.out.println("Nama: "+nama);
        System.out.println("SKS: "+sks);
        System.out.println("Jumlah Jam: "+jumlahJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah");
    }

    void tambahJam(int jam) {
        jumlahJam+=jam;
    }

    void kurangiJam(int jam) {
        if (jumlahJam<jam) {
            System.out.println("Pengurangan tidak dapat dilakukan");
        } else {
            jumlahJam-=jam;
        }
    }
}