import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = isPrime(n);
        boolean result1 = isPrimeFaster(n);
        System.out.println(result);
        System.out.println(result1);

    }

    // this method takes O(n) time
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    // this method takes O(sqrt(n)) time
    public static boolean isPrimeFaster(int n) {
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }
}
