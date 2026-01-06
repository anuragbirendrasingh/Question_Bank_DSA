package Sliding_Window.variable;

public class flipStringToMakelongest {
    public static void main(String[] args) {
        String s = "ababb";
        int k = 1;

        int ans1 = findMaxSubstringAfterFlip(s, k, 'a');
        int ans2 = findMaxSubstringAfterFlip(s, k, 'b');

        int ans = Math.max(ans1, ans2);
        System.out.println(ans);
    }

    public static int findMaxSubstringAfterFlip(String s, int k, char ch) {
        int si = 0, ei = 0;
        int flip = 0;
        int max = 0;

        while (ei < s.length()) {

            // grow
            if (s.charAt(ei) == ch) {
                flip++;
            }

            // shrink
            while (flip > k && si <= ei) {
                if (s.charAt(si) == ch) {
                    flip--;
                }
                si++;
            }

            // answer
            max = Math.max(max, ei - si + 1);
            ei++;
        }
        return max;
    }
}

