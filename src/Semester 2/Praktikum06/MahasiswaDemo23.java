public class MahasiswaDemo23 {
    public static void main(String[] args) {
        MahasiswaBerprestasi23 list = new MahasiswaBerprestasi23();
        Mahasiswa23 m1 = new Mahasiswa23();
        Mahasiswa23 m2 = new Mahasiswa23();
        Mahasiswa23 m3 = new Mahasiswa23();
        Mahasiswa23 m4 = new Mahasiswa23();
        Mahasiswa23 m5 = new Mahasiswa23();

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil();
        // System.out.println("Data mahasiswa sesudah sorting berdasarkan IPK (DESC): ");
        // list.bubbleSort();
        // list.tampil();
        // System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        // list.selectionSort();
        // list.tampil();
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        list.insertionSort();
        list.tampil();
    }
}