import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintSubsequence {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer a[] = new Integer[n];
        for(int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        List<Integer> al = new ArrayList<>();
        printS(0, al, a, n);
        sc.close();
    }

    public static void printS(int index, List<Integer> sub, Integer[] arr, int n) {
        if(index == n) {
            System.out.println(sub.toString());
            return;
        }
       // take or pick the particular index into the subsequence
       sub.add(arr[index]);
       printS(index + 1, sub, arr, n);
       sub.remove(arr[index]);
       // not pick or not take condition, this particular index will not going to add into subsequnce
       printS(index + 1, sub, arr, n);
    }
}
