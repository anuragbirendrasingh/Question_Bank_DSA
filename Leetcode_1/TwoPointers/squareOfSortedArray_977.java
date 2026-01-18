package TwoPointers;

import java.util.Arrays;

public class squareOfSortedArray_977 {
    public static void main(String[] args) {
        int[] arr = {-7,-3,2,3,11};
    
        System.out.println(Arrays.toString(square(arr)));
    }

    public static int[] square(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int i = 0;
        int j = n - 1;
        int k = n - 1;

        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k] = arr[i] * arr[i];
                i++;
            } else {
                ans[k] = arr[j] * arr[j];
                j--;
            }
            k--;
        }
        return ans;
    }
}
