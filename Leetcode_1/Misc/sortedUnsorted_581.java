package Misc ;

public class sortedUnsorted_581 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int ans = isSorted(arr) ;
        System.out.println(ans);
    }


    public static int isSorted(int[] arr){
        for(int i = 0 ; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return 1 ;
            }
        }
        return 0;
    }
}