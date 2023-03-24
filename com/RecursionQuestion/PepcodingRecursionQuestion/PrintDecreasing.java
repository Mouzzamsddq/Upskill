import java.util.Scanner;

public class PrintDecreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The output is : ");
        printDec(n);
    }

    // print number n to 1 using recursion
    public static void printDec(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printDec(n - 1);
    }
}
