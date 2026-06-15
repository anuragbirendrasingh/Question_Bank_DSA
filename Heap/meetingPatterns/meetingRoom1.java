package Heap.meetingPatterns;

// import java.lang.reflect.Array;
import java.util.*;

public class meetingRoom1 {
    public static void main(String[] args) {
        // int[][] intervals = {
        // { 0, 30 },
        // { 5, 10 },
        // { 15, 20 }
        // };

        int[][] intervals = {
                { 1, 3 },
                { 3, 5 },
                { 5, 8 },
                { 4, 10 }
        };

        boolean ans = canAttendMeeting(intervals);
        System.out.println(ans);
    }

    public static boolean canAttendMeeting(int[][] intervals) {
        // sort by start time
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        // now compare with the prev[0] and curr[1] elemnt
        for (int i = 1; i < intervals.length; i++) {
            int prev = intervals[i - 1][1];
            int curr = intervals[i][0];

            if (curr < prev) {
                return false;
            }
        }
        return true;
    }
}
