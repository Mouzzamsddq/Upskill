import java.util.*;

public class QuickSort {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < a.length ; i++) {
            a[i] = sc.nextInt();
        }

        quickSort(a, 0, a.length - 1);
        printArray(a);
    }

    public static void printArray(int []a) {
        for(int ele: a) {
            System.out.print(ele+" ");
        }
    }

    public static void swap(int a[], int i , int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
    /**
     * Time complexlity - O(nlogn) - because we are dividing the array every time into two half. Not exactly two half, about to.
     * Space complexity - O(1) - because we are not using any temp array.
     */
    public static void quickSort(int []a , int lo, int hi) {
        if(lo < hi) {
            int partionIndex = partion(a, lo, hi);
            quickSort(a, lo, partionIndex - 1);
            quickSort(a, partionIndex + 1, hi);
        }
    }

    public static int partion(int []a, int lo, int hi) {
        int pivot = a[lo];
        int i = lo;
        int j = hi;
        while(i < j) {
            while(i < hi && a[i] <= pivot) {
                 i++;
            }

            while(j > lo && a[j] > pivot) {
                j--;
            }

            if(i < j) {
                swap(a, i, j);
            }
        }
        swap(a, lo, j);
        return j;
    }
}
