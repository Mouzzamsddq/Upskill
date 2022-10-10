
class Node {
    int data;
    Node next;
}

public class MyLinkedList {
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

    private Node getNodeAt(int index) {
        Node tempHead = head;
        int count = 0;
        while (count < index) {
            tempHead = tempHead.next;
            count++;
        }
        return tempHead;
    }

    public void reverseDI() {
        int l = 0;
        int r = size - 1;
        while (l < r) {
            Node leftNode = getNodeAt(l);
            Node rightNode = getNodeAt(r);

            int temp = leftNode.data;
            leftNode.data = rightNode.data;
            rightNode.data = temp;

            l++;
            r--;
        }
    }

    public void reversePI() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;

            curr.next = prev;

            prev = curr;
            curr = next;
        }

        Node temp = head;
        head = tail;
        tail = temp;
    }
}