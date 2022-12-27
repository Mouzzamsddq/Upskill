import java.util.HashMap;
import java.util.Scanner;

public class ValidShuffleTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String result = sc.next();

        // call method to result is a valid shuffle of two string or not
        boolean isValidShuffle = validShuffle(s1, s2, result);
        boolean isValidShuffle2 = validShuffleWithOrder(s1, s2, result);
        System.out.println(isValidShuffle);
        System.out.println(isValidShuffle2);

    }

    /*
     * This method is used to check two string is a valid shuffle by maintianing
     * order
     * TIme complexity - O(n+m) where n = length of s1 m = length of s2
     * Space complexity - O(1)
     */
    public static boolean validShuffleWithOrder(String s1, String s2, String res) {
        if (s1.length() + s2.length() != res.length()) {
            return false;
        }
        int i = 0;
        int j = 0;
        int k = 0;
        while (k < res.length()) {
            if (i < s1.length() && s1.charAt(i) == res.charAt(k)) {
                i++;
            } else if (j < s2.length() && s2.charAt(j) == res.charAt(k)) {
                j++;
            } else {
                break;
            }
            k++;
        }
        if (k == res.length()) {
            return true;
        } else {
            return false;
        }
    }

    // this solution wil not consider the order of the chqaracters in the particular
    // string
    // time complexity - O(n+m)
    // space complexity - O(n+m)
    public static boolean validShuffle(String s1, String s2, String result) {
        if (s1.length() + s2.length() != result.length()) {
            return false;
        }
        HashMap<String, Integer> freqMap = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            int count = freqMap.getOrDefault("" + ch, 0);
            freqMap.put("" + ch, ++count);
        }

        for (char ch : s2.toCharArray()) {
            int count = freqMap.getOrDefault("" + ch, 0);
            freqMap.put("" + ch, ++count);
        }

        for (char ch : result.toCharArray()) {
            int count = freqMap.getOrDefault("" + ch, 0);
            if (count == 0) {
                return false;
            } else {
                freqMap.put("" + ch, --count);
            }
        }

        return true;
    }
}