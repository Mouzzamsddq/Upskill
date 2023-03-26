import java.util.Scanner;

public class StringPalindrome {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.next();
        System.out.println(isPalindrome(0, s));
        sc.close();
    }

    public static boolean isPalindrome(int left, String s) {
        int right = s.length() - left - 1;
        if(left >= right) {
            return true;
        }
        boolean isEqual = s.charAt(left) == s.charAt(right);
        if(isEqual) {
            return isPalindrome(++left, s);
        }
        return isEqual;
    }
}
