package TwoPointers;

import java.util.*;

public class kDiffPairInArray_532 {
    public static void main(String[] args) {
        int[] arr = {1,3,1,5,4};
        int k = 0 ;
        pair(arr, k);
    }

    public static void pair(int[] arr,int k){
        int i = 0 ;
        int j = 1 ;
        int count = 0 ;
        int n = arr.length ;
        Arrays.sort(arr);
        while(i<n && j<n){
            int diff = arr[j] - arr[i];
            if(diff<k){
                j++;
            }
            else if(diff>k){
                i++;
            }
            else if(diff==k){
                // i++;
                // j++;
                count++;
                int a = arr[i];
                int b = arr[j];
                while(i < n && arr[i] == a) i++ ; //skip duplicate of i
                while(j < n && arr[j] == b) j++ ; // -----------------j

            }
        }
        System.out.println(count);
    }
}
