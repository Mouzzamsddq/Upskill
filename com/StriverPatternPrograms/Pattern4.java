import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}