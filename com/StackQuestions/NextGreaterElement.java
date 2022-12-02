import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // next greater element optimal approach using stack
        int[] nge = nextGreaterElement(arr, n);
        printArray(nge);

        /*
         * Time Complexity - O(n)
         * Space Complexity - O(n)
         */

    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static int[] nextGreaterElement(int[] arr, int n) {
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.empty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }z
            st.push(arr[i]);
        }

        return nge;
    }
}
