import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                count = 1;
            } else {
                count = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count = count == 0 ? 1 : 0;
            }

            System.out.println();
        }
    }
}
