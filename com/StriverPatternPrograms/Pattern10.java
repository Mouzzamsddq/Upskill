import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isEvenOdd = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n * 2) - 1; j++) {
                if (j >= (n - 1) - i && j <= (n - 1) + i && !isEvenOdd) {
                    System.out.print("*");
                    isEvenOdd = true;
                } else {
                    isEvenOdd = false;
                    if (j <= (n - 1) + i)
                        System.out.print(" ");
                }
            }
            System.out.println();
        }

        isEvenOdd = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n * 2) - 1; j++) {
                if (j >= i && j < (n * 2) - 1 - i && !isEvenOdd) {
                    System.out.print("*");
                    isEvenOdd = true;
                } else {
                    isEvenOdd = false;
                    if (j < (n * 2) - 1 - i)
                        System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}
