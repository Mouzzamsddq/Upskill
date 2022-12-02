import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MergeIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<int[]> resultList = new ArrayList<>();
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Arrays.sort(arr, (a, b) -> (a[0] - b[0]));
        int[] previousInterval = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int[] currentInterval = arr[i];
            if (currentInterval[0] < previousInterval[1]) {
                previousInterval[1] = Math.max(currentInterval[1], previousInterval[1]);
            } else {
                resultList.add(previousInterval);
                previousInterval = currentInterval;
            }
        }

        resultList.add(previousInterval);
        for (int[] interval : resultList) {
            System.out.println(interval[0] + " " + interval[1]);
        }
    }
}