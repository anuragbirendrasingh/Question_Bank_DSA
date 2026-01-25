package TwoPointers;

import java.util.*;

public class kDiffPairInArray_532 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 1 , 1};
        int k = 0;
        // int[] arr = {1,2,3,4,5};
        // int k = 1 ;
        int ans = pair(arr, k);
        System.out.println(ans);
    }

    public static int pair(int[] arr, int k) {
        if (k == 0) {
            return KisZero(arr, k);
        }
        int i = 0;
        int j = 1;
        int count = 0;
        int n = arr.length;
        Arrays.sort(arr);
        while (i < n && j < n) {
            int diff = arr[j] - arr[i];
            if (diff < k) {
                j++;
            } else if (diff > k) {
                i++;
            } else if (diff == k) {
                // i++;
                // j++;
                count++;
                int a = arr[i];
                int b = arr[j];
                while (i < n && arr[i] == a)
                    i++; // skip duplicate of i
                while (j < n && arr[j] == b)
                    j++; // -----------------j

            }
        }
        // System.out.println(count);
        return count;
    }

    public static int KisZero(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            // map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int count = 0;
        // only freq>1 will contribute on pair making
        for (int freq : map.values()) {
            if (freq > 1) {
                // count += freq * (freq - 1) / 2; // this will give all the pair of the unique indixes but avoid dupcates
                count++;
            }
        }
        return count;

    }
}
