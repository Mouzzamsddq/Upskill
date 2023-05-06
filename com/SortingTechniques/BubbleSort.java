import java.util.*;

import javax.sound.midi.SysexMessage;
public class BubbleSort {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < a.length ; i++) {
            a[i] = sc.nextInt();
        }

        bubbleSort(a);
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


    /*
     * Time complexity -  O(n^2) - for worst and average case
     * Time Complexity - O(n) - for best case
     */
    public static void bubbleSort(int []a) {
        // we can optimize this bubble sort by checking if the swap happens or not,
        // if no swaps happens, just break the loop because array is already sorted.
         for(int i = 0 ; i < a.length  ; i++) {
            boolean isSwap = true;
            for(int j = 0 ; j < a.length - i - 1 ; j++) {
                 if(a[j] > a[j + 1]) {
                      swap(a, j, j+1);
                      isSwap = false;
                 }
            }
            if(isSwap) {
                break;
            }
         }
    }
}

