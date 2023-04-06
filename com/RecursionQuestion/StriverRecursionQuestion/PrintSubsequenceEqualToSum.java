import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintSubsequenceEqualToSum {
   public static void main(String [] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     Integer a[] = new Integer[n];
     for(int i = 0 ; i < n ; i++) {
        a[i] = sc.nextInt();
     }
     int sum = sc.nextInt();
     List<Integer> al = new ArrayList<>();
     printSS(0, a, al, sum, n, 0);
     sc.close();
    }
    
    public static boolean printSS(int index , Integer []arr, List<Integer> al, int sum, int n, int s) {
        if(index == n) {
            if(sum == s)  {
            System.out.println(al.toString());
            return true;
            }
            return false;
        }

        // take the element into the subsequence
        al.add(arr[index]);
        s += arr[index];
        if(printSS(index + 1, arr, al, sum, n, s)) {
            return true;
        }
        
        // not take the element into the subsequence
        al.remove(arr[index]);
        s -= arr[index];
        if(printSS(index + 1, arr, al, sum, n, s)) {
            return true;
        }
        return false;
    }
}
