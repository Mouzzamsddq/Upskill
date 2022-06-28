import java.util.*;
public class GCDandLCM {
    public static void main(String [] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = calculateGCD(a, b);
        System.out.println("GCD of two number is :"+gcd);
        int lcm = (a * b) / gcd;
        System.out.println("LCM of two number is :"+lcm);
        sc.close();
    }

    //method to calculate the gcd
    public static int calculateGCD(int a , int b) 
    {
        if(a == 0)
        {
            return b;
        }
        if(b == 0)
        {
            return a;
        }
        return calculateGCD(b%a , a);
    }
}
