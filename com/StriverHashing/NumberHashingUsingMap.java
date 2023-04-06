import java.util.HashMap;
import java.util.Scanner;

public class NumberHashingUsingMap {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for(int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        

        /**
         * why we are using map?
         * Because in java int has some range limit, If we get a number beyond the int range so that we can not use array
         * At that time, we can use hashmap and hashmap memory efficient for hashing.
         */
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num : a) {
            int currentFreq = freqMap.getOrDefault(num, 0);
            freqMap.put(num, ++currentFreq); 
        }

        int userInput = sc.nextInt();
        while(userInput != 0) {
            int freq = freqMap.getOrDefault(userInput, 0);
            System.out.println(userInput +" ->  "+ freq);
            userInput = sc.nextInt();
        }
        
    }
}
