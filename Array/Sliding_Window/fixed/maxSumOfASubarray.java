package Array.Sliding_Window.fixed;

public class maxSumOfASubarray {
    public static void main(String[] args) {
        int[] arr = {2,3,1,5,7,9,4,3,2};
        int k = 3 ;
        int ans = max_sum(arr, k);
        System.out.println(ans);
    }

    public static int max_sum(int[] arr,int k){
        //window sum
        //grow window
        // shrink window
        // update ans
        int windowSum = 0 ;
        for(int i=0;i<k;i++){
            windowSum += arr[i] ;
        }

        int ans = windowSum ;

        for(int i=k ;i<arr.length ;i++){
              windowSum += arr[i] ; // grow
              windowSum -= arr[i-k] ;  // shrink
              ans = Math.max(windowSum, ans);  // update ans
        }
         return ans;
    }
}
