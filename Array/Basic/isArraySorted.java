package Array.Basic;

public class isArraySorted {
    public static void main(String[] args) {
         int[] arr = {10,20,30,40,50};
        boolean ans = isSorted(arr);
        System.out.println(ans);
    }

    public static boolean isSorted(int[] arr){
        for(int i=1 ; i<arr.length;i++){
               if(arr[i-1]>arr[i]){
                return false ;
               }
        }
        return true ;
    }
 
}
