
public class ReverseLinkedListWithPI {
    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.addLast(40);
        l.addLast(50);
        l.display();

        // // reverse with PI
        // l.reversePI();
        // l.display();
        // l.removeAt(3);
        // l.display();

        System.out.println(l.kthFromLast(2));

        // middle element of linked list
        System.out.println(l.midOfLinkedList());

    }

}
