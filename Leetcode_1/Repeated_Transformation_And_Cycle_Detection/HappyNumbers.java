// package Repeated_Transformation_And_Cycle_Detection;
// iss code me assume kar ke chal rahe hin ki number repeat nhi kar raha hai avr 1 aayega hi
public class HappyNumbers {
    public static void main(String[] args) {
        int n = 19;
        // int sum = squareSum(n);
        // System.out.println(sum);

        while(n!=1){
           n = squareSum(n);   
           System.out.println(n);
        }

        System.out.println("Happy Number Hai");
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
