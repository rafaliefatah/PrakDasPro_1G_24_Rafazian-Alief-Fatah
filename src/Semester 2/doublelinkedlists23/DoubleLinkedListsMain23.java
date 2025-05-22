public class DoubleLinkedListsMain23 {
    public static void main(String[] args) throws Exception {
        DoubleLinkedLists23 dll = new DoubleLinkedLists23();
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("========================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("========================");
        dll.removeLast();
        dll.print();
        System.out.println("Size: "+dll.size());
        System.out.println("========================");
        dll.remove(1);
        dll.print();
        System.out.println("Size: "+dll.size());
    }
}