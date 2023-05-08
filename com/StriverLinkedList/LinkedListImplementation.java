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
        public void removeAt(int idx) {
            if(idx < 0 || idx >= size) {
                System.out.println("Invalid args");
            } else if(size == 0) {
                System.out.println("List is empty");
            } else if(idx == 0){
                removeFirst();
            } else if(idx == size -1) {
                removeLast();
            } else {
                Node tempHead = head;
                for(int i = 0 ; i < idx - 1 ; i++) {
                    tempHead = tempHead.next;
                }
                tempHead.next = tempHead.next.next;
                size--;
            }
        }

        public int kThNodeFromLast(int k) {
            if(k < 0 || k >=  size) {
                System.out.println("Invalid args...!");
                return -1;
            }
            Node slow = head;
            Node fast = head;
            
            for(int i = 0; i < k ; i++) {
                fast = fast.next;
            }

            while(fast != tail) {
                slow = slow.next;
                fast = fast.next;
            }

            return slow.data;
        }

        public int midOfLinkedList() {
            Node slow = head;
            Node fast = head;
            
            while(fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow.data;
        }


        public static LinkedList mergeTwoSortedLinkedList(LinkedList linkedList1 , LinkedList linkedList2) {
            LinkedList mergedList = new LinkedList();
            Node temp1 = linkedList1.head;
            Node temp2 = linkedList2.head;
            while(temp1 != null && temp2 != null) {
                if(temp1.data < temp2.data) {
                     mergedList.addLast(temp1.data);
                     temp1 = temp1.next;
                } else {
                     mergedList.addLast(temp2.data);
                     temp2 = temp2.next;
                }
            }
            
            while(temp1 != null) {
                mergedList.addLast(temp1.data);
                temp1 = temp1.next;
            }

            while(temp2 != null) {
                mergedList.addLast(temp2.data);
                temp2 = temp2.next;
            }

            return mergedList;
        }

        public void clear() {
            head = tail = null;
            size = 0;
        }

        public Node getMidNode(Node head, Node tail) {
            Node slow = head;
            Node fast = tail;
            while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        public LinkedList mergeSort(Node head, Node tail) {
            if(head == tail) {
                LinkedList baseList = new LinkedList();
                baseList.addLast(head.data);
                return baseList;
            }
            Node midNode = getMidNode(head, tail);
            LinkedList fsh = mergeSort(head, midNode);
            LinkedList ssh = mergeSort(midNode.next, tail);
            LinkedList finalList = mergeTwoSortedLinkedList(fsh, ssh);
            return finalList;
        }

        public void removeDuplicatesFromSortedLinkedList() {
            LinkedList res  = new LinkedList();
            while(this.size() > 0) {
                int val  = this.getFirst();
                this.removeFirst();

                if(res.size() == 0 || res.tail.data != val) {
                    res.addLast(val);
                }
            }

            this.head = res.head;
            this.tail = res.tail;
            this.size = res.size;
        }

        public void oddEven() {
            LinkedList odd = new LinkedList();
            LinkedList even = new LinkedList();
            while(this.size() > 0) {
                int val = getFirst();
                if(val % 2 == 0) {
                    even.addLast(val);
                } else {
                    odd.addLast(val);
                }
                this.removeFirst();
            }


            if(odd.size > 0 && even.size > 0) {
                odd.tail.next = even.head;
                this.head = odd.head;
                this.tail = even.tail;
                this.size = odd.size + even.size;
            } else if(odd.size > 0) {
                this.head = odd.head;
                this.tail = odd.tail;
                this.size = odd.size;
            } else if(even.size > 0) {
                this.head = even.head;
                this.tail = even.tail;
                this.size = even.size;
            }
           

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
        list.removeAt(3);
        list.display();
        list.removeAt(0);
        list.display();
        list.removeAt(3);
        list.display();
        System.out.println("Kth Node : "+ list.kThNodeFromLast(2));
        System.out.println("Mid of the linked list : "+list.midOfLinkedList());
        
        list.clear();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);

        LinkedList list2 = new LinkedList();
        list2.addLast(12);
        list2.addLast(24);
        list2.addLast(34);
        list2.addLast(54);

        LinkedList mergedList = LinkedList.mergeTwoSortedLinkedList(list, list2);
        mergedList.display();
        LinkedList list3 = new LinkedList();
        list3.addLast(10);
        list3.addLast(2);
        list3.addLast(99);
        list3.addLast(50);
        list3.addLast(19);
        list3.addLast(12);
        list3.addLast(55);
        list3 = list3.mergeSort(list3.head, list3.tail);
        list3.display();

        LinkedList l4 = new LinkedList();
        l4.addLast(10);
        l4.addLast(10);
        l4.addLast(10);
        l4.addLast(10);
        l4.addLast(20);
        l4.addLast(20);
        l4.addLast(20);
        l4.addLast(30);
        l4.addLast(30);
        l4.addLast(30);
        l4.addLast(40);
        l4.addLast(50);
        l4.display();
        l4.removeDuplicatesFromSortedLinkedList();
        l4.display();


        // for testing odd even 
        LinkedList testOddEvenList = new LinkedList();
        testOddEvenList.addLast(5);
        testOddEvenList.addLast(6);
        testOddEvenList.addLast(12);
        testOddEvenList.addLast(13);
        testOddEvenList.addLast(8);
        testOddEvenList.addLast(88);
        testOddEvenList.addLast(17);
        testOddEvenList.addLast(15);
        testOddEvenList.addLast(30);
        testOddEvenList.addLast(31);
        testOddEvenList.display();
        testOddEvenList.oddEven();
        testOddEvenList.display();

    }
}
