import java.util.Scanner;

public class SumOFAllDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += fastSumOFDivisor(i);
        }
        System.out.println(result);
    }

    // this method takes O(n) time.
    public static int sumOfDivisor(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // this method takses O(sqrt(n)) times
    public static int fastSumOFDivisor(int n) {
        int sum = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;
                if (i != (n / i))
                    sum += (n / i);
            }
        }
        return sum;
    }
}
