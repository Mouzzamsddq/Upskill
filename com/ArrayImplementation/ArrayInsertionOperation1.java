import java.util.Scanner;

public class ArrayInsertionOperation1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // creating the array
        int a[] = new int[n + 1];
        // filled the element of the array
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element of the array whichy you want to insert at the beginning: ");
        int noWantToInsert = sc.nextInt();
        // printing the elenment of the array before insertion
        System.out.println("Print the element of the array before insertion : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        // perform insertion at the beginning
        for (int i = n - 1; i >= 0; i--) {
            a[i + 1] = a[i];
        }
        a[0] = noWantToInsert;
        // print the array after insertion at the beginning
        System.out.println("Print the element of the array after insertion : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
