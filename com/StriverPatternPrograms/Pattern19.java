import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 65;
        for (int i = 0; i < n; i++) {
            count = 65;
            for (int j = 0; j < (n * 2) - 1; j++) {
                if (j >= (n - 1 - i) && j <= (n - 1 + i)) {
                    System.out.print((char) count);
                    if (j < n - 1) {
                        count++;
                    } else {
                        count--;
                    }
                } else {
                    if (j <= (n - 1 + i))
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
