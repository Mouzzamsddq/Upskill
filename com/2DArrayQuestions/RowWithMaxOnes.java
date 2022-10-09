import java.util.Scanner;

public class RowWithMaxOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // optimal approach
        int maxCount = 0;
        int resultRow = -1;
        for (int i = 0; i < matrix.length; i++) {
            int coir = binarySearch(matrix, i);
            if (coir > maxCount) {
                maxCount = coir;
                resultRow = i;
            }
        }

        System.out.println(resultRow);

        // brute force approach
        // int maxRow = -1;
        // int maxOnes = 0;
        // for (int i = 0; i < n; i++) {
        // int countOnes = 0;
        // for (int j = 0; j < m; j++) {
        // if (arr[i][j] == 1) {
        // countOnes++;
        // }
        // }
        // if (countOnes > maxOnes) {
        // maxOnes = countOnes;
        // maxRow = i;
        // }
        // }
        // System.out.println(maxRow);

        /*
         * T.C = O(n^2)
         * S.C = O(1)
         */

    }

    private static int binarySearch(int[][] mat, int r) {
        int lo = 0;
        int hi = mat[0].length - 1;
        int fi = mat[0].length;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (mat[r][mid] == 1) {
                fi = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        int count = mat[0].length - fi;
        return count;
    }
}
