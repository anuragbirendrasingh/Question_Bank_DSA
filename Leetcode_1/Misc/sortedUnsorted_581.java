package Misc ;

public class sortedUnsorted_581 {

    public static void main(String[] args) {
        int[] arr = {1,3,5,4,2,6};
        int ans = findLength(arr);
        System.out.println(ans);
    }

    public static int findLength(int[] arr){
        int left = -1 ;
        int right = -1 ;
        int n = arr.length ;

        //find left Most Index Breaking--Sorting condition
        for(int i = 0 ; i< n -1; i++){
            if(arr[i]>arr[i+1]){
                left = i ;
                break ;
            }
        }
        // if the value of i is not chnaging it means array already sorted
        if(left==-1){
            return 0 ;
        }

        //find right Most Index Breaking...........
        for(int i = arr.length-1 ; i>0 ;i--){
            if(arr[i]<arr[i-1]){
                right = i ;
                break ;
            }
        }

        // find min max in range of the [LEFT--RIGHT]
        int min = Integer.MAX_VALUE ,max = Integer.MIN_VALUE ;
        for(int i=left;i<=right;i++){
            min = Math.min(arr[i],min);
            max = Math.max(arr[i],max);
        }

        //if the left most sorted has any elment less than min then EXPAND LEFT
        for(int i=0 ;i<left ;i++){
            if(arr[i]>min){
                left = i ;
                break ;
            }
        }

        //Same for right 
        for(int i=arr.length-1 ; i>right ;i--){
            if(arr[i]<max){
                right = i ;
                break ;
            }
        }

        return right-left+1 ;
    }
}