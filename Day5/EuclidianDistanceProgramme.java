package Day5;

public class EuclidianDistanceProgramme {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("Enter exact only two integers");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        double distance = calculateDistance(x,y);
        System.out.println(distance);
    }

    private static double calculateDistance(int x, int y) {
        return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
    }

}
