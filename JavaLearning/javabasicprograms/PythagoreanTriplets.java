import java.util.Scanner;

//program to calculate that these three input can able to make the right angle triangle
public class PythagoreanTriplets {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int highestNumber = 0;
        int perpendicular = 0;
        int base = 0;
        boolean isPythagoreanTriplet = false;
        if(a >= b && a >= c) {
            highestNumber = a;
            perpendicular = b;
            base = c;
        } else if(b >= a && b >= c) {
            highestNumber = b;
            perpendicular = a;
            base = c;
        } else {
            highestNumber = c;
            perpendicular = b;
            base = a;
        }
        int eq = (perpendicular * perpendicular) + (base * base);
        if(eq == (highestNumber * highestNumber))
        {
            isPythagoreanTriplet = true;
        }
        System.out.println(isPythagoreanTriplet);
        sc.close();
        
    }

    
}
