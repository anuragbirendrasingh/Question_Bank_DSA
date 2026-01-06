package Misc;

public class seprator_1556 {
    public static void main(String[] args) {
        int n = 12345;
        String ans = stringSepertor(n);
        System.out.println(ans);

    }

    public static String stringSepertor(int n) {

        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (n > 0) {
            sb.append(n % 10);
            n = n / 10;
            count++;

            if (count == 3 && n > 0) {
                sb.append('.');
                count = 0;
            }
        }
        return sb.reverse().toString();

    }
}