public class Dosen23 {
    String kode,nama;
    boolean jenisKelamin;
    int usia;

    Dosen23() {
    }

    Dosen23(String kd, String name, boolean jk, int age) {
        kode=kd;
        nama=name;
        jenisKelamin=jk;
        usia=age;
    }

    void tampilInformasi() {
        System.out.println("Nama: "+nama);
        System.out.println("Kode: "+kode);
        System.out.println("Jenis Kelamin: "+(jenisKelamin?"Pria":"Wanita"));
        System.out.println("Usia: "+usia);
    }

}
