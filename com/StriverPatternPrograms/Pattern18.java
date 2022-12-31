import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 64 + n;
        for (int i = 0; i < n; i++) {
            count = 64 + n;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) count + " ");
                count--;
            }
            System.out.println();
        }
    }
}
