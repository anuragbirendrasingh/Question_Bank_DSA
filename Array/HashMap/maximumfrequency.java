package Array.HashMap;

import java.util.HashMap;

public class maximumfrequency {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4};
        max(arr);
    }

    public static void max(int[] arr){
        HashMap<Integer,Integer> hs = new HashMap<>();

        for(int i = 0 ; i <arr.length ;i++){
            if(hs.containsKey(arr[i])){
                hs.put(arr[i],hs.get(arr[i])+1);
            }
            else{
                hs.put(arr[i],1);
            }
        }
        
        int maxKey = Integer.MIN_VALUE ;
        int maxFrequecncy=  0 ;
        for(int key : hs.keySet()){
              if(key>maxKey){
                maxKey = key ;
              }
              if(hs.get(key)>maxFrequecncy){
                maxFrequecncy = key ;
              }
        }
        System.out.println(maxKey);
        System.out.println("maximum ferequecy : " + maxFrequecncy);
    }
}
