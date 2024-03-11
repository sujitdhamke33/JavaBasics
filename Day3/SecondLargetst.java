package Day3;

import java.util.Scanner;

public class SecondLargetst {

    public static int secondLargest(int[] arr){
        int Highest = Integer.MIN_VALUE;
        int Lowest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>Highest){
                Highest=arr[i];
                Highest = Math.max(Highest,arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=Highest){
                if(arr[i]>Lowest){
                    Lowest=arr[i];
                }
            }
        }
        return Lowest;
    }

    public static int secondLargest1(int[] arr) {
        int Highest = Integer.MIN_VALUE;
        int Lowest = Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>Highest){
                Lowest = Highest;
                Highest = arr[i];
            } else if(arr[i]> Lowest && arr[i]!= Highest) {
                Lowest = arr[i];
            }
        }
        return Lowest ;
    }
    public static int[] takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
      }
    public static void main(String[] args) {
     int [] arr = takeUserInput();
        System.out.println(secondLargest1(arr));
    }
}
