package Heap;
// NOT recomended IN interview

import java.util.Collections;
import java.util.PriorityQueue;

public class secondLargestInArray {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
       FindSecondMax(arr);
    }

    public static void FindSecondMax(int[] arr){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0 ; i<arr.length;i++){
            pq.add(arr[i]);
        }
        
        System.out.println("The Queue " + pq);

        int largest  = pq.poll();
        int secLargest = pq.poll();

        System.out.println("The queue left after poll  " + pq);
        System.out.println("The largest number " + largest);
        System.out.println("The second Largest Number " + secLargest);
    }
}
