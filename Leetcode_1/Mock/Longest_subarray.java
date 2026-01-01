package Mock;

public class Longest_subarray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        int k = 100;
        int ans = Maximum_Length_of_subArr(arr, k);
        System.out.println(ans);
    }

    public static int Maximum_Length_of_subArr(int[] arr, int k) {
        int maxLen = 0;
        int n = arr.length;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < n ; j++) {
                sum += arr[j];
                if (sum == k) {
                   maxLen =  Math.max(maxLen, j - i + 1);
                }
            }
        }
        // System.out.println(maxLen);
        return maxLen ;
    }
}
