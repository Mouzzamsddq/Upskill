import java.util.Scanner;

public class MaxProductSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maximumProduct = bruteForceAppproach(arr);
        System.out.println(maximumProduct);

        int currProduct = kadaneAlgo(arr);
        System.out.println(currProduct);
        sc.close();

    }

    public static int bruteForceAppproach(int a[]) {
        int currProduct = 1;
        int maxProduct = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            currProduct = 1;
            for (int j = i; j < a.length; j++) {
                currProduct = currProduct * a[j];
                if (currProduct > maxProduct) {
                    maxProduct = currProduct;
                }
            }
        }
        return maxProduct;
    }

    public static int kadaneAlgo(int[] a) {
        int ma = a[0];
        int mi = a[0];
        int maxProduct = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < 0) {
                int temp = mi;
                mi = ma;
                ma = temp;
            }
            ma = Math.max(ma * a[i], a[i]);
            mi = Math.min(mi * a[i], a[i]);
            maxProduct = Math.max(ma, maxProduct);
        }
        return maxProduct;
    }
}
