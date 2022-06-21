import java.util.*;
public class FibonacciUsingRecursion {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int noOfTerms = sc.nextInt();
        System.out.println("Here the fibonacci Series:");
        for(int i =0 ; i < noOfTerms ; i++)
        {
             System.out.print(fib(i)+" ");
        }
        
    }
    public static int fib(int n)
    {
        if(n == 0 || n == 1)
        return n;
        return fib(n-2) + fib(n-1);
    }
}
