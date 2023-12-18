public class LinkedListImpl {
    public static void main(String []args) {
        Node node = new Node(10);
        System.out.println(node.data);
        

        // creating array
        int[] arr = new int[]{1,5,13,12,16};
        Node head = convertArrToLL(arr);
        head = deleteAtPos(head, 1);
        // traversal 
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

        System.out.println();
        System.out.println("Length of linkedList : "+lengthOfLL(head));

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

    /*
     * T.C. - O(n)
     */
    public static int lengthOfLL(Node head) {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    /*
     * T.C. - O(n) - worst case
     *      - O(1) - Best Case
     */
    public static int searchElement(Node head, int ele) {
        Node temp = head;
        while(temp != null) {
            if(temp.data == ele) {
                return 1;    
            }
            temp = temp.next;
        }

        return 0;
    }


    /*
     * T.C. - O(1) - 
     */
    public static Node deletionFrombeg(Node head) {
        if(head == null) {
            return head;
        }
        return head.next;
    }

    /*
     * T.C. - O(n)
     * S.C - O(1)
     */
    public static Node deletionFromEnd(Node head) {
        if(head == null) {
            return head;
        }
        Node temp = head;
        while(temp.next != null && temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    public static Node deleteAtPos(Node head, int pos) {
        if(head == null) {
			return head;
		} 
	    if(pos < 0) {
			return head;
		}
		if(pos == 0) {
			return head.next;
		}
		pos = pos - 1;
		Node temp = head;
		while(pos > 0) {
			if(temp == null) {
				return head;
			}
			temp = temp.next;
			if(temp == null) {
				return head;
			}
			pos--;
		}
		if(temp.next == null) {
			return head;
		}
		temp.next  = temp.next.next;
		return head;
    }

    /*
     * T.C. - O(1)
     * S.C. - O(1)
     */
    public static Node insertAtBeg(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return head;    
    }

    /*
     * T.C. - O(n) - worst case, O(1) - best case
     * S.C. - O(1) 
     */
    public static Node insertAtEnd(Node head, int data) {
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    /*
     * T.C. - O(k) 
     * S.C. - O(1)
     */
    public static Node insertAtPos(Node head, int n, int pos, int val) {
        int count = 0;
        Node newNode = new Node(val);
        if(pos == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node temp = head;
        while(temp != null) {
            if(count == pos - 1) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
            count++;
        }
        return head;
    }

    /*
     * T.C. - O(k) 
     * S.C. - O(1)
     */
    public static Node insertBeforeValue(Node head, int x, int val) {
        Node newNode = new Node(x);
        Node temp = head;
        if(temp.data == val) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        while(temp != null) {
            if(temp.next == null) {
                break;
            }
            if(temp.next.data == val) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
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