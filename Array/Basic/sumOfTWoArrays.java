package Array.Basic;

public class sumOfTWoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 7, 2, 8, 9, 6 };
        int[] arr2 = { 10, 12, 2 };
        add(arr1, arr2);
    }

    public static void add(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int len = Math.max(n, m);
        int[] ans = new int[len];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            ans[k] = arr1[i] + arr2[j];
            i++;
            j++;
            k++;
        }

        while (i < n) {
            ans[k] = arr1[i];
            i++;
            k++;
        }

        while (j < m) {
            ans[k] = arr2[j];
            j++;
            k++;
        }

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
