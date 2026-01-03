package Sliding_Window.variable;
public class ProductLessThanK_713 {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,4,2};
        int k = 10 ;

       int ans =  countTotalSubArray(arr, k);
       System.out.println(ans);
    }

    public static int countTotalSubArray(int[] arr,int k){
        int product = 1 ;
        int count = 0 ;

        int startIndex = 0 ;
        int endIndex = 0 ;

        while(endIndex<arr.length){

            //grow
            product = product * arr[endIndex];

            //shrink
            while(product>=k && startIndex<=endIndex){
                product = product / arr[startIndex];
                startIndex++;
            }

            //update ans
            count = count + (endIndex-startIndex+1); //size of each window
            endIndex++;
        }

        return count ;
    }
}
