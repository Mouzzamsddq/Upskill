import java.util.LinkedList;

public class LinkedListStackAdapter {
    public static class StackAdapter {
        private LinkedList<Integer> linkedList = new LinkedList<>();
        
        public int size() {
            return linkedList.size();
        }

        public void push(int data) {
            linkedList.add(0, data);
        }

        public int pop() {
            if(linkedList.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            } else {
               return linkedList.removeFirst();
            }
        }

        public int peek() {
            if(linkedList.size() == 0) {
                System.out.println("Stack underflow");
                return -1;
            }  else {
                return linkedList.get(0);
            }
        }
        
        public void print() {
            for(Integer each: linkedList) {
                System.out.print(each+" ");
            }
        }
    }
    public static void main(String [] args) {
         // check whether stack is working fine
         StackAdapter stackAdapter = new StackAdapter();
         stackAdapter.push(10);
         stackAdapter.push(20);
         stackAdapter.push(30);
         stackAdapter.push(40);
         stackAdapter.push(50);
         stackAdapter.print();
         System.out.println();
         System.out.println(stackAdapter.peek());
         
        
    }
}