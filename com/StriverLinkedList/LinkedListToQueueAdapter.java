import java.util.LinkedList;

import javax.sound.sampled.Line;

public class LinkedListToQueueAdapter {
    public static class QueueAdapter {
        private LinkedList<Integer> list;
        
        public QueueAdapter() {
            this.list = new LinkedList<>();
        }

        // this method add the val in the end of the queue
        public void add(int val) {
            list.addLast(val);
        }

        // this method remove the element from the starting of the queue
        public int remove() {
            if(list.size() == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return list.removeFirst();
        }

        // this method  return the first element of the queue
        public int peek() {
            if(list.size() == 0) {
                System.out.println("Queue is empty");
                return -1;
            }
            return list.getFirst();
        }

        // this method return the size of the queue
        public int size() {
             return list.size();
        }
    }

    public static void main(String []args) {
        QueueAdapter queueAdapter = new QueueAdapter();
        queueAdapter.add(10);
        queueAdapter.add(20);
        queueAdapter.add(30);
        queueAdapter.add(40);
        System.out.println("First element of the queue -> "+ queueAdapter.peek());
        System.out.println("Remove the last element from the queue -> "+ queueAdapter.remove());
    }
}