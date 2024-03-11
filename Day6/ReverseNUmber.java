package Day6;

import java.util.Scanner;

public class ReverseNUmber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number");
        int num = sc.nextInt();
        System.out.println("You have enter the number is : " + num );

          int rem;int rev=0;

        while(num!=0) {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num = num / 10;
        }
        System.out.println(" The reverse of given number is : " + rev);
    }
}
