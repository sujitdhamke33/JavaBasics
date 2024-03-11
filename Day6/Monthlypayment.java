package Day6;

import java.util.Scanner;

public class Monthlypayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values P,Y,R");
        int P = sc.nextInt();
        int Y = sc.nextInt();
        double R = sc.nextDouble();

        double monthlyPayment = monthlyPayment(P,Y,R);
        System.out.println("Monthly Payment : " + monthlyPayment);
    }
    static double monthlyPayment(int P, int Y,double R){
        int n = 12 * Y;
       double r = R/(12*100);
       double MonthlyPayment = (P * r) / (1 - Math.pow((1 + r),(-n)));
       return  MonthlyPayment;
    }

}
