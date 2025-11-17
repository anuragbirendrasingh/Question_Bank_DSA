package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class max_of_each_window {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 5, 1, 3 };
        int k = 3;
        max_of_window(arr, k);
    }

    public static void max_of_window(int[] arr, int k) {
        Deque<Integer> dq = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);
        }

        System.out.println(arr[dq.peekFirst()]);

        // 2. Process remaining windows
        for (int i = k; i < arr.length; i++) {

            // Remove elements that are out of the window (i-k)
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from back
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);

            // Current window max = front of deque
            System.out.print(arr[dq.peekFirst()] + " ");
        }
    }
}
