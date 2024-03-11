package Day5;

import java.util.Arrays;

public class DistinctTriplets {
    public static void main(String[] args) {
        int[] array = {1, -2, 1, 0, 5, -1, -4, 2, -3};
        findTriplets(array);

    }

    static void findTriplets(int[] array){
        Arrays.sort(array);
        int n = array.length;
        boolean flag = false;
        int count = 0;

        for (int i = 0; i < n-2 ; i++) {
            int left = i+1;
            int right = n-1;
            int x = array[i];

            while(left<right){
                if (x + array[left] + array[right] == 0) {
                    System.out.println(x + " " + array[left] + " " + array[right]);
                    left++;
                    right--;
                    flag = true;
                    count++;
                } else if(x + array[left] + array[right]<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        if(flag==false){
            System.out.println("No distinct triplets with sum zero found.");
        }
        System.out.println("The number of triplets count is : " + count);
    }
}
