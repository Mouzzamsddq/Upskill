import java.util.Scanner;

public class SelectionSort {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < a.length ; i++) {
            a[i] = sc.nextInt();
        }

        selectionSort(a);
        printArray(a);
    }

    public static void printArray(int []a) {
        for(int ele: a) {
            System.out.print(ele+" ");
        }
    }


    /*
     * Time complexity -  O(n^2) - for worst , average and best case
     */
    public static void selectionSort(int []a) {
         for(int i = 0 ; i < a.length - 1 ; i++) {
            int min = i;
            for(int j = i + 1 ; j < a.length ; j++) {
                 if(a[j] < a[min]) {
                    min = j;
                 }
            }
            swap(a, i, min);
         }
    }

    public static void swap(int a[], int i , int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
