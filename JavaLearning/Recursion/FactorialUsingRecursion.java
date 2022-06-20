import java.util.*;
public class FactorialUsingRecursion {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println(fact(n));
        sc.close();
    }
    public static int fact(int n)
    {
        if(n == 1 || n== 0) 
           return n;
        return n * fact(n-1);
    }
}
