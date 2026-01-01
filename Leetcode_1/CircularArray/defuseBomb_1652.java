package Leetcode_1.CircularArray;

public class defuseBomb_1652 {

    public static void main(String[] args) {
        int[] arr = {2, 4, 9, 3};
        int k = -2;

        int[] ans = ReplaceWithSUm(arr, k);

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] ReplaceWithSUm(int[] arr, int k) {
        int[] arr1 = new int[arr.length];
        int n = arr.length;

        if (k > 0) {
            int j = 0;
            while (j < n) {
                arr1[j] = sumOFElemenstOfArray(arr, j, k);
                j++;
            }
        } 
        else if (k == 0) {
            int j = 0;
            while (j < n) {
                arr1[j] = 0;
                j++;
            }
        } 
        else { // k < 0
            int j = 0;
            while (j < n) {
                arr1[j] = somofEle(arr, j, k);
                j++;
            }
        }
        return arr1;
    }

    // k > 0 : next k elements ka sum
    public static int sumOFElemenstOfArray(int[] arr, int idx, int k) {
        int n = arr.length;
        int i = idx;
        int sum = 0;
        int count = 0;

        while (count < k) {
            i = (i + 1) % n;
            sum += arr[i];
            count++;
        }
        return sum;
    }

    // k < 0 : previous |k| elements ka sum
    public static int somofEle(int[] arr, int idx, int k) {
        int n = arr.length;
        int i = idx;
        int sum = 0;
        int count = 0;

        while (count < -k) {
            i = (i - 1 + n) % n;
            sum += arr[i];
            count++;
        }
        return sum;
    }
}

