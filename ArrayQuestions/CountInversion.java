import java.util.Scanner;

public class CountInversion {
    static int countInversion = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        mergeSort(a, 0, n - 1);
        System.out.println(countInversion);
    }

    public static int[] mergeSort(int[] a, int low, int high) {
        if (low == high) {
            int ba[] = new int[1];
            ba[0] = a[low];
            return ba;
        }
        int mid = (low + high) / 2;
        int left[] = mergeSort(a, low, mid);
        int right[] = mergeSort(a, mid + 1, high);
        int merged[] = mergeTwoSortedArrays(left, right);
        return merged;
    }

    public static int[] mergeTwoSortedArrays(int[] left, int[] right) {
        int i = 0;
        int j = 0;
        int k = 0;
        int merged[] = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k] = left[i];
                i++;
                k++;
            } else {
                countInversion += (left.length - i);
                merged[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < left.length) {
            merged[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            merged[k] = right[j];
            j++;
            k++;
        }
        return merged;
    }
}
