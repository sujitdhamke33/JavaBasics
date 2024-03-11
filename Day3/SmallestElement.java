package Day3;

public class SmallestElement {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 15,34,35,56,5677,66,6,66};

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        System.out.println("Smallest element: " + min);
    }
}
