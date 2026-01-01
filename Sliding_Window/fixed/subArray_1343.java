package Sliding_Window.fixed;

public class subArray_1343 {
    public static void main(String[] args) {
        // int[] arr = { 2, 2, 2, 2, 5, 5, 5, 8 };
        // int k = 3;
        // int thres = 4; // >= this avg is part of evry subarray
        int[] arr = { 11, 13, 17, 23, 29, 31, 7, 5, 2, 3 };
        int k = 3;
        int thres = 5;

        int ans = find(arr, k, thres);
        System.out.println(ans);
    }

    public static int find(int[] arr, int k, int thres) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum >= thres * k) {
            count++;
        }
        for (int i = k; i < arr.length; i++) {
            sum += arr[i]; // grow window
            sum -= arr[i - k]; // shrink window

            if (sum >= thres * k) {
                count++; // update ans
            }

        }
        return count;
    }
}
