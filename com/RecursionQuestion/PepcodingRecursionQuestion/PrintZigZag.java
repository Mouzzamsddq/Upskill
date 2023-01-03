import java.util.Scanner;

public class PrintZigZag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pzz(n);
    }

    // this question is used to give understanding that how to analyze recursive
    // calls and do complete analysis.
    public static void pzz(int n) {
        if (n == 0) {
            return;
        }
        System.out.println("Pre : " + n);
        pzz(n - 1);
        System.out.println("In: " + n);
        pzz(n - 1);
        System.out.println("Post: " + n);
    }
}
