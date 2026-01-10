package Array.Self;

import java.util.Arrays;

public class countSubsequence_2389 {

    public static void main(String[] args) {
        int[] arr1 = {4, 5, 2, 1};
        int[] arr2 = {3, 10, 21};

        int[] ans = findSubsequnceOfMaxSize(arr1, arr2);

        System.out.println(Arrays.toString(ans));
    }

    public static int[] findSubsequnceOfMaxSize(int[] arr1, int[] arr2) {

        // step 1: sort nums
        Arrays.sort(arr1);

        int[] answer = new int[arr2.length];

        // step 2: har query ke liye
        for (int q = 0; q < arr2.length; q++) {
            int k = arr2[q];
            int sum = 0;
            int count = 0;

            // step 3: smallest elements add karo
            for (int i = 0; i < arr1.length; i++) {
                sum += arr1[i];
                if (sum <= k) {
                    count++;
                } else {
                    break;
                }
            }

            answer[q] = count;
        }

        return answer;
    }
}

