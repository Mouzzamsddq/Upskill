import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n * 2) - 1; j++) {
                if (j >= i && j < (n * 2) - 1 - i) {
                    System.out.print("*");
                } else {
                    if (j < (n * 2) - 1 - i)
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
