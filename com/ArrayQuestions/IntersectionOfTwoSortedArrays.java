import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array a : ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array: a");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the array b: ");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter the elements of array : b");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Intersection of two sorted arrays: ");
        System.out.println(intersection(a, b));
    }

    public static HashSet<Integer> intersection(int a[], int b[]) {
        int i = 0;
        int j = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                hashSet.add(a[i]);
                i++;
                j++;
            } else if (a[i] < b[j]) {
                i++;
            } else {
                j++;
            }
        }
        return hashSet;
    }

}
