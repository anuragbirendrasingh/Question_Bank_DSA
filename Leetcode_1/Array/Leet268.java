package Array;

public class Leet268 {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
       int num =  find_Missing_In_Range(arr);
       System.out.println(num);
    }
    public static int FindMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min ;
    }
    public static int find_Missing_In_Range(int[] arr){
          int min = findMin(arr);
          int max= FindMax(arr);
          for(int i = min ; i<=max ; i++){
               boolean found = false ;
               for(int j=0;j<arr.length ;j++){
                if(arr[j]==i){
                    found = true ;
                    break ;
                }
               }
               if(!found){
                return i ;
               }

          }
          return max+1;
    }
}
