import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubArraySumEqualToZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean isExist = false;
        int i = -1;
        int sum = 0;
        map.put(sum, i);
        while (i < a.length - 1) {
            i++;
            sum = sum + a[i];
            if (map.containsKey(sum) == true) {
                isExist = true;
                break;
            } else {
                map.put(sum, i);
            }
        }
        if (isExist) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
