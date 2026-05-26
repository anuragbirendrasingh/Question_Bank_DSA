package Leet_05;
//this question is always for a positive inetegrs 
public class findMissingNum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6 };
        int n = 6;
        int ans = missingNum(n, arr);
        System.out.println(ans);
    }

    public static int missingNum(int n, int[] arr) {
        int sumOfN = n * (n + 1) / 2;
        int sumOfGivenarrayElement = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfGivenarrayElement += arr[i];
        }
        int num = sumOfN - sumOfGivenarrayElement ;
        return num;

    }
}
