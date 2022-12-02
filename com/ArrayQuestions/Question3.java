
// find kth largest element  and kth smallest element :- Love Babbar DSA Sheet
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter value of k");
        int k = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for (int i = 0; i < n; i++) {
            if (i < k) {
                pq.add(a[i]);
            } else {
                if (a[i] > pq.peek()) {
                    pq.poll();
                    pq.add(a[i]);
                }
            }
        }
        System.out.println("Kth Largest element: " + pq.peek());
    }
}

/*
 * time complexity : O(nlogk)
 * Space complexty : O(k)
 */
