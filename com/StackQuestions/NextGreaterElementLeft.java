import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] nge = nextGreaterElementLeft(arr, n);
        printArray(nge);

    }

    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static int[] nextGreaterElementLeft(int[] arr, int n) {
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            while (st.size() > 0 && st.peek() <= arr[i]) {
                st.pop();
            }

            if (st.empty()) {
                nge[i] = -1;
            } else {
                nge[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }
}
