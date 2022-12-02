import java.util.Scanner;

public class ThreeWayPartioning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i = 0;
        int j = 0;
        int k = n - 1;
        while (i <= k) {
            if (arr[i] < a) {
                swap(arr, i, j);
                i++;
                j++;
            } else if (arr[i] > b) {
                swap(arr, i, k);
                k--;

            } else {
                i++;
            }
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
