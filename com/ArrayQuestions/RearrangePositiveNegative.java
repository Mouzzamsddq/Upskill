import java.util.Scanner;

/*
 *  There are two question of same type but one thing is dfferent that is order. The below solution when works when interviewer tell us
 *  order should not preserved
 */
public class RearrangePositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        while (i < a.length) {
            if (a[i] >= 0) {
                swap(a, i, j);
                i++;
                j++;
            } else {
                i++;

            }
        }
        i = 0;
        while (i < a.length && j < a.length) {
            swap(a, i, j);
            i += 2;
            j++;
        }
        printArray(a);

    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void printArray(int a[]) {
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
}
