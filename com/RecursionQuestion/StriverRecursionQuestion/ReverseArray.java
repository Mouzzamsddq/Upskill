import java.util.Scanner;

public class ReverseArray {
    public static void  main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int  i = 0 ; i < n ; i++)  {
            arr[i] = sc.nextInt();
        }
        reverseArray(0, arr);
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }  

    public static void reverseArray(int i , int []arr) {
        if(i >= arr.length/2) {
            return;
        }
        swap(arr, i, arr.length - i - 1);
        reverseArray(i + 1, arr);
    }

    public static void swap(int arr[], int left, int right) {
        int temp  = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
