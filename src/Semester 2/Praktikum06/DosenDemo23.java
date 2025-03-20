public class DosenDemo23 {
    public static void main(String[] args) {
        DataDosen23 list = new DataDosen23();
        Dosen23 m1 = new Dosen23("101","Rafa",true,30);
        Dosen23 m2 = new Dosen23("102","Afar",true,39);
        Dosen23 m3 = new Dosen23("103","Fafa",true,29);
        Dosen23 m4 = new Dosen23("104","Rara",false,29);
        Dosen23 m5 = new Dosen23("105","Alief",true,41);
        Dosen23 m6 = new Dosen23("106","Eva",false,36);
        Dosen23 m7 = new Dosen23("107","Feyza",false,28);
        Dosen23 m8 = new Dosen23("108","Kaela",false,32);
        Dosen23 m9 = new Dosen23("109","Ali",true,42);
        Dosen23 m10 = new Dosen23("110","Ayunda",false,33);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);
        list.tambah(m6);
        list.tambah(m7);
        list.tambah(m8);
        list.tambah(m9);
        list.tambah(m10);

        System.out.println("Data dosen sebelum sorting: ");
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan BUBBLE SORT (ASC): ");
        list.sortingASC();
        list.tampil();
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (DSC): ");
        list.sortingDSC();
        list.tampil();
    }
}