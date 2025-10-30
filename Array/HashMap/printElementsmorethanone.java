package Array.HashMap;

import java.util.HashMap;

public class printElementsmorethanone {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,2,2,3,3,3,4,5,6};
        count(arr);
    }

    public static void count(int[] arr){
        HashMap<Integer,Integer> hs = new HashMap<>();

        for(int i=0 ; i<arr.length ;i++){
            if(hs.containsKey(arr[i])){
                hs.put(arr[i],hs.get(arr[i]) + 1);
            }
            else{
                hs.put(arr[i], 1);
            }

            // if(hs.get(arr[i])>1){
            //     System.out.println();
            // }

        }

            for(int key : hs.keySet()){
                  if(hs.get(key) > 1){
                    System.out.println(key + " - > " +  hs.get(key));
                  }
            }
        }
        
    
    }

