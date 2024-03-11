package Day6;

public class CouponNumber {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]); // Read N from command-line input

        boolean[] isCollected = new boolean[N]; // Array to track collected coupons
        int count = 0; // Total number of random numbers generated
        int distinct = 0; // Number of distinct coupons collected

        // Repeat until all N distinct coupons are collected
        while (distinct < N) {
            int randomCoupon = getCoupon(N); // Generate a random coupon
            count++; // Increment total count

            if (!isCollected[randomCoupon]) {
                // Discovered a new coupon type
                distinct++;
                isCollected[randomCoupon] = true;
            }
        }

        System.out.println("Total random numbers needed to collect all distinct coupons: " + count);
    }

    // Returns a random coupon between 0 and N-1
    public static int getCoupon(int N) {
        return (int) (Math.random() * N);
    }
}
