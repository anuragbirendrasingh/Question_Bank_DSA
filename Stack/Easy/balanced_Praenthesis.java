package Stack.Easy;

import java.util.Stack;

public class balanced_Praenthesis {
    public static void main(String[] args) {
        String str = "({[]})";

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            Character ch = str.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            }

            else {
                if (st.isEmpty()) {
                    System.out.println("Not Balanced Bracket bcz noopening bracket come till now ");
                    return;
                }

                Character top = st.peek();
                if ((ch == ')' && top == '(') ||
                        (ch == ']' && top == '[') ||
                        (ch == '}' && top == '{')) {
                    st.pop(); // pop only if matched
                } else {
                    System.out.println("Missmatch found");
                    return;
                }

            }
        }

        if (st.isEmpty()) {
            System.out.println(" Balanced");
        } else {
            System.out.println(" NOt Balanced");
        }

    }
}
