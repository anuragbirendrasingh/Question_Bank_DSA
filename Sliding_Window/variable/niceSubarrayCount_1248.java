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
        int si = 0 ,ei = 0,ans = 0,count = 0 ;
        while (ei < arr.length) {
            if (isOdd(arr[ei])) {  //grow
                count++;
            }
            while (count > k) {  // shrink
                if (isOdd(arr[si])) {
                    count--;
                }
                si++;
            }
            ans = ans + (ei - si + 1);// update ans/
            ei++;
        }       // System.out.println(ans);
        return ans;
    }
    public static boolean isOdd(int num) {
        if (num % 2 == 0) {
            return false;
        }
        return true;
    }
}
