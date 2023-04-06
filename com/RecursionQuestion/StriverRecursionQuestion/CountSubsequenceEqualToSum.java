import java.util.Scanner;

public class CountSubsequenceEqualToSum {
   public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer a[] = new Integer[n];
    for(int i = 0 ; i < n ; i++) {
       a[i] = sc.nextInt();
    }
    int sum = sc.nextInt();
    int finalCount = printSS(0, a, sum, n, 0);
    System.out.println(finalCount);
    sc.close();
   }
   
   public static int printSS(int index , Integer []arr, int sum, int n, int s) {
    if(index == n) {
        if(sum == s)  {
        return 1;
        }
        return 0;
    }

    // take the element into the subsequence
    s += arr[index];
    int left = printSS(index + 1, arr, sum, n, s);
    
    // not take the element into the subsequence
    s -= arr[index];
    int right = printSS(index + 1, arr, sum, n, s);
    return left + right;
}
}
