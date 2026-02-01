package Leet_02.MIK;

import java.util.Stack;

public class monotonicIncreasing_1 {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,3};
        inc(arr);
    }

    public static void inc(int[] arr){
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<arr.length ;i++){
            
            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            st.push(i);
        }

        System.out.println("Index  of the array in stack-->" + st);
    }
}
