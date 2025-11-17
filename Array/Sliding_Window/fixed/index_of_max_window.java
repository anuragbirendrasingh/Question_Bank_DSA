package Array.Sliding_Window.fixed;

public class index_of_max_window {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 5, 7, 9, 4, 3, 2 };
        int k = 3;
        int[] result = index(arr, k);
        System.out.println("Maxium sum " + result[0]);
        System.out.println("indexof max " + result[1]);
    }

    public static int[] index(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int ans = sum;
        int index = 0;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i - k];
            // ans = Math.max(ans, sum);

            if (sum > ans) {
                ans = sum;
                index = i - k + 1;

            }
        }

        return new int[] { ans, index };
    }
}
