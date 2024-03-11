package Day5;

public class PowerOf2 {
    public static void main(String[] args) {
        int N = 10;

        System.out.println("Powers of 2 up to 2^" + N + ":");
            for (int i = 0; i <= N; i++) {
                double result = Math.pow(2, i);
                System.out.println("2^" + i + " = " + (int) result);
            }
    }
}
