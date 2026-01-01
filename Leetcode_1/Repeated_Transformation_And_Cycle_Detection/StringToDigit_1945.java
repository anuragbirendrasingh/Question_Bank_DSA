// package Repeated_Transformation_And_Cycle_Detection;

public class StringToDigit_1945 {

    public static void main(String[] args) {
        String s = "abcd";
        int k = 2;

        int n = charSum(s);
        k--;

        while (k > 0) {
            n = sumOfDigit(n);
            k--;
        }

        System.out.println(n);
    }

    public static int charSum(String s) {
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - 'a' + 1;

            if (value >= 10) {
                sum += value / 10;
                sum += value % 10;
            } else {
                sum += value;
            }
        }
        return sum;
    }

    public static int sumOfDigit(int n) {
        int sum1 = 0;
        while (n > 0) {
            sum1 += n % 10;
            n /= 10;
        }
        return sum1;
    }
}
