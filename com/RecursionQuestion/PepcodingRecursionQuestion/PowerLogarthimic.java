import java.util.Scanner;

public class PowerLogarthimic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = pow(x, n);
        System.out.println(result);

    }

    // time complexity of this algoritm to calculate pow is O(logn)
    public static int pow(int x, int n) {

        if (n == 0) {
            return 1;
        }

        int xnb2 = pow(x, n / 2);
        int xn = xnb2 * xnb2;

        if (n % 2 == 1) {
            xn = x * xn;
        }

        return xn;
    }
}