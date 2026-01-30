package HashMap ;

import java.util.HashMap;

public class countSubarray_560 {

    public static void main(String[] args) {
        int[] arr = {3,4,7,2,-3,1,4,2};
        int k = 7;
        int ans = count(arr, k) ;
        System.out.println(ans);
    }

 public static int count(int[] arr, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);   // zero prefix

    int sum = 0;
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
        sum += arr[i];

        if (map.containsKey(sum - k)) {
            count += map.get(sum - k);
        }

        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }

    return count;
}

}