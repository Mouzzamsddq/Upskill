import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n * 2); j++) {
                if (j < n - i || j >= (n + i))
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n * 2); j++) {
                if (j <= i)
                    System.out.print("* ");
                else if (j >= (n * 2) - 1 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
