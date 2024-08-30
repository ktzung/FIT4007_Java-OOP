import java.util.Scanner;

public class HW_1_19 {
    public static void main(String[] args) {
        //Define Variables
        int m, n;
        int greatestCommonDivisor;
        Scanner sc = new Scanner(System.in);
        //1. Input
        System.out.println("Enter m:");
        m = sc.nextInt();
        System.out.println("Enter n:");
        n = sc.nextInt();
        //2. Process
        while (m != n) {
            if (m > n) {
                m = m - n;
            } else {
                n = n - m;
            }
        }
        //3. Output
        greatestCommonDivisor = m;
        System.out.println("Greatest Common Divisor: " + greatestCommonDivisor);
    }
}
