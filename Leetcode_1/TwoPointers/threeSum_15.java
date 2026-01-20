package TwoPointers;

import java.util.*;

public class threeSum_15 {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
       List<List<Integer>> ll =  print(arr);
       System.out.println(ll);
    }

    public static List<List<Integer>> print(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        // List<Integer> res= new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int k = i + 1;
            int j = arr.length - 1;

            while (k < j) {
                if (arr[i] + arr[j] + arr[k] == 0) {
                    List<Integer> res = new ArrayList<>();
                    res.add(arr[i]);
                    res.add(arr[j]);
                    res.add(arr[k]);
                    ans.add(res);
                    k++;
                    j--;

                    while (k < j && arr[k] == arr[k - 1])
                        k++;
                    while (k < j && arr[j] == arr[j + 1])
                        j--;
                } else if (arr[i] + arr[j] + arr[k] > 0) {
                    j--;
                } else {
                    k++;
                }
            }
        }
        // System.out.println(ans);
        return ans ;

    }
}
