package Array ;
public class Leet875 {
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        int res = Max_Value(arr);
        System.out.println(res);
    }
    public static int Max_Value(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max ;
    }
}
