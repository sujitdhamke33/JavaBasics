package Day6;

import java.util.Scanner;

public class FibonoSeries {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number of terms in the Fibonacci series: ");
            int n = sc.nextInt();

            System.out.println("Fibonacci series with " + n + " terms:");

            fibono(n);
        }
        static void fibono(int n){
            int firstTerm = 0;
            int secondTerm = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(firstTerm + " ");

                int nextTerm = getNextTerm(firstTerm,secondTerm);
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
        static int getNextTerm(int a, int b) {
            return a + b;
        }
    }

