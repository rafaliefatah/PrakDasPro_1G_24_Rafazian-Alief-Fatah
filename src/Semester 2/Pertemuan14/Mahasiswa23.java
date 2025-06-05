package Pertemuan14;

public class Mahasiswa23 {
    String nim,nama,kelas;
    double ipk;

    public Mahasiswa23() {
    }

    public Mahasiswa23(String nm, String name, String kls, double ip) {
        nim=nm;
        nama=name;
        kelas=kls;
        ipk=ip;
    }

    public void tampilInformasi() {
        System.out.println("NIM: "+nim+" Nama: "+nama+" Kelas: "+kelas+" IPK: "+ipk);
    }
}