public class DoublyLinkedListImpl {
    public static void main(String []args) {
          //create an array with 5 values
          int []arr = new int[]{10,20,30,40,50};
          Node headNode = convertArrToDll(arr);
          Node tempNode = headNode;
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