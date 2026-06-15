package Heap.meetingPatterns;

import java.util.*;

public class MergeIntervalsLeet156 {
    public static void main(String[] args) {
         
    }

    public static List<int[]> merge(int[][] arr) {
        // if not sorted then sort on the basisof the start
        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        List<int[]> ll = new ArrayList<>();

        // assume first interval is the merged interval
        int start = arr[0][0];
        int end = arr[0][1];

        // traverse on remaining intervals --so i=1 ;
        for (int i = 1; i < arr.length; i++) {

            int currentStart = arr[i][0];
            int currentEnd = arr[i][1];

            if (currentStart <= end) {
                end = Math.max(end, currentEnd);
            }

            else {
                ll.add(new int[] { start, end });
                start = currentStart;
                end = currentEnd;
            }

        }
        ll.add(new int[] { start, end });

        return ll ;
    }

}
