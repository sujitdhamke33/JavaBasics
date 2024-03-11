package Day5;

public class PrimeFactors {
    public static void main(String[] args) {
 primeFact(540);
    }
    static void primeFact(int number){
        for (int i = 2; i < number ; i+=1) {
           while(number%i==0){
               number = number/i;
               System.out.println(i);
           }
        }
    }
}
