package Array.PreFixSum;

public class basic1_que {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        int[] prefix =  new int[arr.length];
        int j = 0;
        int sum = 0;
        for(int i=0 ; i<arr.length ;i++){
            sum = sum + arr[i];
            prefix[j]=sum ;
            j++;
        }

        for(int num : prefix){
            System.out.print(num + " ");
        }
    }
}
