import java.util.Scanner;

/*
  Love Babbar DSA Sheet 
  Q. 2  Max and min element of array using minimum no of comparison
 */

public class Q2MaxMinElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = 0;
        int max = 0;
        int i = 0;
        if (n % 2 == 0) {
            if (arr[0] < arr[1]) {
                min = arr[0];
                max = arr[1];
            } else {
                min = arr[1];
                max = arr[0];
            }
            i = 2;
        } else {
            min = arr[0];
            max = arr[0];
            i = 1;
        }

        while (i < n - 1) {
            if (arr[i] < arr[i + 1]) {
                if (max < arr[i + 1]) {
                    max = arr[i + 1];
                }
                if (min > arr[i]) {
                    min = arr[i];
                }
            } else {
                if (max < arr[i]) {
                    max = arr[i];
                }
                if (min > arr[i + 1]) {
                    min = arr[i + 1];
                }

            }
            i += 2;
        }

        System.out.println("Max element : " + max);
        System.out.println("Min element : " + min);

    }
}

/*
 * Time complexity is O(n)
 * Space complexity is O(1)
 * In odd case - no of comparison - 3 * (n-1)/2
 * In even case - no of comparison - 1 + 3 * (n-2)/2
 */
