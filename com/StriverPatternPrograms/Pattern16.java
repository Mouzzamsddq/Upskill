import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 65;
        for (int i = n; i > 0; i--) {
            count = 65;
            for (int j = 0; j < i; j++) {
                System.out.print((char) count);
                count++;
            }
            System.out.println();
        }
    }
}
