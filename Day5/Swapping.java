package Day5;

public class Swapping {
    public static void main(String[] args) {
        swap(23,34);

    }
    static void swap(int n1, int n2){
        System.out.println("Numbers Before The Swap : " + n1 + " " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("Numbers After The Swap : " + n1 + " " + n2);
    }
}
