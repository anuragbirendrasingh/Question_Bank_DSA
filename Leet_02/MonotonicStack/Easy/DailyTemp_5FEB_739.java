package Leet_02.MonotonicStack.Easy;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemp_5FEB_739 {
    public static void main(String[] args) {
        int[] arr = {73,74,75,71,69,72,76,73};
        find_count_of_NGE(arr);
    }

    public static void find_count_of_NGE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        Arrays.fill(ans,0);
        for(int i=0 ; i<arr.length ;i++){
            
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                 int previousIdx = st.pop();
                 ans[previousIdx] = i - previousIdx ;
            }
            st.push(i);
           
        }
        for(int num:ans){
            System.out.print(num + " ");
        }

    }
}
