package Leetcode_1.CircularArray;

public class traversal_on_CRArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        int k = 3;

        int n = arr.length;
        k = k % n;

        int count = 0 ;
        int i = k ;
        while(count < n){
            System.out.print(arr[i] + " ");
            i = (i+1) % n ; //circular move
            count++;
        }
    }
}


//40 50 10 20 30 