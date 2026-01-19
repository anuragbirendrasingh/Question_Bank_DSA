
package TwoPointers;
import java.util.*;
public class boadToSavePeople_881 {
    public static void main(String[] args) {
        int[] arr = {3,5,3,4};
        int limit = 5;
        boat(arr, limit);
    }

    public static int boat(int[] arr,int limit){
        Arrays.sort(arr); 
        int i = 0 ;
        int j = arr.length-1 ;
        int boatCount = 0 ;
        while(i<=j){
            if(arr[i]+arr[j]<=limit){
                boatCount++;
                i++;
                j--;
            }
            else if(arr[i]+arr[j]>limit){
                j--;
                boatCount++;
            }
        }
        // System.out.println(boatCount);
        return boatCount ;
    }
}
