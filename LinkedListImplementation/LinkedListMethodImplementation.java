import java.util.Scanner;

import javax.crypto.AEADBadTagException;
import javax.sound.sampled.Line;

public class LinkedListMethodImplementation {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public void display() {
            Node tempHead = head;
            while (tempHead != null) {
                System.out.print(tempHead.data + " ");
                tempHead = tempHead.next;
            }
            System.out.println();
        }

        public int size() {
            return size;
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("LinkedList is empty");
            } else if (size == 1) {
                head = tail = null;
                size--;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if (size == 0) {
                System.out.println("Linked list is empty");
                return -1;
            } else {
                return head.data;
            }
        }

        public int getLast() {
            if (size == 0) {
                System.out.println("Linked list is empty");
                return -1;
            } else {
                return tail.data;
            }
        }

        public int getAt(int index) {
            if (size == 0) {
                System.out.println("Linked list is empty");
                return -1;
            } else if (index < 0 || index >= size) {
                System.out.println("Invalid arguments");
                return -1;
            } else {
                Node tempHead = head;
                int count = 0;
                while (count < index) {
                    tempHead = tempHead.next;
                    count++;
                }
                return tempHead.data;
            }
        }

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;
            if (size == 0) {
                tail = temp;
            }
            size++;
        }

        public void addAt(int index, int val) {
            if (index < 0 || index > size) {
                System.out.println("Invalid arguments");
            } else if (index == 0) {
                addFirst(val);
            } else if (index == size) {
                addLast(val);
            } else {
                Node temp = new Node();
                temp.data = val;
                temp.next = null;
                Node tempHead = head;
                for (int i = 0; i < index - 1; i++) {
                    tempHead = tempHead.next;
                }
                temp.next = tempHead.next;
                tempHead.next = temp;
                size++;
            }

        }

        public void removeLast() {
            if (size == 0) {
                System.out.println("Linked list is empty");
            } else if (size == 1) {
                head = tail = null;
                size = 0;
            } else {
                Node tempHead = head;
                for (int i = 0; i < size - 2; i++) {
                    tempHead = tempHead.next;
                }
                tempHead.next = null;
                tail = tempHead;
                size--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        linkedList.addLast(4);
        linkedList.display();

        // size of the linked list
        System.out.println("Size of the linked list : " + linkedList.size());

        // remove first
        linkedList.removeFirst();
        // after remove first then display
        linkedList.display();

        // get first data
        System.out.println("First element is  : " + linkedList.getFirst());

        // get Last data
        System.out.println("Last element is : " + linkedList.getLast());

        // get ith index data
        int i = 1;
        System.out.println(i + "th index data : " + linkedList.getAt(i));

        // add data at first position
        linkedList.addFirst(10);
        linkedList.addFirst(12);

        // display linked list after add data at first position
        linkedList.display();

        // add element at ith index
        i = 0;
        linkedList.addAt(i, 19);

        // display linked list
        linkedList.display();

        i = linkedList.size;
        linkedList.addAt(i, 20);
        // display linked list
        linkedList.display();

        i = 3;
        linkedList.addAt(i, 1);
        // display linked list
        linkedList.display();
        System.out.println("size of linked list : " + linkedList.size());

        // remove last
        linkedList.removeLast();
        linkedList.display();
    }

}
