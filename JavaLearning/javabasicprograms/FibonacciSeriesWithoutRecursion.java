import java.util.*;

class FibonacciSeriesWithoutRecusrion {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms : ");
        int noOfTerms = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" "+b);
        for(int i =0; i < noOfTerms-2; i++) 
        {
            int c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
}