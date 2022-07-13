import java.util.Scanner;

public class Exponents {
    static int result = 1;

    static int power(int a, int b) {
        if (a == 0) {
            return 0;
        } else if (b == 0) {
            return 1;
        }
        result *= a;
        power(a, b - 1);
        return result;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the Base Number : ");
        int a = inp.nextInt();
        System.out.print("Enter the Exponent Number : ");
        int b = inp.nextInt();
        System.out.println("Result : " + power(a, b));
    }
}