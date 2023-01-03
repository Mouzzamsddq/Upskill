import java.util.Scanner;

public class DisplayArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        displayArrayReverse(a, 0);
    }

    public static void displayArrayReverse(int a[], int index) {
        if (index == a.length) {
            return;
        }
        displayArrayReverse(a, index + 1);
        System.out.println(a[index]);
    }
}
