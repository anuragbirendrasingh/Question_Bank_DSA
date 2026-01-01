package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leet349 {
    public static void main(String[] args) {
       int[] arr1 = {4,9,5};
       int[] arr2 = {9,4,9,8,4};
       int[] res = find_Intersection(arr1, arr2);
       for(int num :res){
        System.out.print(num  + " ");
       } 
    }
    public static int[] find_Intersection(int[] arr1,int[] arr2){
          
       Arrays.sort(arr1);  //4 5 9 
       Arrays.sort(arr2);  //4 4 8 9 9 

       List<Integer> ll=new ArrayList<>(); 
     
       int i = 0 , j = 0 ;

       while(i < arr1.length && j < arr2.length){
        if(arr1[i] == arr2[j]){
            //avoid duplicates
            if(ll.isEmpty() || ll.get(ll.size()-1) != arr1[i]){
                ll.add(arr1[i]);
            }
            i++;
            j++;
        }else if(arr1[i] < arr2[j]){
            i++ ;
        }else{
            j++;
        }
       }

       //list --> []int

       int[] result = new int[ll.size()] ;
       for(int k=0;k<result.length ;k++){
             result[k] = ll.get(k);
       }
       return result ;


    }
}