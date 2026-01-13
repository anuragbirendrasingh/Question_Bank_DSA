package Math;

import java.util.*;

public class LargestNumber_179 {
    public static void main(String[] args) {
        int[] arr = { 3, 30, 34, 5, 9 };
        String s = large(arr);
        System.out.println(s);
    }

    public static String large(int[] arr) {

        String[] s = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            s[i] = String.valueOf(arr[i]);
        }

        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));

        if (s[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length; i++) {
            sb.append(s[i]);
        }

        return sb.toString();

    }
}
