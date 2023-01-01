import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int result = 0;
        int noOfDigits = ("" + temp).length();
        while (n != 0) {
            int lastDigit = n % 10;
            result += (Math.pow(lastDigit, noOfDigits));
            n = n / 10;
        }
        if (result == temp) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
