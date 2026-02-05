package Leet_02.MonotonicStack.Easy;

import java.util.Stack;

public class NGE2_4FEB_503 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3};
    }

    public static void findNextGreaterInCircularArr(int[] arr){
        int[] ans = new int[arr.length];
        Stack<Integer> st  = new Stack<>();
        for(int i=0 ; i<arr.length-1 ;i++){
            while(!st.isEmpty()&&arr[st.peek()]<arr[i]){
                int idx = st.pop();
                ans[idx] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int idx = st.pop();
            ans[idx] = -1 ;
        }
    }

    public static void LastElementCheck_NGE(int[] arr,int[]ans){
         Stack<Integer> st  = new Stack<>();
         int n = arr.length ;
         int count = arr.length-2 ;
         int i = 0 ;
         while(count<=n-2){
            int eleIdx = arr[i+1] % n ;
                         while(!st.isEmpty()&&arr[st.peek()]<arr[eleIdx]){
                int idx = st.pop();
                ans[idx] = arr[eleIdx];
            }
            st.push(i);
            count--;
        }
        while(!st.isEmpty()){
            int idx = st.pop();
            ans[idx] = -1 ;
            // count--;
        }
         }
    }

