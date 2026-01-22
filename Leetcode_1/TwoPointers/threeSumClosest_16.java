package TwoPointers;
import java.util.*;
public class threeSumClosest_16 {
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int k = 1 ;
        closestSum(arr, k);
    }

public static void closestSum(int[] arr, int k) {
    Arrays.sort(arr);
    int n = arr.length;

    int closestSum = arr[0] + arr[1] + arr[2];
    int minDiff = Math.abs(closestSum - k);

    for (int i = 0; i < n - 2; i++) {

        int left = i + 1;
        int right = n - 1;

        while (left < right) {
            int sum = arr[i] + arr[left] + arr[right];
            int diff = Math.abs(sum - k);

            if (diff < minDiff) {
                minDiff = diff;
                closestSum = sum;
            }

            if (sum < k) {
                left++;
            } else if (sum > k) {
                right--;
            } else {
                // exact target mil gaya
                System.out.println("Closest Sum = " + sum);
                return;
            }
        }
    }

    System.out.println("Closest Sum = " + closestSum);
}

}
