package Leet_02.MIK;
import java.util.*;

public class FindMinRemoval_3634_BF_8FEB {

    public static void main(String[] args) {
        int[] arr = {2,1,5};
        int k = 2;
        find_Count(arr, k);
    }

    public static void find_Count(int[] arr, int k){
        Arrays.sort(arr);

        int n = arr.length;
        int si = 0;
        int ei = 0;
        int maxWindow = 1;

        while (ei < n) {

            // window invalid → shrink from left
            while ((long)arr[ei] > (long)arr[si] * k) {
                si++;
            }

            // window valid → update answer
            maxWindow = Math.max(maxWindow, ei - si + 1);

            // expand window
            ei++;
        }

        System.out.println(n - maxWindow);
    }
}

