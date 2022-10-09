import java.util.Scanner;

public class BestTimeBuySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int leastSoFar = Integer.MAX_VALUE;
        int maximumProfit = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (leastSoFar > a[i]) {
                leastSoFar = a[i];
            }
            int cp = a[i] - leastSoFar;
            maximumProfit = Math.max(cp, maximumProfit);
        }
        System.out.println(maximumProfit);
    }
}
