import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 0; i < (n * 2) - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (i < n && j <= i) {
                    System.out.print("* ");
                } else if (i >= n && j < (i - count)) {
                    System.out.print("* ");
                } else {
                    if ((j <= i && i < n) || j < (i - count))
                        System.out.print(" ");
                }
            }
            if (i >= n) {
                count += 2;
            }
            System.out.println();
        }
    }
}
