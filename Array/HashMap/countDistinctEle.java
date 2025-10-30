package Array.HashMap;

import java.util.HashMap;

public class countDistinctEle {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,4};
        count(arr);
    }

    public static void count(int[] arr){
        HashMap<Integer,Integer> hs = new HashMap<>();
         int count = 0 ;
        for(int i=0 ; i<arr.length;i++){
            if(hs.containsKey(arr[i])){
                hs.put(arr[i],hs.get(arr[i])+1);
            }
            else{
                hs.put(arr[i],1);
                count++;
            }
        }
        System.out.println(count);
    }
}
