import java.net.BindException;
import java.util.*;

public class ReverseBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binaryResult = "";
        while (n != 0) {
            binaryResult = (n % 2) + binaryResult;
            n = n / 2;
        }
        int startIndex = 32 - binaryResult.length();
        long result = 0;
        for (char ch : binaryResult.toCharArray()) {
            int num = Integer.parseInt("" + ch);
            if (num == 1) {
                result += Math.pow(2, startIndex);
                startIndex++;
            } else {
                startIndex++;
                continue;
            }
        }
        System.out.println(result);
    }
}
