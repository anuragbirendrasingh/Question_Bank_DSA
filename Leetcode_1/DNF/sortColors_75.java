package DNF;

public class sortColors_75 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,2,1,2,0,1,0,0,1,2,2,};
        dutch_National_flag(arr);
        for(int num :arr){
            System.out.print(num+" ");
        }
    }

    public static void dutch_National_flag(int[] arr){
        int i = 0 ;
        int k = 0 ;
        int j = arr.length-1 ;

        while(k<=j){

            if(arr[k]==0){
               swap(arr, k, i);
               k++;
               i++;
            }
            else if(arr[k]==1){
                k++;
            }
            else if(arr[k]==2){
                swap(arr, k, j);
                j--;
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[j];
        arr[j] = arr[i] ;
        arr[i] = temp;
    }
}
