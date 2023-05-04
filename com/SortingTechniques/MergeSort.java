import java.util.*;
public class MergeSort {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < a.length ; i++) {
            a[i] = sc.nextInt();
        }

        int []result = mergeSort(a, 0 , a.length - 1);
        printArray(result);
    }

    public static void printArray(int []a) {
        for(int ele: a) {
            System.out.print(ele+" ");
        }
    }

    public static int[] mergeSort(int a[], int lo, int hi) {

        if(lo == hi) {
            int base[] = new int[1];
            base[0] = a[lo];
            return base;
        }

        int mid = (lo + hi) / 2;
        int []left = mergeSort(a, lo, mid);
        int []right = mergeSort(a, mid +1 , hi);
        return merge(left, right);

    }

    public static int[] merge(int []left, int []right) {
        int i =  0, j = 0, k = 0;
        int merged[] = new int[left.length + right.length];
        while(i < left.length && j < right.length) {
            if(left[i] < right[j]) {
                merged[k] = left[i];
                i++;
                k++;
            } else {
                merged[k] = right[j];
                j++;
                k++;
            }
        }
        
        while(i < left.length) {
            merged[k] = left[i];
            i++;
            k++;
        }

        while(j < right.length) {
            merged[k] = right[j];
            j++;
            k++;
        }
        
        return merged;
    }

}