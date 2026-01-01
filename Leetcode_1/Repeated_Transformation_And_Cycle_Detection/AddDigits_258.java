

public class AddDigits_258 {

    public static void main(String[] args) {
        int n = 19;
        int ans = singleNumber(n);
        System.out.println(ans);
    }

    public static int singleNumber(int n) {

        while (n >= 10) {
            n = add(n);

        }
        return n;
    }

    public static int add(int n) {
        int sum = 0;

        while (n > 0) {
            int dig = n % 10;
            sum = sum + dig;
            n = n / 10;
        }

        return sum;
    }
}