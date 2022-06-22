import java.util.*;
public class PrintDigitsOfANumber {
    public static void main(String [] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int nod = countDigits(number);
        int div = (int)Math.pow(10, nod - 1);
        while(div != 0) 
        {
            int q = number / div;
            System.out.println(q);
            number = number % div;
            div = div / 10;
        }
        sc.close();
        
    }
    public static int countDigits(int n) 
    {
        int countDigit = 0;
        while(n != 0)
        {
            countDigit++;
            n = n/10;
        }
        return countDigit;
    }
}
