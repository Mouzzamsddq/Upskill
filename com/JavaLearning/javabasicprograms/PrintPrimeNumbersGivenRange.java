import java.util.*;
public class PrintPrimeNumbersGivenRange {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        System.out.println("Here the list of prime numbers within the given range : ");
        for(int i = low ; i <= high; i++) {
            if(i== 1) {
                continue;
            }
            if(isPrime(i)) 
            {
                System.out.println(i);
            }
        }
        sc.close();
        
    }

    public static boolean isPrime(int n)
    {
        int count = 0;
       for(int div = 2 ; div * div <= n ; div++) 
       {
         if(n % div == 0) 
         {
            count++;
            break;
         }
       }
       return count == 0;    
    }
}
