public class Pattern22 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count);
                count = count == 0 ? 1 : 0;
            }
            System.out.println();
        }
    }
}
