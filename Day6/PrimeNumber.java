package Day6;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("ENter the number to check :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <num ; i++) {
            if(num % i == 0){
                flag = false;
                break;
            }
        }
    if(flag){
        System.out.println("The number is prime");
    } else{
        System.out.println("The number is not Prime");
    }
    }
}
