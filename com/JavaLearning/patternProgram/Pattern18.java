/*
  Striver pattern program completed
 */
public class Pattern18 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if ((4 - i) <= j && (4 + i) >= j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
