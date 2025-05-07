package Jobsheet9;
public class StackTugasMahasiswa23 {
    Mahasiswa23[] stack;
    int top,size,tugas=0;

    public StackTugasMahasiswa23(int size) {
        this.size=size;
        stack = new Mahasiswa23[size];
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

    public void push(Mahasiswa23 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
            tugas++;
        } else {
            System.out.println("Stack sudah penuh! Tidak bisa menambahkan tugas lagi");
        }
    }
    
    public Mahasiswa23 pop() {
        if (!isEmpty()) {
            Mahasiswa23 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai");
            return null;
        }
    }

    public Mahasiswa23 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada yang mengumpulkan tugas");
            return null;
        }
    }

    public Mahasiswa23 peekTerbawah() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong! Tidak ada yang mengumpulkan tugas");
            return null;
        }
    }

    public int banyakTugas() {
        return tugas;
    }

    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama+"\t"+stack[i].nim+"\t"+stack[i].kelas);
        }
    }
}