import java.util.Scanner;
// this program will always get a  odd number input
public class Pattern5 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mid = n / 2;
        int start = mid + 1;
        int end = mid - 1;
        for(int i = 0 ; i < n ; i++ )
        {
            if(i <= mid) {
                start--;
                end++ ;
             } else {
                 start++;
                 end--;
             }
            for(int j = 0 ;j <n ; j++)
            {
                 if(j >= start && j <= end)
                 {
                    System.out.print("* ");
                 }
                 else {
                    System.out.print("  ");
                 }
            }
            System.out.println();
           
        }
    }
}
