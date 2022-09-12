import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array : ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the value of k :");
        int k = sc.nextInt();
        rotate(a, n, k);
        System.out.println("After perform rotation, the given array is :");
        for (int num : a) {
            System.out.print(num + " ");
        }

    }

    public static void reverse(int a[], int i, int j) {
        int li = i;
        int ri = j;
        while (li < ri) {
            int temp = a[li];
            a[li] = a[ri];
            a[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void rotate(int a[], int n, int k) {
        k = k % a.length;
        if (k < 0) {
            k = k + a.length;
        }
        // reverse first part
        reverse(a, 0, a.length - k - 1);
        // reverse second part
        reverse(a, a.length - k, a.length - 1);
        // reverse whole array
        reverse(a, 0, n - 1);
    }
}

/*
 * Time Complexity - O(n)
 * Space Complexity - O(1)
 * 
 */