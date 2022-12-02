import java.util.Scanner;

public class ArrayinsertionOperation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int a[] = new int[n + 1];
        // fill the array with elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element which you want to insert at the end:");
        int noWantToInsert = sc.nextInt();
        System.out.println("print the array before insertion : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        // perform insertion at the end
        a[n] = noWantToInsert;
        System.out.println("Print the array after insertion: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
