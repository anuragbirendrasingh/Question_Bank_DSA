package Heap.Aditya_Verma;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Sort_Nearly_Sorted_K_Array {
    public static void main(String[] args) {
        int[] arr = {3,2,6,5,4,8};
        int k = 2 ;

        Sort(arr, k);
    }

    public static void Sort(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> ll = new ArrayList<>();
        

        //add in priority queue
        for(int i=0 ; i<=k ; i++){
            pq.add(arr[i]); 
            // System.out.println(pq);
        }

        //add one next element of the array & poll it
        for(int i=k+1 ; i<arr.length;i++){
            pq.add(arr[i]);
            // System.out.println(pq);
            ll.add( pq.poll());
        }
       
        //add the remaining element of the pq in list
        while(!pq.isEmpty()){
            ll.add(pq.poll());
        }

        System.out.println(ll);
    }
}

// TRy karo iska next version jisme tum iss array ko hi modify karo ratherthanusing list


//TC  = O(nlog(k));
//SC = O(k)