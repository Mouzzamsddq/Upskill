import java.util.LinkedList;

public class LinkedListToStackAdapter {
    public static class StackAdapter {
        LinkedList<Integer> list;
        
        // create a constructor to instantiate the list
        public StackAdapter() {
            this.list = new LinkedList<>();
        }

        // this method push the element at the top of the stack
        public void push(int val) {
            list.addFirst(val);
        }

        // this method remove the element from the top and return to the caller
        public int pop() {
            if(list.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            return list.removeFirst();
        }

        // this method return the top element of the stack data structure
        public int top() {
            if(list.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }
            return list.getFirst();
        }

        // this method returns the size of the stack
        public int size() {
            return list.size();
        }
        
        // this method check whether the list is empty or not
        public boolean isEmpty() {
             return list.isEmpty();
        }
    }

    public static void main(String [] args) {
        StackAdapter stackAdapter = new StackAdapter();
        stackAdapter.push(10);
        stackAdapter.push(20);
        stackAdapter.push(30);
        stackAdapter.push(40);
        System.out.println("The top element of stack -> "+stackAdapter.top());
        System.out.println("Remove the top element of the stack : "+stackAdapter.pop());
    }
}
