package Sliding_Window.fixed;

public class Maximum_Average_Subarray_I_643 {

    public static void main(String[] args) {
        int[] arr = { 1, 12, -5, -6, 50, 3 };
        int k = 4;
        double ans = maxAvg(arr, k);
        System.out.println(ans);
    }

    public static double maxAvg(int[] arr, int k) {
        double maxAverage = Double.NEGATIVE_INFINITY;
        int sum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / k;

        if (avg > maxAverage) {
            maxAverage = avg;
        }

        // sliding window
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];

            avg = (double) sum / k;

            maxAverage = Math.max(maxAverage, avg);
        }

        // System.out.println(maxAverage);
        return maxAverage;
    }
}
