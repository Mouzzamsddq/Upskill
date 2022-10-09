import java.util.Scanner;

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
    }

}
