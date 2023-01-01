import java.util.Scanner;

public class LCMAndGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int result = gcd(a, b);
        int lcm = (a * b) / result;
        System.out.println(lcm);
        System.out.println(result);

    }

    public static int gcd(int a, int b) {
        while (a != 0 && b != 0) {
            int temp = a;
            a = b % a;
            b = temp;
        }

        return b;
    }
}
