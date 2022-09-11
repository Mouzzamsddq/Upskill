import java.util.Scanner;

public class SortZeroOneTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // do partioning on 0, 1 , 2
        int i = 0, j = 0;
        int k = n - 1;
        while (i <= k) {
            if (a[i] == 0) {
                swap(a, i, j);
                i++;
                j++;
            } else if (a[i] == 1) {
                i++;

            } else {
                swap(a, i, k);
                k--;
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
