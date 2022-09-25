import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        Arrays.sort(a);
        int minimumDiff = Integer.MAX_VALUE;
        for (int i = 0; i <= n - m; i++) {
            int first = a[i];
            int last = a[i + m - 1];
            int diff = last - first;
            minimumDiff = Math.min(diff, minimumDiff);
        }
        System.out.println(minimumDiff);
    }
}
