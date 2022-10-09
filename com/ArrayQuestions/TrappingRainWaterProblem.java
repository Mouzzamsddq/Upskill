import java.util.Scanner;

public class TrappingRainWaterProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int lo = 0;
        int hi = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;
        while (lo <= hi) {
            if (a[lo] <= a[hi]) {
                if (a[lo] >= leftMax) {
                    leftMax = a[lo];
                } else {
                    res += leftMax - a[lo];
                }
                lo++;
            } else {
                if (rightMax <= a[hi]) {
                    rightMax = a[hi];
                } else {
                    res += rightMax - a[hi];
                }
                hi++;
            }
        }
        System.out.println(res);
    }
}
