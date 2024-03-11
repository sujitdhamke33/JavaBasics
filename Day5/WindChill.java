package Day5;

public class WindChill {
    public static void main(String[] args) {

            double t = Double.parseDouble(args[0]);
            double v = Double.parseDouble(args[1]);
            effectiveTemp(t,v);
    }
 static void effectiveTemp(double t,double v){
        double w = 35.74+0.6215*t + (0.4275*t -35.75) * (Math.pow(v,0.16));
     System.out.println("The temperature is : " + t);
     System.out.println("The Volume is : " + v);
     System.out.println("The Effective Temperature Is : " + w);
 }
}
