import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 64;
        for (int i = 0; i < n; i++) {
            count++;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) count);
            }
            System.out.println();
        }
    }
}
