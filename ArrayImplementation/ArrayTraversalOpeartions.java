import java.util.Scanner;

public class ArrayTraversalOpeartions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter theb size of the array:");
        int n = sc.nextInt();
        // creating the array
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // traverse operation
        System.out.println("Elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
