package Day3;

public class LargestElementArray {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 15};

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        System.out.println("Largest element: " + max);
    }
}
