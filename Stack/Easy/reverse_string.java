package Stack.Easy;

import java.util.Stack;

public class reverse_string {
    public static void main(String[] args) {
        String str = "abcd" ;
        String ans = "";
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            st.push(str.charAt(i));
        }

        while(!st.isEmpty()){
            ans =  ans + st.pop() + " ";
        }
        System.out.println(ans);

    }
}
