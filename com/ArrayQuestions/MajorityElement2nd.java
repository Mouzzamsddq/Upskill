import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajorityElement2nd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = 3;
        List<Integer> res = majorityElementTwo(arr, k);
        System.out.println(res.toString());

    }

    // time complexity - O(n)
    // Space complexity - O(1)
    public static List<Integer> majorityElementTwo(int[] arr, int k) {
        int candidate1 = -1;
        int candidate2 = -1;
        int c1 = 0;
        int c2 = 0;

        for (int ele : arr) {
            if (ele == candidate1) {
                c1++;
            } else if (ele == candidate2) {
                c2++;
            } else if (c1 == 0) {
                candidate1 = ele;
                c1 = 1;
            } else if (c2 == 0) {
                candidate2 = ele;
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }

        c1 = 0;
        c2 = 0;
        for (int ele : arr) {
            if (ele == candidate1) {
                c1++;
            } else if (ele == candidate2) {
                c2++;
            }
        }
        List<Integer> al = new ArrayList<Integer>();
        if (c1 > (arr.length / k)) {
            al.add(candidate1);
        }
        if (c2 > (arr.length / k)) {
            al.add(candidate2);
        }

        return al;
    }
}
