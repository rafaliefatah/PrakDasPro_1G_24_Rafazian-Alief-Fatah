package Jobsheet10Tugas;
public class AntrianKRS {
    Mahasiswa23[] data;
    int front,rear,size,max,diproses;

    public AntrianKRS(int max) {
        this.max=max;
        this.data = new Mahasiswa23[max];
        this.size=0;
        this.front=0;
        this.rear=-1;
    }

    public boolean isEmpty() {
        if (size==0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size==max) {
            return true;
        } else {
            return false;
        }
    }

    public void tampilTerdepan() {
        if (!isEmpty()) {
            System.out.println("2 mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS: ");
            for (int i = 0; i < 2; i=(i+1) % max) {
                if (data[front+i]!=null) {
                    data[front+i].tampilkanData();
                }
            }
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar mahasiswa dalam antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS: ");
        for (int i = 0; i < size; i++) {
            int index = (front+i) % max;
            System.out.print((i+1)+". ");
            data[index].tampilkanData();
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front=rear=-1;
            size=0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa23 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }
        rear = (rear+1) % max;
        data[rear]=mhs;
        size++;
        System.out.println(mhs.nama+" berhasil masuk ke antrian");
    }

    public Mahasiswa23 panggilMahasiswa() {
        if (diproses==30) {
            System.out.println("DPA sudah menangani 30 mahasiswa");
            return null;
        }
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        }
        Mahasiswa23 mhs = data[front];
        front = (front+1) % max;
        size--;
        diproses++;
        return mhs;
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void tampilTerakhir() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS: ");
            data[rear].tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public int jumlahSudah() {
        return diproses;
    }

    public int jumlahBelum() {
        return size;
    }
}