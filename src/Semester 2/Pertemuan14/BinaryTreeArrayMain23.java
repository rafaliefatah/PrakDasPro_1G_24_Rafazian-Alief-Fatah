package Pertemuan14;

public class BinaryTreeArrayMain23 {
    public static void main(String[] args) {
        BinaryTreeArray23 bta = new BinaryTreeArray23();
        
        Mahasiswa23 mhs1 = new Mahasiswa23("244160121", "Ali", "A", 3.57);
        Mahasiswa23 mhs2 = new Mahasiswa23("244160185", "Candra", "C", 3.41);
        Mahasiswa23 mhs3 = new Mahasiswa23("244160221", "Badar", "B", 3.75);
        Mahasiswa23 mhs4 = new Mahasiswa23("244160220", "Dewi", "B", 3.35);

        Mahasiswa23 mhs5 = new Mahasiswa23("244160131", "Devi", "A", 3.48);
        Mahasiswa23 mhs6 = new Mahasiswa23("244160205", "Ehsan", "D", 3.61);
        Mahasiswa23 mhs7 = new Mahasiswa23("244160170", "Fizi", "B", 3.86);

        bta.add(mhs1);
        bta.add(mhs2);
        bta.add(mhs3);
        bta.add(mhs4);
        bta.add(mhs5);
        bta.add(mhs6);
        bta.add(mhs7);

        System.out.println("\nPreOrder Transversal Mahasiswa: ");
        bta.traversePreOrder(0);
    }
}