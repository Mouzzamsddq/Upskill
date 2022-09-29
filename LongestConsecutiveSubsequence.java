import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int ml = 0;
        HashMap<Integer, Boolean> hashMap = new HashMap<Integer, Boolean>();
        for (int ele : a) {
            hashMap.put(ele, true);
        }

        for (int ele : a) {
            if (hashMap.containsKey(ele - 1)) {
                hashMap.put(ele, false);
            }
        }

        for (int ele : a) {
            if (hashMap.get(ele) == true) {
                int tl = 1;
                int tsp = ele;
                while (hashMap.containsKey(tsp + tl)) {
                    tl++;
                }
                if (tl > ml) {
                    ml = tl;
                }
            }
        }
        System.out.println(ml);

    }
}
