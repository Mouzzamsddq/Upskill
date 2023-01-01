import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // count the digits in n which evenly divides N
        int temp = n, answerCount = 0;
        while (temp != 0) {
            int lastDigit = temp % 10;
            if (lastDigit != 0 && n % lastDigit == 0) {
                answerCount++;
            }
            temp = temp / 10;
        }
        System.out.println(answerCount);
    }
}
