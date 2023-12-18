public class DoublyLinkedListImpl {
    public static void main(String []args) {
          //create an array with 5 values
          int []arr = new int[]{10,20,30,40,50};
          Node headNode = convertArrToDll(arr);
          headNode = deleteFromBeg(headNode);
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