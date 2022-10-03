import java.util.Scanner;
import java.util.Stack;

public class LargestAreaHistogramBetterApproach {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // see striver video
        // find left smaller boundraies
        int lb[] = new int[arr.length];
        Stack<Integer> leftStack = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            while (!leftStack.isEmpty() && arr[leftStack.peek()] >= arr[i]) {
                leftStack.pop();
            }
            if (leftStack.isEmpty()) {
                lb[i] = 0;
                leftStack.push(i);
            } else {
                lb[i] = leftStack.peek() + 1;
                leftStack.push(i);
            }
        }
        int[] rb = new int[arr.length];
        // clear the stack to reused
        while (!leftStack.isEmpty()) {
            leftStack.pop();
        }
        for (int i = n - 1; i >= 0; i--) {
            while (!leftStack.isEmpty() && arr[leftStack.peek()] >= arr[i]) {
                leftStack.pop();
            }
            if (leftStack.isEmpty()) {
                rb[i] = arr.length - 1;
                leftStack.push(i);
            } else {
                rb[i] = leftStack.peek() - 1;
                leftStack.push(i);
            }
        }
        // now calculate the largest area histogram
        int maxArea = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentArea = ((rb[i] - lb[i]) + 1) * arr[i];
            maxArea = Math.max(maxArea, currentArea);
        }

        System.out.println(maxArea);

    }

    public static void printArray(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
