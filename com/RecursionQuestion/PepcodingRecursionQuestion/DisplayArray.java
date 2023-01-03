import java.util.Scanner;

public class DisplayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // creating an array
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("The output is: ");
        displayArray(a, a.length - 1);
    }

    public static void displayArray(int[] a, int index) {
        if (index == -1) {
            return;
        }
        displayArray(a, index - 1);
        System.out.println(a[index]);
    }
}
