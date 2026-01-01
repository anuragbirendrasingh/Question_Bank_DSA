// package Repeated_Transformation_And_Cycle_Detection;

public class HappyNumber_202 {
    public static void main(String[] args) {
        int n = 2;
        boolean ans = HappyNumber(n);
        System.out.println(ans);
    }

    public static boolean HappyNumber(int n) {
        int slow = n;
        int fast = n;

        while (true) {
            slow = squareSum(slow);
            fast = squareSum((squareSum(fast)));

            if (fast == 1) {
                return true;
            }

            if (slow == fast) {
                return false;
            }
        }
    }

    public static int squareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int dig = n % 10;
            sum = sum + (dig * dig);
            n = n / 10;

        }

        return sum;
    }

}
