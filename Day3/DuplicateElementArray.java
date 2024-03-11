package Day3;

public class DuplicateElementArray {
    public static void main(String[] args) {
        int [] arr = {12,23,43,22,34,54,34,22,67};

        boolean flag = false;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    System.out.print( arr[i] + " ");
                    flag = true;// if found then it will turn true so next will not get executed
                }
            }
        }
        if(flag==false){
        System.out.println("Duplicate elemenet Not found");
        }
    }
}
