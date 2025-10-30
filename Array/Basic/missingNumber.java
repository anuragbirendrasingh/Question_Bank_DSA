package Array.Basic;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5 };
        int ans = missingNum(arr);
        System.out.println(ans);

    }

    public static int max(int[] arr) {
        int maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    public static int missingNum(int[] arr) {
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        int maximumDigit = max(arr);
        int sumExpectedOfArray = (maximumDigit * (maximumDigit + 1)) / 2;
        int diff = sumExpectedOfArray - arrSum;
        return diff;
    }
}
