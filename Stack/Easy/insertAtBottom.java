package Stack.Easy;

import java.util.Stack;

public class insertAtBottom {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int item = 50;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            st.push(arr[i]);
        }

        add_at_bottom(st, item);
        System.out.println(st);
    }

    public static void add_at_bottom(Stack<Integer> st, int item) {
        if (st.isEmpty()) {
            st.push(item);
            return;
        }
        int top = st.pop();
        add_at_bottom(st, item);
        st.push(top);

        // System.out.println(st);

    }

}
