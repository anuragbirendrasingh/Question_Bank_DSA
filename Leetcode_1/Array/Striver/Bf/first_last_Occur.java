package Array.Striver.Bf;

public class first_last_Occur {

    public static void main(String[] args) {

        int[] arr = { 2, 4, 6, 8, 8, 8, 11, 13 };
        int x = 8;
        int[] ans = brute_force(arr, x);
        for (int num : ans) {
            System.out.print(num + " ");
        }

    }

    public static int[] brute_force(int[] arr, int x) {
        int last = -1;
        int first = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (first == -1)
                    first = i;
                last = i;
            }
        }
        return new int[] { first, last };

    }
}
