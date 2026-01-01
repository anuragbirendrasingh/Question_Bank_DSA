package Stack;

import java.util.Stack;

public class Leet856 {
    public static void main(String[] args) {
        // String str = "()";
    }

    public static int findScore(String str){

        Stack<Character> st = new Stack<>();
        char up = '(';
        char down = ')';
        int count = 0 ;
        

        for(int i = 0 ; i<str.length();i++){
            st.push(str.charAt(i));

        }

        while(!st.isEmpty()){
            char firstEle = st.pop();
            char secEle = st.pop();
            if(firstEle==up && secEle==down){
                count++ ;
            }
            st.pop();
        }
        return count ;
    }
}
