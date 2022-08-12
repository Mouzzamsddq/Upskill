import java.util.Scanner;

/*

   Love Babbar DSA Sheets 
   Q.1 )
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = n - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
 * time complexity - O(n)
 * space complexity - O(1)
 */