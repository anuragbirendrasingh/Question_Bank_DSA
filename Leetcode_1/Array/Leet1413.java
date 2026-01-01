package Array;

public class Leet1413 {
    public static void main(String[] args) {
        int[] arr = {-3,2,-3,4,2};
        System.out.println(minimum_start_value(arr));
    }

    public static int minimum_start_value(int[] arr){
        int prefixSum = 0 ;
        int  minPrefix = 0 ;

        for(int num : arr){
            prefixSum += num ;
             minPrefix  =  Math.min(prefixSum,minPrefix);
        }

        return 1 - minPrefix;
    }
}
