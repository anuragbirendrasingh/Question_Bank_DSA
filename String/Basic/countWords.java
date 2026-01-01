package String.Basic;

public class countWords {
    public static void main(String[] args) {
        String s = "I Love Java";
        int ans = count(s);
        System.out.println(ans);
    }

    public static int count(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' '))

            {
                count++;
            }
        }

        return count;
    }
}
