package Stack.Easy;

import java.util.*;

public class delete_a_item {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int item = 3;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }
        delete(st, item);
        System.out.println(st);
    }

    public static void delete(Stack<Integer> st, int item) {
        if(st.isEmpty()){
            return ;
        }
       

        int top = st.pop();
        delete(st, item);
        if(top != item){
            st.push(top);
        }
        // System.out.println(st);
    }


}
