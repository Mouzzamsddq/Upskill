import java.util.Scanner;

public class Pattern2 {
    public static void main(String [] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0 ; i < n ; i++ )
        {
            for(int j = 0 ; j < n ; j++)
            {
                 if(j < (n - i))
                 {
                    System.out.print("* ");
                 }
                 else {
                    break;
                 }
            }
           System.out.println();
        }
        sc.close();
    }
}
