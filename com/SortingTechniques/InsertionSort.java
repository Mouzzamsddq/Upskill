import java.util.*;;
public class InsertionSort {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < a.length ; i++) {
            a[i] = sc.nextInt();
        }

        insertionSort(a);
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
    public static void insertionSort(int []a) {
         for(int i = 0 ; i < a.length  ; i++) {
            int j = i;
            while(j > 0 && a[j - 1] > a[j]) {
                swap(a, j-1, j);
                j--;
            }
         }
    }
}

