import java.util.Scanner;

import javax.imageio.spi.ImageReaderSpi;

public class CheckRotationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if (s1.length() != s2.length()) {
            System.out.println("strings are not rotation of each other");
            return;
        }
        boolean isRotation = false;
        for (int i = 0; i < s1.length() - 1; i++) {
            s1 = s1.charAt(s1.length() - 1) + s1;
            s1 = s1.substring(0, s1.length() - 1);
            if (s1.equals(s2)) {
                isRotation = true;
                System.out.println("strings are rotation of each other");
                break;
            }
        }

        if (!isRotation) {
            System.out.println("strings are not rotation of each other");
        }

    }

}
