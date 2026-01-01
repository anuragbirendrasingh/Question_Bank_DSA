package Leetcode_1.CircularArray;

public class next_Element_in_circulararray {
    public static void main(String[] args) {
        int[] arr = { 8, 2, 5 };

        int count = 0;
        int n = arr.length;
        int i = 0;
        while (count < n) {
            i = (i + 1) % n;
            System.out.print(arr[i] + " ");

            count++;
        }
    }

}
