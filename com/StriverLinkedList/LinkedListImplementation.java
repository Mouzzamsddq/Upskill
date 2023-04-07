import javax.xml.transform.Templates;

public class LinkedListImplementation {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        public void addLast(int ele) {
            // create a node with the new element
            Node newNode = new Node();
            newNode.data = ele;
            // because it is the last element that is why it is null
            newNode.next = null;
            if(size == 0) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            // this method is used to display the list
            Node tempHead = head;
            while(tempHead != null) {
                System.out.print(tempHead.data+" ");
                tempHead = tempHead.next;
            }
            System.out.println();
        }

        public void removeFirst() {
            if(size == 0) {
                System.out.println("List is empty");
            } else if(size == 1) {
                head = tail = null;
                size--;
            } else {
                head = head.next;
                size--;
            }
        }

        public int getFirst() {
            if(size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return head.data;
        }

        public int getLast() {
            if(size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            return  tail.data;
        }

        public int getAt(int idx) {
            if(size == 0) {
                System.out.println("List is empty");
                return -1;
            }
            if(idx < 0 || idx >= size) {
                System.out.println("Invalid argument");
                return -1;
            }
            Node tempHead = head;
            for(int i = 0 ; i < idx ; i++) {
                tempHead = tempHead.next;
            }
            return tempHead.data;
        }

        public Node getNodeAt(int idx) {
            if(size == 0) {
                System.out.println("List is empty");
                return head;
            } else if(idx < 0 || idx >= size) {
                System.out.println("Invalid argument");
                return head;
            } else {
            Node tempHead = head;
            for(int i = 0 ; i < idx ; i++) {
                tempHead = tempHead.next;
            }
            return tempHead;
        }
        }

        public void addFirst(int ele) {
            Node newNode = new Node();
            newNode.data = ele;
            newNode.next = head;
            head = newNode; 
            if(size == 0) {
                tail = head;
            } 
            size++;
        }

        public void addAt(int idx, int val) {
            if(idx < 0 || idx >size) {
                System.out.println("Invalid args");
                return;
            }
            if(idx == 0) {
                addFirst(val);
                return;
            }
            if(idx == size) {
                addLast(val);
                return;
            }
            Node tempHead = head;
            for(int i = 0 ; i < idx - 1 ; i++) {
                tempHead = tempHead.next;
            }
            Node newNode = new Node();
            newNode.data = val;
            newNode.next = tempHead.next;
            tempHead.next = newNode;
            size++;

        }

        public void removeLast() {
            if(size == 0) {
                System.out.println("List is empty");
            } else if(size == 1) {
                head = tail = null;
                size--;
            } else {
                Node tempHead = head;
                while(tempHead.next.next != null) {
                    tempHead = tempHead.next;
                }
                tempHead.next = null;
                tail = tempHead;
                size--;
            }

        }

        public void reverseDI() {
            if(size == 0) {
                System.out.println("List is empty");
                return;
            }
            int start = 0;
            int end = size -1;
            while(start <= end) {
                Node startNode = getNodeAt(start);
                Node endNode = getNodeAt(end);
                int temp = startNode.data;
                startNode.data = endNode.data;
                endNode.data = temp;
                start++;
                end--;
            }
        }

        public void reversePI() {
            if(size == 0) {
                System.out.println("List is empty");
                return;
            }
            tail = head;
            Node current = head;
            Node prev = null;
            while(current != null) {
                Node temp = current.next;
                current.next = prev;
                prev = current;
                current = temp;
            }
            head = prev;
            
        }
    }

    public static void main(String [] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.display();
        list.addLast(50);
        list.addFirst(120);
        list.display();
        list.removeFirst();
        list.display();
        list.removeFirst();
        list.display();
        list.addLast(80);
        list.addLast(90);
        list.display();
        System.out.println("first element in list : "+list.getFirst());
        System.out.println("last element in list : "+list.getLast());
        System.out.println("Element in list at index 2 : "+list.getAt(2));
        System.out.println("Element in list at index 4 : "+list.getAt(4));
        System.out.println("Element in list at index 5 : "+list.getAt(5));
        list.addFirst(100);
        list.display();
        list.addAt(3, 500);
        list.display(); 
        list.addAt(5, 1);
        list.display();
        list.addAt(0, -1);
        list.display();
        list.addAt(10, 12);
        list.display();
        list.removeLast();
        list.display();
        list.removeLast();
        list.display();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.removeFirst();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        list.display();
        list.reverseDI();
        list.display();
        list.reversePI();
        list.display();
        list.reversePI();
        list.display();
    }
}
