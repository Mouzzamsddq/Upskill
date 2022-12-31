import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintDuplicatesAndCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character, Integer> countDuplicates = new HashMap<>();
        for (char ch : s.toCharArray()) {
            int count = countDuplicates.getOrDefault(ch, 0);
            countDuplicates.put(ch, ++count);
        }

        for (Map.Entry<Character, Integer> map : countDuplicates.entrySet()) {
            if (map.getValue() > 1) {
                System.out.println(map.getKey() + "--->" + map.getValue());
            }
        }
    }
}