package Day3;

public class SortingInAscending {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 3};

        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {

                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

       
        System.out.println("Sorted Array in Ascending Order:");
        for (int element : array) {
            System.out.print(element + " ");
        }
    }
}
