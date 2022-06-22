// program to calculate the number of digit in a given number
import java.util.*;
public class CountDigit {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int countDigit = 0;
        while(number != 0)
        {
            countDigit++;
            number = number/10;
        }
        System.out.println("the number of digits in a given number : "+countDigit);
        }
}