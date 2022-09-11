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
        int k = sc.nextInt();
        System.out.println(quickSelect(a, 0, n - 1, k - 1));

    }

    public static int quickSelect(int arr[], int lo, int hi, int k) {
        int pivot = arr[hi];
        int pi = partition(arr, pivot, lo, hi);
        if (k > pi) {
            return quickSelect(arr, pi + k, hi, k);
        } else if (k < pi) {
            return quickSelect(arr, lo, pi - 1, k);
        } else {
            return pivot;
        }
    }

    public static int partition(int arr[], int pivot, int lo, int hi) {
        int i = lo, j = lo;
        // will complete once learn partioning
        while (i <= hi) {
            if (arr[i] <= pivot) {
                swap(arr, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }

        return (j - 1);
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
