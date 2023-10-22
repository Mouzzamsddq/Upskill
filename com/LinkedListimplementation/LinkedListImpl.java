public class LinkedListImpl {
    public static class Node {
        int data;
        Node next;

        public Node(int val) {
            data = val;
            next = null;
        }
    }

    public static class LinkedList {
        private Node head;
        private int size;

        public void addLast(int val) {
            Node lastNode = new Node(val);
            if(head == null) {
                head = lastNode;
            } else {
                Node tempHead = head;
                while(tempHead.next != null) {
                    tempHead = tempHead.next;
                }
                tempHead.next = lastNode;
            }
            size++;
        }

        public void print() {
            if(head == null) {
                System.out.println("Linkedlist is empty");
                return;
            }
            Node tempHead = head;
            while(tempHead != null) {
                System.out.print(tempHead.data + " ");
                tempHead = tempHead.next;
            }
            System.out.println();
        }
        public int size() {
           return this.size;   
        }

        public void removeFirst() {
            if(head == null) {
                System.out.println("Linkedlist is empty");
            } else {
                size--;
                head = head.next;
            }
        }

        public void addFirst(int data) {
            Node firstNode = new Node(data);
            size++;
            if(head == null) {
                head = firstNode;
            } else {
                firstNode.next = head;
                head = firstNode;
            }
        }
        public int getFirst()  {
            if(head == null) {
                System.out.println("Linkedlist is empty");
                return -1;
            }
            return head.data;
        }

        public int getLast() {
            if(head == null) {
                System.out.println("Linkedlist is empty");
                return -1;
            }
            Node tempHead = head;
            while(tempHead.next != null) {
                 tempHead = tempHead.next;
            }
            return tempHead.data;

        }

        public int getAt(int index) {
            if(head == null) {
                System.out.println("Linkedlist is empty");
                return -1;
            } else if(index < 0 || index >= size) {
                System.out.println("Please give valid index..!");
                return -1;
            } else if(index == 0){
                return getFirst();
            } else if(index == size - 1) {
                return getLast();
            } else {
                Node tempHead = head;
                while(index != 0) {
                    tempHead = tempHead.next;
                    index--;
                }
                return tempHead.data;
            }
        }
     
    }



    public static void main(String []args) {
       LinkedList linkedList = new LinkedList();
       linkedList.addLast(10);
       linkedList.addLast(20);
       linkedList.print();  
       System.out.println("Size of the linked list: "+linkedList.size());  
       linkedList.removeFirst();
       linkedList.print();
       linkedList.addFirst(10);
       linkedList.addFirst(5);
       linkedList.print();
       System.out.println(linkedList.getFirst());
       System.out.println(linkedList.getLast());
       System.out.println(linkedList.getAt(1));
       linkedList.addLast(30);
       linkedList.addLast(40);
       linkedList.print();
       System.out.println(linkedList.getAt(3));
    
    }
}
