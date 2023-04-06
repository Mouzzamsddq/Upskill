import java.util.Scanner;

public class StringHashing {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           String s = sc.next();
           int queries = sc.nextInt();
           
           // precomputation
           int hash[] = new int[26]; // I am assuming that all the characters in string are in lowercase
           for(char ch : s.toCharArray()) {
                hash[ch - 97]++;
           }

           while(queries != 0 ) {
               char ch = sc.next().charAt(0);
               // fetching
               int count = hash[ch - 97];
               System.out.println(ch+" -> "+count);
               queries--;
           }

           System.out.println("String hashing completed");
           sc.close();
    }   
}
