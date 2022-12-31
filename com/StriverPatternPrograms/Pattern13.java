import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 0; i < n; i++) {
            count = 0;
            for (int j = 0; j < (n * 2); j++) {
                if (j <= i) {
                    System.out.print((j + 1) + " ");
                } else if ((n * 2) - 1 - i <= j) {
                    System.out.print((n * 2) - j + " ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
