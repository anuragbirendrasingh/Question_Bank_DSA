package Math;

public class MinDigit3270 {

    public static void main(String[] args) {
        int num1 = 1, num2 = 10, num3 = 1000;
        int[] arr = { num1, num2, num3 };
        int ans = minNumber(arr);
        System.out.println(ans);
    }

    public static int minNumber(int[] nums) {

        int[] minDigit = { 9, 9, 9, 9 };

        for (int num : nums) {
            String s = String.valueOf(num);

            // add leading zeros manually
            while (s.length() < 4) {
                s = "0" + s;
            }

            for (int i = 0; i < 4; i++) {
                int d = s.charAt(i) - '0';
                minDigit[i] = Math.min(minDigit[i], d);
            }
        }

        int ans = 0;
        for (int d : minDigit) {
            ans = ans * 10 + d;
        }

        return ans;
    }
}
