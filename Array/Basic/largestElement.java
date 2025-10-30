package Array.Basic;

public class largestElement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 60, 80 };
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
