import java.util.Scanner;

public class KadaneAlgoQuestion8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // start kadane's algorithm
        int csum = a[0];
        int osum = a[0];

        for (int i = 1; i < n; i++) {
            if (csum >= 0) {
                csum += a[i];
            } else {
                csum = a[i];
            }
            if (csum > osum) {
                osum = csum;
            }
        }

        System.out.println("maximum sum of subarray is :" + osum);

    }
}
