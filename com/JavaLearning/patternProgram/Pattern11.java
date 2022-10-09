import java.util.Scanner;
public class Pattern11 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int a = 0;
        int b = 1;
        for(int i = 0 ; i < n ; i++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                if(j <= i)
                {
                    count++;
                    if(count == 1) {
                        System.out.print(a+"\t");
                        continue;
                    }
                    if(count == 2)
                    {
                        System.out.print(b+"\t");
                        continue;
                    }
                    int c = a + b;
                    a = b;
                    b = c;
                    System.out.print(c+"\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
