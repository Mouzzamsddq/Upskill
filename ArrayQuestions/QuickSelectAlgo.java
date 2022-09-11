import java.util.Scanner;

/*
 Quick select algo to find the kth smallest element in O(n) time
*/
public class QuickSelectAlgo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

    }

    public static int partition(int arr[], int pivot, int lo, int hi) {
        int i = lo, j = lo;
        // will complete once learn partioning
        return 0;
    }
}
