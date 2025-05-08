package Jobsheet9;
public class StackSurat23 {
    Surat23[] surat;
    int top,size;

    public StackSurat23(int size) {
        this.size=size;
        surat = new Surat23[size];
        top=-1;
    }

    public boolean isFull() {
        if (top==size) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top==-1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat23 s) {
        if (!isFull()) {
            top++;
            surat[top] = s;
        } else {
            System.out.println("Stack sudah penuh");
        }
    }
    
    public Surat23 pop() {
        if (!isEmpty()) {
            Surat23 s = surat[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public Surat23 peek() {
        if (!isEmpty()) {
            return surat[top];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public void search(String nama) {
        boolean ditemukan=false;
        int cari=0;
        for (int i = top; i >= 0; i--) {
            if (surat[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                ditemukan=true;
                cari=i;
                break;
            }
        }
        if (ditemukan!=true) {
            System.out.println("Nama mahasiswa tidak ditemukan");
        } else {
            System.out.println("Nama mahasiswa ditemukan");
            System.out.println("ID\tNama\tKelas\tIzin\tDurasi izin");
            System.out.println(surat[cari].idSurat+"\t"+surat[cari].namaMahasiswa+"\t"+surat[cari].kelas+"\t"+surat[cari].jenisIzin+"\t"+surat[cari].durasi);
        }
    }
}