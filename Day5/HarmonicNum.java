package Day5;

import java.util.Scanner;

public class HarmonicNum {

    // 1 pasun magche tyache 1/1,1/2,1/3, yanche sum ani jevdhya term cha sum vicharlay to tithe takaycha

    static double HarmonicNumber(int N) {

        double harmonicNumber = 0.0;

        for (int i = 1; i <= N; i++) {
            harmonicNumber = harmonicNumber + (1.0 / i); // ithe 1 chya jagi jo taku tyacha kadhta yeil
        }

        return harmonicNumber;
    }

    public static void main(String[] args) {
        double harmonicNumber = 0.0 ;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of 'N': ");
        int N = sc.nextInt();

        double result = HarmonicNumber(N);

        System.out.println("The " + N + "th Harmonic Number is: " + result);

    }
}
