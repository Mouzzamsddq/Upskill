import java.util.*;

public class SumOfNaturalNumbers {
   public static void main(String [] args) 
   {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number : ");
         int number = sc.nextInt();
         int result = sum(number);
         System.out.println(result);
         sc.close();
    }
    public static int sum(int n) 
    {
        if(n <= 1)
           return 1;
        return n + sum(n-1);

    }
}