import java.util.*;
public class IsPrime {
    public static void main(String [] args) {
        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        //optimal solution
        int count = 0;
        for(int div = 2 ; div * div <= n ; div++)
        {
             if(n%div==0) 
             {
                count++;
                break;
             }
        }
        if(count == 0) 
        {
            System.out.println("Prime");
        }
        else {
            System.out.println("Not Prime");
        }
        scn.close();
    }
}
