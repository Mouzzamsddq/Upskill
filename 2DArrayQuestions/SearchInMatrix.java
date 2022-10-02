import java.util.Currency;
import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int target = sc.nextInt();

        int currRow = -1;
        for (int i = 0, j = 0; i < row; i++) {
            int valueAtFirstColInThisRow = matrix[i][j];
            if (target >= valueAtFirstColInThisRow) {
                currRow = i;
            }
        }

        boolean isFound = false;
        if (currRow == -1) {
            System.out.println(isFound);
            return;
        }
        for (int i = currRow, j = 0; j < col; j++) {
            if (target == matrix[i][j]) {
                isFound = true;
            }
        }

        System.out.println(isFound);

        /*
         * T.C = O(n) + O(m) where n = row and m = col
         * S.C = O(1)
         */

    }
}
