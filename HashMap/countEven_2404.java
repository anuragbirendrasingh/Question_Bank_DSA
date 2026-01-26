package HashMap;

import java.util.HashMap;

public class countEven_2404 {
    public static void main(String[] args) {
        // int[] arr = { 0, 1, 2, 2, 3 };
    }

    public static HashMap<Integer, Integer> find(int[] arr) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                if (hs.containsKey(arr[i])) {
                    hs.put(arr[i], hs.get((arr[i]) + 1));
                } else {
                    hs.put(arr[i], 1);
                }
            }
        }
        return hs;
    }

    public static void ans(HashMap<Integer, Integer> hs) {
        int maxKey = Integer.MIN_VALUE;
        int maxFrequecncy = 0;
        for (int key : hs.keySet()) {
            if (key > maxKey) {
                maxKey = key;
            }
            if (hs.get(key) > maxFrequecncy) {
                maxFrequecncy = key;
            }
        }

        //write the logic of return even count great maxFrequency then if hashet is blank then -1 if two similar count of even return smaller one 
        

    }

    public static boolean isEven(int item) {
        if (item % 2 == 0) {
            return true;
        }
        return false;
    }
}
