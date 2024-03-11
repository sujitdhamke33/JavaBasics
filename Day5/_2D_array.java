package Day5;

import java.util.Scanner;

public class _2D_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (M): ");
        int M = scanner.nextInt();

        System.out.print("Enter the number of columns (N): ");
        int N = scanner.nextInt();

        int[][] array = new int[M][N];

        for (int i = 0; i < M ; i++) {
            for (int j = 0; j < N ; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < M ; i++) {
            for (int j = 0; j < N ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
