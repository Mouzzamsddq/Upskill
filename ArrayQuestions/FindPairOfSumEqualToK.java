import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FindPairOfSumEqualToK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int pairCount = 0;
        Map<Integer, Integer> countingMap = new HashMap<Integer, Integer>();
        for (int ele : a) {
            int b = k - ele;
            if (countingMap.containsKey(b)) {
                pairCount += countingMap.get(b);
            }
            int preExistValue = countingMap.getOrDefault(ele, 0);
            countingMap.put(ele, ++preExistValue);
        }
        System.out.println(pairCount);
        sc.close();
    }
}