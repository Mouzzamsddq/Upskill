import java.util.Scanner;

public class Print1ToNUsingBacktracking {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n, n);
        
    }

    static void print(int i , int n) {
        if(i == 0) {
            return;
        } 
        print(i - 1, n);
        System.out.println(i);
    }
}
