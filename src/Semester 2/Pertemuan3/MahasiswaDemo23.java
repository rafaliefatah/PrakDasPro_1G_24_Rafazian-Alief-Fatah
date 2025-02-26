public class MahasiswaDemo23 {
    public static void main(String[] args) {
        Mahasiswa23[] arrayOfMahasiswa23 = new Mahasiswa23[3];

        arrayOfMahasiswa23[0] = new Mahasiswa23();
        arrayOfMahasiswa23[0].nim = "244107060033";
        arrayOfMahasiswa23[0].nama = "AGNES TITANIA KINANTI";
        arrayOfMahasiswa23[0].kelas = "SIB-1E";
        arrayOfMahasiswa23[0].ipk = (float) 3.75;

        arrayOfMahasiswa23[1] = new Mahasiswa23();
        arrayOfMahasiswa23[1].nim = "2341720172";
        arrayOfMahasiswa23[1].nama = "ACHMAD MAULANA HAMZAH";
        arrayOfMahasiswa23[1].kelas = "TI-2A";
        arrayOfMahasiswa23[1].ipk = (float) 3.36;

        arrayOfMahasiswa23[2] = new Mahasiswa23();
        arrayOfMahasiswa23[2].nim = "244107023006";
        arrayOfMahasiswa23[2].nama = "DIRHAMAWAN PUTRANTO";
        arrayOfMahasiswa23[2].kelas = "TI-2E";
        arrayOfMahasiswa23[2].ipk = (float) 3.80;

        System.out.println("NIM     : "+arrayOfMahasiswa23[0].nim);
        System.out.println("Nama    : "+arrayOfMahasiswa23[0].nama);
        System.out.println("Kelas   : "+arrayOfMahasiswa23[0].kelas);
        System.out.println("IPK     : "+arrayOfMahasiswa23[0].ipk);
        System.out.println("------------------------------------");
        System.out.println("NIM     : "+arrayOfMahasiswa23[1].nim);
        System.out.println("Nama    : "+arrayOfMahasiswa23[1].nama);
        System.out.println("Kelas   : "+arrayOfMahasiswa23[1].kelas);
        System.out.println("IPK     : "+arrayOfMahasiswa23[1].ipk);
        System.out.println("------------------------------------");
        System.out.println("NIM     : "+arrayOfMahasiswa23[2].nim);
        System.out.println("Nama    : "+arrayOfMahasiswa23[2].nama);
        System.out.println("Kelas   : "+arrayOfMahasiswa23[2].kelas);
        System.out.println("IPK     : "+arrayOfMahasiswa23[2].ipk);
        System.out.println("------------------------------------");
    }
}