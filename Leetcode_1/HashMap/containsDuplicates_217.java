package HashMap;

import java.util.HashMap;
// import java.util.Map;

public class containsDuplicates_217 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,6,7,8};
        Check(arr);
    }

    public static void Check(int[] arr){
        HashMap<Integer,Integer> hs = new HashMap<>();

        for(int i=0;i<arr.length;i++){

            if(hs.containsKey(arr[i])){
                  
            }
            hs.put(arr[i],0);
        }


        // for (Map.Entry<Integer, Integer> entry : hs.entrySet()) {
        // System.out.println(entry.getKey() + " -> " + entry.getValue());
}
    }

