import java.util.Scanner;

public class SpiralTraversal {
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

        // spiral traversal
        int minRow = 0;
        int minCol = 0;
        int maxRow = row - 1;
        int maxCol = col - 1;
        int total = row * col;
        int count = 0;
        System.out.println("Spiral traversal is : ");
        while (count < total) {
            // left row
            for (int i = minRow, j = minCol; i <= maxRow && count < total; i++) {
                System.out.println(matrix[i][j]);
                count++;
            }
            minCol++;
            // bottom row
            for (int i = maxRow, j = minCol; j <= maxCol && count < total; j++) {
                System.out.println(matrix[i][j]);
                count++;
            }
            maxRow--;
            // right row
            for (int i = maxRow, j = maxCol; i >= minRow && count < total; i--) {
                System.out.println(matrix[i][j]);
                count++;
            }
            maxCol--;

            // top row
            for (int i = minRow, j = maxCol; j >= minCol && count < total; j--) {
                System.out.println(matrix[i][j]);
                count++;
            }
            minRow++;
        }
    }
}
