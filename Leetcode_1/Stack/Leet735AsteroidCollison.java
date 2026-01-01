package Stack;

import java.util.Stack;

public class Leet735AsteroidCollison {
    public static void main(String[] args) {
        int[] arr = {5,10,-5};
        int[] ans = asteroid_jo_jinnda_baach_gaya(arr);
        for(int num :ans){
            System.out.print(num + " ");
        }
    }
    public static int[] asteroid_jo_jinnda_baach_gaya(int[] arr){
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<arr.length;i++){
            int a = arr[i];  // current asteroid 
            boolean alive = true ;

            //jab tak collision possible hai 
            while(alive && !st.isEmpty() && st.peek()>0 && a < 0 ){
                int top = st.peek();

                if(Math.abs(a) > top){
                    st.pop();   //chhota asteroid hata do stack se
                }
                else if(Math.abs(a)==top){
                    st.pop();   //barbar asteroid hata d stack se
                    alive = false ;
                }
                else{
                    alive = false ; //current asteroid chhota udda do
                }
            }
            if(alive){
                st.push(a);
            }
        }

        //stack ----> array  ulta niklna hoga bcz stack is in LIFO
        int[] result = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            result[i]=st.pop();
        }
        return result ;

    }
}
