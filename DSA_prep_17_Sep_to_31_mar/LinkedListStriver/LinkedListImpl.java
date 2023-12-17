public class LinkedListImpl {
    public static void main(String []args) {
        Node node = new Node(10);
        System.out.println(node.data);
        

        // creating array
        int[] arr = new int[]{1,5,13,12,16};
        Node head = convertArrToLL(arr);
        // traversal 
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }


    /*
     * T.C - O(n) - Simple traversal
     */
    public static Node convertArrToLL(int[] arr) {
        if(arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1 ; i < arr.length ; i++) {
            Node latestNode = new Node(arr[i]);
            temp.next = latestNode;
            temp = latestNode;
        }
        return head;
    }
}

class Node {
    int data;
    Node next;
    
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}