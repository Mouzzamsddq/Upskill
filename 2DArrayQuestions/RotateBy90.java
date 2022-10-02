import java.util.Scanner;

public class RotateBy90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // brute force approach
        // this approach take O(n^2) space and O(n^2) time

        // int maxRow = row - 1;
        // int resultMatrix[][] = new int[row][col];
        // for (int i = 0; i < row; i++) {
        // for (int j = 0; j < col; j++) {
        // resultMatrix[i][j] = matrix[maxRow - j][i];
        // }
        // }

        // optimal approach

        // there are two steps :-

        // 1) transpose the given matrix
        // 2) Reverse each row after transpose

        // T.c = O(n^2)
        // S.C = o(1)

        // perform transpose
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[0].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // now reverse each row
        for (int i = 0; i < matrix.length; i++) {
            int lo = 0;
            int hi = matrix[i].length - 1;
            while (lo < hi) {
                int temp = matrix[i][lo];
                matrix[i][lo] = matrix[i][hi];
                matrix[i][hi] = temp;

                lo++;
                hi--;
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
