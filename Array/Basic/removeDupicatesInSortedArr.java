package Array.Basic;

public class removeDupicatesInSortedArr {
    public static void main(String[] args) {
        int[] arr = {10,20,30,30,40,50};
        int ans = findDuplicates(arr);
        System.out.println(ans);
    }

    public static int findDuplicates(int[] arr){
        int duplicate = 0 ; 
        for(int i=1;i<arr.length ;i++){
            if(arr[i-1]==arr[i]){
                duplicate = arr[i];
            }
        }
        return duplicate ;
    }

    public static void findAllDuplicates(int[] arr){
        int[] duplicates = new int[arr.length];
        for(int i=0 ; i<arr.length ;i++){
            if(arr[i-1]==arr[i]){
                duplicates[i] = arr[i];
            }
        }

        for(int val :duplicates){
            System.out.println(val + " ");
        }
    }

    



}
