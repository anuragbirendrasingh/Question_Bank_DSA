package Array.Self;
public class shuffleIndex_1470 {

    public static void main(String[] args) {
        int[] arr = {2,6,10,20,50,100};
        int n = 3 ;

        shuffleIndex(arr, n);
    }

    public static void shuffleIndex(int[] arr,int n){
        int[] ans = new int[arr.length];

        int k = 0 ;
        int i = 0 ;
        int count = 0;       
        while(n > count){
            ans[k]=arr[i];
            i++;
            count++;
            k+=2;
        }

        int j = n ;
        k=1;
        int count1 = 0 ;
        while(n > count1){
          ans[k] = arr[j];
          count1++;
          j++;
          k+=2;
        }

        for(int num :ans){
            System.out.print(num + " ");
        }
    }
}