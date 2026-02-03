package Leet_02.MonotonicStack.Easy;
import java.util.HashMap;
import java.util.Stack;
public class NGE1_3FEB_496 {
    public static void main(String[] args) {
        int[] arr1   = {1,4,5};
        int[] arr2 = {2,1,5,3,6,4}; 
        nextGreaterElment_1(arr1, arr2);
    }
    public static int[] nextGreaterElment_1(int[] arr1 , int[] arr2){
        int[] nge = new int[arr2.length];
        Stack<Integer> st = new Stack<>();  
        for(int i= 0 ; i<arr2.length ;i++){
              while(!st.isEmpty() && arr2[(st.peek())] < arr2[i]){
                 int idx = st.pop();
                 nge[idx] = arr2[i];
              }             
              st.push(i);
        }
        while(!st.isEmpty()){
            // ans[st.pop()]=-1;
            int idx = st.pop();
            nge[idx] = -1 ;
        }
        // for(int num : nge){
        //     System.out.print(num + " ");
        // }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0 ; i<arr2.length ;i++){
            map.put(arr2[i], nge[i]);
        }
        // System.out.println(map);
        int[] ans = new int[arr1.length] ;
        for(int i=0 ; i<arr1.length ;i++){
            ans[i] = map.get(arr1[i]);
        }
        // for(int num : ans){
        //     System.out.print(num + " ");
        // }
        return ans ;
    }
}
