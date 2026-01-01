package Array;

public class LeetCode268 {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 1 };
        int num = find_Missing_In_Range(arr);
        System.out.println(num);
    }

    public static int find_Missing_In_Range(int[] arr) {
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
