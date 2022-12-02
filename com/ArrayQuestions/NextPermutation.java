import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int i = a.length - 2;
        while (i >= 0 && a[i] >= a[i + 1])
            i--;
        if (i >= 0) {
            int j = a.length - 1;
            while (a[j] <= a[i])
                j--;
            swap(a, i, j);
        }
        reverse(a, i + 1, n - 1);
        printArray(a);
        sc.close();
    }

    public static void printArray(int[] a) {
        for (int ele : a) {
            System.out.print(ele + " ");
        }
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void reverse(int a[], int start, int end) {
        while (start <= end) {
            swap(a, start, end);
            start++;
            end--;
        }
    }
}

/*
 * T.C - O(n)
 * S.C - O(1)
 */