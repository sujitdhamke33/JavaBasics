package Day6;

public class DayWeek {
    public static void main(String[] args) {
        int d = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        int y0 = y -(14 - m) / 12;
        int x = y0 + y0 /4 - y0 / 100 + y0 / 400 ;
        int m0 = m + 12 * ((14 - m)/12) - 2;
        int d0 = (d + x + 31 * m0 / 12 ) % 7 ;

        System.out.println("Day of the week ( 0 = Sunday, 1 = Monday,2 = Tuesday, 3 = wednesday, 4 = thursday,5 = Friday ... 6 = Saturday); " ) ;
        System.out.println(d0);
    }
}
