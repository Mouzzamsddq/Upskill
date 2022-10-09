import java.util.Scanner;

public class MaximumSumSubarrayOfSizeKSlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        // print max sum using brute force
        System.out.println(getMaxSumBruteForceSol(arr, k));

        // print max sum using sliding window technique
        System.out.println(getMaxSumBySlidingWindowOptimalSol(arr, k));

    }

    // T.C. - O(n*k)
    private static int getMaxSumBruteForceSol(int[] arr, int k) {
        int maxSum = 0;
        for (int i = 0; i <= arr.length - k; i++) {
            int windowSum = 0;
            for (int j = i; j < i + k; j++) {
                windowSum += arr[j];
            }
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;

    }

    // T.C = O(n)
    private static int getMaxSumBySlidingWindowOptimalSol(int arr[], int k) {
        int maxSum = 0, windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        for (int end = k; end < arr.length; end++) {
            windowSum += arr[end] - arr[end - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
