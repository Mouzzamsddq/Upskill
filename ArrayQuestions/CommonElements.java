import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the first array a: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements of array a : ");
        int a[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the second array b: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements of array b : ");
        int b[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Enter the size of the array c : ");
        int n3 = sc.nextInt();
        System.out.println("Enter the elements of array c : ");
        int c[] = new int[n3];
        for (int i = 0; i < n3; i++) {
            c[i] = sc.nextInt();
        }
        System.out.println("The comment elements in above three arrays given are: ");
        System.out.println(commonElements(a, b, c, n1, n2, n3));

    }

    public static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        ArrayList<Integer> resultList = new ArrayList<Integer>();
        int max = Integer.MIN_VALUE;
        if (A[0] > B[0]) {
            max = A[0];
        } else {
            max = B[0];
        }
        if (max < C[0]) {
            max = C[0];
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < A.length && A[i] < max) {
            i++;
        }
        while (j < B.length && B[j] < max) {
            j++;
        }
        while (k < C.length && C[k] < max) {
            k++;
        }
        for (; i < A.length; i++) {
            while (j < B.length && B[j] < A[i]) {
                j++;
            }
            while (k < C.length && C[k] < A[i]) {
                k++;
            }
            if (A[i] == B[j] && B[j] == C[k]) {
                if (!resultList.contains(A[i])) {
                    resultList.add(A[i]);
                }

            }
        }
        return resultList;
    }
}
