public class DoubleLinkedListsMain23 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists23 dll = new DoubleLinkedLists23();
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("========================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("========================");
        System.out.println("Data awal pada linked lists adalah: "+dll.getFirst());
        System.out.println("Data terakhir pada linked lists adalah: "+dll.getLast());
        System.out.println("Data index ke-1 pada linked lists adalah: "+dll.get(1));
    }
}