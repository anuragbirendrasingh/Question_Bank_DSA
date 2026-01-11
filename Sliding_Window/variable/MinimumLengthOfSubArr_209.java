package Sliding_Window.variable;

public class MinimumLengthOfSubArr_209 {
    public static void main(String[] args) {
        int[] arr = {1,4,2,7,1,2,3};
        int target = 8 ;
        int ans = minLength(arr, target);
        System.out.println(ans);
    }

    public static int minLength(int[] arr,int target){
        int ei =0,si = 0,sum=0;
        int min = Integer.MAX_VALUE ;
        while (ei<arr.length) {
            sum+=arr[ei];

            while(sum>=target){
                min = Math.min(min, ei-si+1);
                sum-=arr[si];
                si++;
            }

            ei++;
        }
        return min == Integer.MAX_VALUE ?  0 : min ;

    }
}
