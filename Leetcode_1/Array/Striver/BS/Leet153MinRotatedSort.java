package Array.Striver.BS;

public class Leet153MinRotatedSort {
    public static void main(String[] args) {
        
    }
    public static int min_in_rotated_sorted_arr(int[] arr){
        int lo = 0 ;
        int hi = arr.length-1 ;
        int ans = Integer.MAX_VALUE ;
        while(lo<=hi){
            int mid = lo + (hi-lo) / 2 ;
            if(arr[mid]<=arr[lo]){
                 ans = arr[lo];
                 lo= mid+1;
            }
            else{
                
            }

        }
        return ans;
    }
}
