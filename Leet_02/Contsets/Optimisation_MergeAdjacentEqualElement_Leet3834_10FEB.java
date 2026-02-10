package Leet_02.Contsets;

import java.util.*;

public class Optimisation_MergeAdjacentEqualElement_Leet3834_10FEB {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4 , 3 };
        optisimed_Version(arr);
    }

    public static void optisimed_Version(int[] arr) {
        List<Integer> ll = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            ll.add(arr[i]);
        }

        for (int i = 0; i < ll.size(); i++) {

            int curr = ll.get(i);
            st.push(curr);
            while (st.size() >= 2) {
                int a = st.pop();
                int b = st.pop();
                if (a == b) {
                    int sum = a + b;
                    st.push(sum);
                } else {
                    st.push(b);
                    st.push(a);
                    break;
                }
            }
        }

        List<Integer> ans = new ArrayList<>(st);
        System.out.println(ans);

    }
}
