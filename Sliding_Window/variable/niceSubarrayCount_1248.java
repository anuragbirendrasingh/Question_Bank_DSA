package Sliding_Window.variable;

public class niceSubarrayCount_1248 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 1, 1 };
        int k = 3;
        int atmost = count(arr, k);
        int atmost2 = count(arr, k - 1);
        int ans = atmost - atmost2;
        System.out.println(ans);
    }

    public static int count(int[] arr, int k) {
        int si = 0;
        int ei = 0;
        int count = 0;
        int ans = 0;
        while (ei < arr.length) {
            // grow
            if (isOdd(arr[ei])) {
                count++;
            }
            // shrink
            while (count > k) {
                if (isOdd(arr[si])) {
                    count--;
                }
                si++;
            }
            // update ans
            ans = ans + (ei - si + 1);
            ei++;
        }
        // System.out.println(ans);
        return ans;
    }

    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        }
        return true;
    }

}
