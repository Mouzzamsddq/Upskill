import java.util.Scanner;

/**
 * Time Complexity  - O(N) because of n times functions are calling
 * Space Complexity - O(N) because of n functions call in stack space
 */

public class PrintNameNTimes {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name you want to print n times : ");
        String name = sc.nextLine();
        System.out.println("Enter the number which represent how many times you want to print the name : ");
        int n = sc.nextInt();
        printName(1, n, name);
    }

    public static void printName(int i , int n, String name) {
         if(i > n ) {
            return;
         }   
        System.out.println(name);
        printName(++i, n, name);
    }
}
