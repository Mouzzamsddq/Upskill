import java.util.Scanner;

public class PartitionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int pivot = sc.nextInt();
        // now perform partioning
        int i = 0, j = 0;
        while (i < a.length) {
            if (a[i] <= pivot) {
                swap(a, i, j);
                i++;
                j++;
            } else {
                i++;
            }
        }
        // now print array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
