package Day5;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        check(45);
    }
    static void check(int number){

        if(number%2==0){
            System.out.println("The Enter number is Even");
        } else{
            System.out.println("The Enter Number is Odd");
        }
    }
}
