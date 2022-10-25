import java.util.Stack;
import java.util.Scanner;

public class NextsmallerElementRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // next smaller element to the right
        int[] nse = nextSmallerElementRight(arr, n);
        printArray(nse);

        /*
         * Time complexity - O(n)
         * Space Complexity - O(n)
         */

    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static int[] nextSmallerElementRight(int[] arr, int n) {
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        for (int i = n - 1; i >= 0; i--) {
            while (st.size() > 0 && st.peek() >= arr[i]) {
                st.pop();
            }

            if (st.empty()) {
                nse[i] = -1;
            } else {
                nse[i] = st.peek();
            }
            st.push(arr[i]);
        }

        return nse;
    }
}
