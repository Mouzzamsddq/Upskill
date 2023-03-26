import java.util.Scanner;

public class StringPalindrome {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String  s = sc.next();
        System.out.println(isPalindrome(0, s.length() - 1, s));
        
    }

    public static boolean isPalindrome(int left, int right, String s) {
        if(left >= right) {
            return true;
        }
        boolean isEqual = s.charAt(left) == s.charAt(right);
        if(isEqual) {
            return isPalindrome(++left, --right, s);
        }
        return isEqual;
    }
}
