import java.util.Scanner;

public class RearrangePositiveNegativeWithOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        rearrangeArray(a);
        printArray(a);

    }

    public static void printArray(int[] a) {
        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void rightRotate(int a[], int from, int to) {
        int temp = a[to];
        for (int i = to - 1; i >= from; i--) {
            a[i + 1] = a[i];

        }
        a[from] = temp;
    }

    public static void rearrangeArray(int[] a) {
        int wrongIndex = -1;
        for (int i = 0; i < a.length; i++) {
            if (wrongIndex != -1) {
                if ((a[wrongIndex] >= 0 && a[i] < 0) || (a[wrongIndex] < 0 && a[i] >= 0)) {
                    rightRotate(a, wrongIndex, i);
                    if (i - wrongIndex >= 2) {
                        wrongIndex += 2;
                    } else {
                        wrongIndex = -1;
                    }
                }

            } else {
                if ((i % 2 == 0 && a[i] >= 0) || (i % 2 == 1 && a[i] < 0)) {
                    wrongIndex = i;
                }
            }
        }
    }

}
