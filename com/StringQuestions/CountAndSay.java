import java.util.Scanner;

import javax.print.attribute.ResolutionSyntax;

public class CountAndSay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // code for count and say problem
        String result = countAndSay(n);
        System.out.println(result);

    }

    public static String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        if (n == 2) {
            return "2";
        }
        String s = "11";
        for (int i = 3; i <= n; i++) {

            int length = s.length();
            int count = 1;
            String temp = "";
            s = s + "$";
            for (int j = 0; j < length; j++) {
                if (s.charAt(j) == s.charAt(j + 1)) {
                    count++;
                } else {
                    temp = temp + count + "" + s.charAt(j);
                    count = 1;
                }
            }
            s = temp;
        }

        return s;
    }
}
