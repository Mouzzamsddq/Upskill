import java.util.Scanner;

import javax.print.attribute.standard.NumberUpSupported;

public class ArraOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfElements = sc.nextInt();
        int a[] = new int[noOfElements];
        // take input from user and strored in the array
        for (int i = 0; i < noOfElements; i++) {
            a[i] = sc.nextInt();
        }

        // print the elements of the array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        // close the scanner
        sc.close();
    }
}