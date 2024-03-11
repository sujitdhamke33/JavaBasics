package Day6;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number to check :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
             sum += i;
            }

        }
        if(sum==num){
            System.out.println("its the Perfect Number");
        }else{
            System.out.println("Number Is not the perfect");
        }
    }
}
