import java.util.Scanner;

/*
  Find majority element 
  Time Complexity - O(n)
  Space Complexity - O(1)
 */
public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int candidate = -1;
        int count = 0;

        for (int val : a) {
            if (count == 0) {
                candidate = val;
                count = 1;
            } else {
                if (candidate == val) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        count = 0;
        for (int val : a) {
            if (val == candidate) {
                count++;
            }
        }

        if (count > (n / 2)) {
            System.out.println("majority element : " + candidate);
        } else {
            System.out.println("Not found : -1");
        }

    }
}