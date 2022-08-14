import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueueImplementation {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            pq.add(number);
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
        sc.close();
    }
}

/*
 * priority queue diff operation time complexity
 * insertion - O(logn)
 * deletion - O(logn)
 */
