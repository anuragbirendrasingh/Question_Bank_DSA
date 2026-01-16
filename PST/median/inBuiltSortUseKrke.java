package PST.median;

import java.util.*;

public class inBuiltSortUseKrke {
    public static void main(String[] args) {
        // int[] arr = {7,1,3,9,5}; 
        int[] arr = {2,4,6,8};
        sort(arr);  
    }

    public static void sort(int[] arr){
        Arrays.sort(arr);
        for(int num :arr){
            System.out.print(num + " ");
        }

        int indexOfMedian = arr.length / 2 ;
        int median = arr[indexOfMedian];
        System.out.println("Median Of array " + median);

        
    }
}
