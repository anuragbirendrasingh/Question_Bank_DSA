package Array.Sliding_Window.fixed;
import java.util.*;
public class return_all_the_item_of_arr {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 5, 7, 9, 4, 3, 2 };
        int k = 3;

        result res = find(arr, k);
        System.out.println("index of window  " + res.index);
        System.out.println("Maxsum of window " + res.sum);
        System.out.println("the max window is " + Arrays.toString(res.window));
    }

    static class result{
        int index;
        int sum ;
        int [] window ;

        result(int index ,int sum , int[] window){
            this.index = index ;
            this.sum = sum ;
            this.window = window ;
        }
    }

    public static result find(int[] arr ,int k){
        int sum = 0 ;
        for(int i = 0 ; i< k ;i++){
           sum += arr[i] ;
        }

        int maxSum = sum ;
        int index = 0 ;
        for(int i= k; i<arr.length;i++){
            sum+=arr[i];
            sum-=arr[i-k];

            if(sum > maxSum){
                maxSum = sum ;
                index = i-k +1;
            }
        }

        int[] window = new int[k];
        for(int i=0 ; i<k; i++){
            window[i] = arr[index + i];
        }

        return new result(index, maxSum, window)  ;
    }
}
