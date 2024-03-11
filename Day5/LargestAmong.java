package Day5;

public class LargestAmong {
    public static void main(String[] args) {
    largest(12,45,6789);
    }
    static void largest(int num1,int num2,int num3){
        int max = Math.max(Math.max(num1,num2),num3);
        System.out.println("The maximum among all is : " + max);
    }
}
