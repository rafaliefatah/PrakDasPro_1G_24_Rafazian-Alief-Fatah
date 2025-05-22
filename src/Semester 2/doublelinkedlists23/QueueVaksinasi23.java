public class QueueVaksinasi23 {
    NodeVaksinasi23 front,rear;
    int size;

    public QueueVaksinasi23() {
        front=rear=null;
        size=0;
    }

    public boolean isEmpty() {
        return front==null;
    }

    public void tambahAntrian(AntrianVaksinasi23 antri) {
        if (isEmpty()) {
            front = rear = new NodeVaksinasi23(null, antri, null);

        } else {
            NodeVaksinasi23 current = front;
            while (current.next!=null) {
                current = current.next;
            }
            NodeVaksinasi23 newNode = new NodeVaksinasi23(current, antri, null);
            current.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public void hapusAntrian() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        } else if (size==1) {
            if (front.next == null) {
            System.out.println(front.antri.nama+" telah selesai divaksinasi");
            front = null;
            size--;
            return;
        }
        NodeVaksinasi23 current = front;
        while (current.next != null) {
            current = current.next;
        }
        System.out.println(current.antri.nama+" telah selesai divaksinasi");
        current.next = null;
        } else {
            System.out.println(front.antri.nama+" telah selesai divaksinasi");
            front = front.next;
            front.prev = null;
        }
        size--;
    }

    public void tampilkanAntrian() throws Exception {
        if (isEmpty()) {
            throw new Exception("Antrian masih kosong");
        } else {
            System.out.println("+++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("+++++++++++++++++++++++");
            System.out.println("|No.\t|Nama\t|");
            NodeVaksinasi23 temp = front;
            while (temp!=null) {
                temp.antri.daftarAntrian();
                temp = temp.next;
            }
            System.out.println("Sisa antrian: "+size);
        }
    }
}