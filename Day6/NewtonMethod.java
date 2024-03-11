package Day6;

import java.util.Scanner;

public class NewtonMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double c = sc.nextInt();
        double result = sqrt(c);

        System.out.println("Square root of " + c + " is approximitely : " + result);

    }
    static double sqrt(double c) {
        if (c < 0) {
            return -1;
        }
        // Initial guess, starting point for Newton's method
        double epsilon = 1e-15;
        double t = c;

        // Newton's method to compute square root
        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }
        return t;
    }
}
