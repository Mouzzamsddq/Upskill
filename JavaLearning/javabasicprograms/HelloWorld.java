import java.util.*;
public class HelloWorld {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum = x + y;
        sc.close();
        System.out.println("This is my first program to calculate the sum of two numbers: "+sum);
    }
}