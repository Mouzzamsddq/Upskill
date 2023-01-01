import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean result = isPalindrome(n);
        System.out.println(result);

    }

    public static boolean isPalindrome(int n) {
        int temp = n;
        int reverseNumber = 0;
        while (temp != 0) {
            int rem = temp % 10;
            reverseNumber = reverseNumber * 10 + rem;
            temp = temp / 10;
        }

        return reverseNumber == n;
    }
}
