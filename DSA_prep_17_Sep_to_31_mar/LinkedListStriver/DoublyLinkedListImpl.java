public class DoublyLinkedListImpl {
    public static void main(String []args) {
          //create an array with 5 values
          int []arr = new int[]{10,20,30,40,50};
          Node headNode = convertArrToDll(arr);
          headNode = insertAtGivenNode(headNode, 25, 60);   
          printDLL(headNode);
    }

    public static void printDLL(Node head) {
        Node tempNode = head;
          while(tempNode != null) {
               System.out.print(tempNode.data +" ");
               tempNode = tempNode.next;
          }
    }

    public static Node convertArrToDll(int []arr) {
         if(arr.length == 0) {
            return null;
         }
         Node headNode = new Node(arr[0]);
         Node tempNode = headNode;
         for(int i = 1 ; i < arr.length ; i++) {
             Node eachNode = new Node(arr[i]);
             eachNode.prev = tempNode;
             tempNode.next = eachNode;
             tempNode = tempNode.next;
         }
         return headNode;
    }

    /*
     * T.C. - O(1)
     * S.C. - O(1)
     */
    public static Node  deleteFromBeg(Node head) {
        if(head ==  null) {
            return head;
         }
         head = head.next;
         if(head != null)
             head.prev = null;
         return head;
    }

    /*
     * T.C.- O(n) - worst case
     * S.C. - O(1) 
     */
    public static Node deleteLastNode(Node head) {
        if(head == null) {
            return head;
        }
        Node temp = head;
        if(temp.next == null) {
            return null;
        }
        while(temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        if(temp.next != null)
             temp.next.prev = null;
        temp.next = null;
        return head;
   }

   /*
    * T.C. - O(1)
    * S.C. - O(1)
    */
   public static Node insertAtFront(Node head, int k) {
    Node newNode = new Node(k);
    newNode.next = head;
    if(head != null) {
        head.prev = newNode;
    }
    head = newNode;
    return head;
}

/*
 * T.C. - O(n)
 * S.C. - O(1)
 */
public static Node insertBeforeTail(Node head, int K) {
         Node newNode = new Node(K);
         if(head == null) {
             head = newNode;
             return head;
         }
         if(head.next == null) {
             newNode.next = head;
             head.prev = newNode;
             head = newNode;
             return head;
         }
         Node temp = head;
         while(temp.next != null && temp.next.next != null) {
             temp = temp.next;
         }
         newNode.next = temp.next;
         newNode.prev = temp;
         temp.next.prev = newNode;
         temp.next = newNode;
         return head;
      }

      /*
       * T.C. - O(k)
       * S.C - O(1)
       */
      public static Node insertBeforeKthNode(Node head, int k, int val) {
        if(k < 1) {
            return head;
        }
        if(k == 1) {
            Node n = new Node(val);
            n.next = head;
            if(head != null) {
                head.prev = n;
            }
            head = n;
            return head;
        }

        int count = 1;
        Node temp = head;
        while(temp != null) {
            if(count == k - 1) {
                Node n = new Node(val);
                n.next = temp.next;
                n.prev = temp;
                temp.next.prev = n;
                temp.next = n;
                break;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }

    public static Node insertAtGivenNode(Node head, int val, int x) {
        // Write Your Code Here.
        if(head == null) {
            Node n = new Node(val);
            head = n;
            return head;
        }
        if(head.data == x) {
            Node n = new Node(val);
            n.next = head;
            head.prev = n;
            head = n;
            return head;
        }

        Node temp = head;
        while(temp.next != null) {
            if(temp.next.data == x) {
                Node n = new Node(val);
                n.next = temp.next;
                n.prev = temp;
                temp.next.prev = n;
                temp.next = n;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
}


class Node {
    Node prev;
    int data;
    Node next;

    public Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}