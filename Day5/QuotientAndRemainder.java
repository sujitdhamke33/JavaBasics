package Day5;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the dividend number: ");
        int dividend = sc.nextInt();


        System.out.print("Enter the divisor number: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
        } else {
            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        }
    }
}
