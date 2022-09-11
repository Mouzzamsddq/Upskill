import java.util.Scanner;

public class SortZeroOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0, j = 0;
        while (i < a.length) {
            if (a[i] == 1) {
                i++;
            } else {
                swap(a, i, j);
                i++;
                j++;
            }
        }
        for (int num : a) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

/*
 * Question based on topic partioning in array
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 */
