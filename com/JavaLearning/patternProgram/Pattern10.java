import java.util.Scanner;

public class Pattern10 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for(int i =0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(j <= i)
                {
                    count++;
                    System.out.print(count+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
