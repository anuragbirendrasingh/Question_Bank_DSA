package Sliding_Window.variable;

public class subStringCount_1358 {
    public static void main(String[] args) {
        String s = "abcabc";
        subStringCount(s);
    }

    public static void subStringCount(String s) {
        int si = 0;
        int ei = 0;
        int count = 0;
        int cA = 0;
        int cB = 0;
        int cC = 0;
        while (ei < s.length()) {

            if (s.charAt(ei) == 'a') {
                cA++;
            } else if (s.charAt(ei) == 'b') {
                cB++;
            } else if (s.charAt(ei) == 'c') {
                cC++;
            }

            while (cA > 0 && cB > 0 && cC > 0) {
                count += s.length() - ei;
                if (s.charAt(si) == 'a') {
                    cA--;
                } else if (s.charAt(si) == 'b') {
                    cB--;
                } else if (s.charAt(si) == 'c') {
                    cC--;
                }
                si++;
            }

            ei++;

        }
        System.out.println(count);
    }
}
