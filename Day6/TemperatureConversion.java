package Day6;

public class TemperatureConversion {
    public static void main(String[] args) {
convertToFehrenhite(34);
convertToCelcius(45);
    }
    static void convertToFehrenhite(int C){
        System.out.println("Converting Celcius to fahrenite");
       int result =  (C * 9/5) + 32 ;
        System.out.println(C + " Celcius in fahrenite is : " + result + "F");
    }
    static void convertToCelcius(int F){
        System.out.println("Converting Celcius to fahrenite");
         int result = (F - 32) * 5/9;
        System.out.println(F + " fahrenite in celcius is : " + result + "C");
    }
}
