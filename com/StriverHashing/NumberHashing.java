import java.util.Scanner;

public class NumberHashing {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0 ;i < n ; i++)  {
            a[i] = sc.nextInt();
        }
        int queries = sc.nextInt();

        // perform prestoration/ precalculation
        int hash[] = new int[13]; // assuming we can enter only at max 0 - 12 numbers
        for(int i = 0 ; i < n ; i++) {
            hash[a[i]]++;
        }

        while(queries != 0) {
            int num = sc.nextInt();
            // perform fetching
            int count = hash[num];
            System.out.println(num+ " -> " + count);
            queries--;
        }
        
        System.out.println("Hashing completed");
        sc.close();
    }
}
