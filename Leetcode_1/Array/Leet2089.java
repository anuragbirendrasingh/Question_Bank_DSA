package Array;

import java.util.*;
public class Leet2089 {
    public static void main(String[] args) {
          int[] arr = {1,2,5,2,3};
          int[] ans = sort_arr_and_find_index(arr, 2);
          System.out.println(Arrays.toString(ans));
    }
    public static int[] sort_arr_and_find_index(int[] arr,int item){
             Arrays.sort(arr);
            List<Integer> ll = new ArrayList<>();

            //list me bhar rahe hin taki ek se jayda index ko rakh panye
            for(int i=0;i<arr.length;i++){
                if(arr[i]==item){
                    ll.add (i);
                }
            }

            //list inetger ko ab array me convert kar denge
            int[] result = new int[ll.size()];
            for(int i=0;i<ll.size();i++){
                result[i] = ll.get(i);
            }
            return result ;

    }
}
