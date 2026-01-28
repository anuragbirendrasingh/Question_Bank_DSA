package HashMap;

import java.util.HashMap;

public class countBadPair_2364 {
    public static void main(String[] args) {
        int[] arr = {4,1,3,3};
       long ans =  countBad(arr);
       System.out.println(ans);
    }

    public static long countBad(int[] arr){
        HashMap<Long,Long> map = new HashMap<>();
        long good = 0 ;
        for(int i=0 ; i<arr.length ;i++){
            long diff = i - arr[i];

            if(map.containsKey(diff)){
                good+= map.get(diff);
            }

            map.put(diff,map.getOrDefault(diff,0L) + 1);

            
        }

        long n = arr.length ;
        long total = n * (n-1) / 2 ;
        // System.out.println(total-good);
        return total - good ;

    }
}
