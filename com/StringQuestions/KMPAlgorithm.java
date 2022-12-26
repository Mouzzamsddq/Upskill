import java.util.Scanner;

import javax.print.attribute.TextSyntax;

public class KMPAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pattern = sc.next();

        int[] lps = new int[pattern.length()];
        lps[0] = 0;
        int j = 0;
        int i = 1;

        // code for computing lps
        while (i < pattern.length()) {
            if (pattern.charAt(j) == pattern.charAt(i)) {
                lps[i] = j + 1;
                j++;
                i++;
            } else if (pattern.charAt(i) != pattern.charAt(j) && j > 0) {
                j = lps[j - 1];
            } else {
                lps[i] = 0;
                i++;
            }
        }
        // after consstructing lps, let's start matching text with pattern
        // because of LPS, we do not need to look back in the text.

        i = 0;
        j = 0;
        while (i < text.length()) {
            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;
            }
            if (j == pattern.length()) {
                System.out.println("found pattern in text at index : " + (i - j));
                j = lps[j - 1];
            } else if (i < text.length() && text.charAt(i) != pattern.charAt(j)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i = i + 1;
                }
            }
        }
    }
}
