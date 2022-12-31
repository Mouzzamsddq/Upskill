import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 65;
        for (int i = 0; i < n; i++) {
            count = 65;
            for (int j = 0; j <= i; j++) {
                System.out.print((char) count);
                count++;
            }
            System.out.println();
        }
    }
}
