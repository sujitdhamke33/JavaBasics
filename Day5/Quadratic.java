package Day5;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the values of a, b, and c for the quadratic equation ax^2 + bx + c:");

        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Enter b: ");
        double b = sc.nextDouble();

        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        double delta = calculateDelta(a, b, c);

        if (delta < 0) {
            System.out.println("The quadratic equation has no real roots.");
        }  else {
            double root1 = calculateRoot1(a, b, delta);
            double root2 = calculateRoot2(a, b, delta);
            System.out.println("The quadratic equation has two real roots: " + root1 + " and " + root2);
        }
        
    }
    private static double calculateDelta(double a, double b, double c) {
        return b*b - 4*a*c;
    }

    private static double calculateRoot1(double a, double b, double delta) {

        return (-b + Math.sqrt(delta))/(2*a);
    }
    private static double calculateRoot2(double a, double b, double delta) {
        return (-b - Math.sqrt(delta))/(2*a);
    }

}
