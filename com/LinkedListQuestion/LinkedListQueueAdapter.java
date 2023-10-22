import java.util.LinkedList;

public class LinkedListQueueAdapter {

    public static class QueueAdapter {
        private LinkedList<Integer> linkedList = new LinkedList<Integer>();
        
        public void enqueue(int data) {
            linkedList.addLast(data);
        }

        public int dequeue() {
            if(size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            } else {
                return linkedList.removeFirst();
            }
        }

        public int peek() {
            if(size() == 0) {
                System.out.println("Queue underflow");
                return -1;
            } else {
                return linkedList.getFirst();
            }
        }

        public int size() {
            return linkedList.size();
        }
        
        public void print() {
            for(Integer each: linkedList) {
                System.out.print(each+" ");
            }
            System.out.println();
        }
    }
   public static void main(String [] args) {
       QueueAdapter queueAdapter = new QueueAdapter();
       queueAdapter.enqueue(10);
       queueAdapter.enqueue(20);
       queueAdapter.enqueue(30);
       queueAdapter.enqueue(40);
       queueAdapter.enqueue(50);
       queueAdapter.print();
       System.out.println(queueAdapter.dequeue());
       queueAdapter.print();
       System.out.println("peek:"+queueAdapter.peek());
       queueAdapter.print();
   }
}