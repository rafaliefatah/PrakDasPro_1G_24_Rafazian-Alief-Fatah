public class AntrianVaksinasi23 {
    String no,nama;

    public AntrianVaksinasi23(String no, String nama) {
        this.no=no;
        this.nama=nama;
    }

    public void daftarAntrian() {
        System.out.println("|"+no+"\t|"+nama+"\t|");
    }
}