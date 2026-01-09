package Array.Self;

public class countsmallerElement_1365 {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        countSmaller(arr);
    }

    public static void countSmaller(int[] arr){
        int[] ans = new int[arr.length];
        int k = 0;
        for(int i=0 ; i<arr.length ;i++){
            int count = 0 ;
            for(int j=0 ; j<arr.length ;j++){

                if(arr[j]<arr[i]){
                    count++;
                }
              
            }
              ans[k] = count ;
                k++;
        } 

        for(int num : ans){
            System.out.print(num + " ");
        }
    }
}
