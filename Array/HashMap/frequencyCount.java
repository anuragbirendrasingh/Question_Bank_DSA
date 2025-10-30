package Array.HashMap;

import java.util.HashMap;

public class frequencyCount {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,2};
        count(arr);
    }

    public static void count(int[] arr){
        HashMap<Integer,Integer> hs = new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(hs.containsKey(arr[i])){
                // hs.put(arr[i], hs.get(arr[i] + 1 );
                hs.put(arr[i],hs.get(arr[i])+1);
            }
            else{
                hs.put(arr[i],1);
            }
        }

        // hasmap is not index based
        for(int key :hs.keySet()){
            System.out.println(key + "-> " + hs.get(key));
        }
 
}
}
