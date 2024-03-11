package Day6;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press Enter to start thd stopwatch.");
        sc.nextLine(); // it takes as enter button

        long startTime = System.currentTimeMillis();

        System.out.println(startTime);
        System.out.println("Stopwatch started. Press Enter to stop.");
        sc.nextLine();

        long endTime = System.currentTimeMillis();
        System.out.println(endTime);
        long elapsedTime = endTime - startTime;

        System.out.println("Stopwatch started. Press Enter to stop.");
        sc.nextLine();

         endTime = System.currentTimeMillis();

         elapsedTime = endTime - startTime;

        System.out.println("Stopwatch stopped.");
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds");

    }
}
