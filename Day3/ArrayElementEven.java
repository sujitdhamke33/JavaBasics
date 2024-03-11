package Day3;

public class ArrayElementEven {
    public static void main(String[] args) {
        // Even position elements print
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Elements at even positions:");
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}
