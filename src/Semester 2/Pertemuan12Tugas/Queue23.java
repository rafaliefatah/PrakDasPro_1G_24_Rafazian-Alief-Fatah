public class Queue23 {
    NodeQueue23 front,rear;
    int size,max;

    public Queue23(int max) {
        this.max=max;
        front=rear=null;
        size=0;
    }

    public boolean isEmpty() {
        return (size==0);
    }

    public boolean isFull() {
        return (size==max);
    }

    public void tampilTerdepan() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA: ");
            if (front!=null) {
                front.data.tampilkanData();
            }
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void tampilkanSemua() {
        if (!isEmpty()) {
            NodeQueue23 tmp=front;
            System.out.println("Isi Linked List:\t");
            while (tmp!=null) {
                tmp.data.tampilkanData();
                tmp=tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front=rear=null;
            size=0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void tambahAntrian(Kemahasiswaan23 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa");
            return;
        }
        NodeQueue23 ndInput = new NodeQueue23(mhs, null);
        if (isEmpty()) {
            front=ndInput;
            rear=ndInput;
        } else {
            rear.next=ndInput;
            rear=ndInput;
        }
        size++;
    }

    public void panggilMahasiswa() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus");
        } else if (front==rear) {
            front.data.tampilkanData();
            front=rear=null;
        } else {
            front.data.tampilkanData();
            front=front.next;
        }
        size--;
    }

    public int getJumlahAntrian() {
        return size;
    }

    public void tampilTerakhir() {
        if (!isEmpty()) {
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA: ");
            rear.data.tampilkanData();
        } else {
            System.out.println("Antrian kosong");
        }
    }
}