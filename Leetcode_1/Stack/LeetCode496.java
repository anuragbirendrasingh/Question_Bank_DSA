package Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCode496 {
    public static void main(String[] args) {
        int[] arr1 = {4,1,2};
        int[] arr2 = {1,3,4,2} ; 
        int[] res = Next_Greater_Element(arr1, arr2) ;
        for(int num : res){
            System.out.println(num + " ");
        }

    }

    public static int[] Next_Greater_Element(int[] arr1,int[] arr2){
          Map<Integer,Integer> mp = new HashMap<>();
          Stack<Integer> st = new Stack<>();

          for(int i=arr2.length-1 ;i>=0 ;i--){
               int num = arr2[i];

               while(!st.isEmpty() && st.peek()<=num){
                  st.pop();
               }

               int nge = st.isEmpty() ? -1 : st.peek() ;

               mp.put(num,nge);

               st.push(num);
          }

          int[] ans = new int[arr1.length];
          for(int i=0 ; i<arr1.length;i++){
            ans[i] = mp.get(arr1[i]);
          }
          return ans ;
    }
}
