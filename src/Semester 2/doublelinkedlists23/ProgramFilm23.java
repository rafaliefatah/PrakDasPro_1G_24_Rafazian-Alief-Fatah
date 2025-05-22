public class ProgramFilm23 {
    NodeFilm23 head;
    int size;

    public ProgramFilm23() {
        head=null;
        size=0;
    }

    public boolean isEmpty() {
        return head==null;
    }

    public void addFirst(Film23 film) {
        if (isEmpty()) {
            head = new NodeFilm23(null, film, null);
        } else {
            NodeFilm23 newNode = new NodeFilm23(null, film, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Film23 film) {
        if (isEmpty()) {
            addFirst(film);
        } else {
            NodeFilm23 current = head;
            while (current.next!=null) {
                current = current.next;
            }
            NodeFilm23 newNode = new NodeFilm23(current, film, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(Film23 film, int index) throws Exception {
        if (isEmpty()) {
            addFirst(film);
        } else if (index<0 || index>size) {
            throw new Exception("Nilai index di luar batas");
        } else {
            NodeFilm23 current = head;
            int i=0;
            while (i<index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                NodeFilm23 newNode = new NodeFilm23(null, film, current);
                current.prev = newNode;
                head = newNode;
            } else {
                NodeFilm23 newNode = new NodeFilm23(current.prev, film, current);
                newNode.prev = current.prev;
                newNode.next = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("List film masih kosong");
        } else if (size==1) {
            removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("List film masih kosong");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        NodeFilm23 current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index>=size) {
            throw new Exception("List film");
        } else if (index==0) {
            removeFirst();
        } else {
            NodeFilm23 current = head;
            int i=0;
            while (i<index) {
                current = current.next;
                i++;
            }
            if (current.next==null) {
                current.prev.next = null;
            } else if (current.prev==null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }


    public void print() throws Exception {
        if (isEmpty()) {
            throw new Exception("List film masih kosong");
        } else {
            System.out.println("Cetak Data");
            NodeFilm23 temp = head;
            while (temp!=null) {
                temp.film.identitasFilm();
                temp = temp.next;
            }
        }
    }

    public void search(int id) {
        boolean ditemukan=false;
        NodeFilm23 current = head;
        int i=0;
        int index;
        while (i<size) {
            current = current.next;
            i++;
            if ((current.film.id==id)) {
                ditemukan=true;
                index=i;
                System.out.println("Data ID Film: "+id+" berada di node ke-"+index);
                System.out.println("IDENTITAS: ");
                current.film.identitasFilm();
                break;
            }
        }
        if (ditemukan!=true) {
            System.out.println("Nama mahasiswa tidak ditemukan");
        }
    }

    public void sorting() {
        for (NodeFilm23 i = head; i != null; i = i.next) {
            for (NodeFilm23 j = i.next; j != null; j = j.next) {
                if (i.film.rating < j.film.rating) {
                    Film23 temp = i.film; 
                    i.film = j.film; 
                    j.film = temp;
                }
            }
        }
    }
}