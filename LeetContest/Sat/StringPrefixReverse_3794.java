package LeetContest.Sat;

public class StringPrefixReverse_3794 {
    public static void main(String[] args) {
        String s = "abcdef";
        int k = 2 ;
        String ans = "";

        for(int i = k - 1 ; i>=0 ; i--){
            ans = ans + s.charAt(i);
        }

        for(int i = k ; i<s.length();i++){
            ans = ans + s.charAt(i);
        }

        System.out.println(ans);

    }
}
