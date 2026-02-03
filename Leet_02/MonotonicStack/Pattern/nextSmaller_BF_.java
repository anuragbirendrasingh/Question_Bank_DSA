package Leet_02.MonotonicStack.Pattern;

public class nextSmaller_BF_ {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 5, 3 };
        nextSmaller(arr);
    }

    public static void nextSmaller(int[] arr) {
        int[] res = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            res[i] = -1 ;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] < arr[i]) {
                    res[i] = arr[j];
                    break ;
                } 
            }
        }

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
