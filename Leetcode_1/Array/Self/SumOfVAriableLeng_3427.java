//sum of variable length of subarray 
package Array.Self;

public class SumOfVAriableLeng_3427 {

    public static void main(String[] args) {
        int[] arr  = {3,1,1,2};
        int ans = findTotalSum(arr);
        System.out.println(ans);
    }

    public static int findTotalSum(int[] arr){
        int totalSum = 0 ;
        for(int i=0;i<arr.length;i++){
            int start = Math.max(0,i-arr[i]);
            totalSum += sumOFDefinedPair(arr, start ,i);

        }
        return totalSum ;
    }

    public static  int sumOFDefinedPair(int[] arr,int i,int j){
        int sum = 0 ;
        for(int k=i ; k<=j ;k++){
            sum+=arr[k];
        }
        return sum ;
    }
}