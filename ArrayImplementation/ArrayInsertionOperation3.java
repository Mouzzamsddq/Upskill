import java.util.Scanner;

public class ArrayInsertionOperation3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in the array : ");
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        System.out.println("Please insert the element of the array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the pos where you want to insert the element : ");
        int pos = sc.nextInt();
        System.out.println("Enter the number which you want to insert at the specific pos:");
        int number = sc.nextInt();
        // print the elemnt before insertion
        System.out.println("Print the element before insertion : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        // perform insertion at specific postion
        if (pos < 1 || pos > n) {
            System.out.println("Invalid position");
        } else {
            for (int i = n - 1; i >= pos - 1; i--) {
                a[i + 1] = a[i];
            }
            a[pos - 1] = number;
            // print array element after insertion
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i] + " ");
            }
        }

    }
}
