package Leet_02.MonotonicStack.Easy;

import java.util.Stack;

public class CountStepsToMakeArr_2289_13Feb {
    public static void main(String[] args) {
        int[] arr = {5,3,4,4,7,3,6,11,8,5,11};
        // int[] arr = {5,4,7,11,11};
        int ans = countSteps(arr);
        System.out.println(ans);
    }

    public static int countSteps(int[] arr){
        Stack<int[]> st = new Stack<>();
        int ans = 0 ;
        for(int i=arr.length-1 ; i>=0 ; i--){
            int steps = 0 ;
            while(!st.isEmpty()&&arr[i]>st.peek()[0]){
                 steps = Math.max(steps+1, st.peek()[1]);
                 st.pop();

            }
            ans = Math.max(ans, steps);
            st.push(new int[]  {arr[i],steps});
        }
        return ans ;
    }
}
