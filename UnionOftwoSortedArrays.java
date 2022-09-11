import java.util.ArrayList;
import java.util.Scanner;

public class UnionOftwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array a : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of a : ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the array: ");
        int m = sc.nextInt();
        int b[] = new int[m];
        System.out.println("Enter the elements of b: ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Union of two sorted arrays: ");
        System.out.println(union(a, b));
    }

    public static ArrayList<Integer> union(int a[], int b[]) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                if (al.size() > 0 && al.get(al.size() - 1) != a[i]) {
                    al.add(a[i]);
                } else if (al.size() == 0) {
                    al.add(a[i]);
                }
                i++;
                j++;
            } else if (a[i] < b[j]) {
                if (al.size() > 0 && al.get(al.size() - 1) != a[i]) {
                    al.add(a[i]);
                } else if (al.size() == 0) {
                    al.add(a[i]);
                }
                i++;
            } else {
                if (al.size() > 0 && al.get(al.size() - 1) != b[j]) {
                    al.add(b[j]);
                } else if (al.size() == 0) {
                    al.add(b[j]);
                }
                j++;
            }
        }
        while (i < a.length) {
            if (al.size() > 0 && al.get(al.size() - 1) != a[i]) {
                al.add(a[i]);
            }
            i++;
        }
        while (j < b.length) {
            if (al.size() > 0 && al.get(al.size() - 1) != b[j]) {
                al.add(b[j]);
            }
            j++;
        }
        return al;
    }
}
