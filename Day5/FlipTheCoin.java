package Day5;

import java.util.Random;
import java.util.Scanner;

public class FlipTheCoin {

    static Scanner sc = new Scanner(System.in);
    static int headsCount = 0;
    static int tailsCount = 0;

    static void randomNum(int noOfFlips) {
        Random random = new Random();

        for (int i = 0; i < noOfFlips; i++) {
            int coinResult = random.nextInt(2);

            if (coinResult == 0) {
                headsCount++;
            } else {
                tailsCount++;
            }
        }
    }

    public static void main(String[] args) {
        int noOfFlips = sc.nextInt();
        randomNum(noOfFlips);

        double headsPercentage = (double) headsCount / noOfFlips * 100;
        double tailsPercentage = (double) tailsCount / noOfFlips * 100;

        System.out.println("Number of flips: " + noOfFlips);
        System.out.println("Heads count: " + headsCount + " (" + headsPercentage + "%)");
        System.out.println("Tails count: " + tailsCount + " (" + tailsPercentage + "%)");
    }
}
