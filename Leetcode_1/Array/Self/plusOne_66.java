package Array.Self;

import java.util.ArrayList;

public class plusOne_66 {
    public static void main(String[] args) {
        int[] arr1 = {1 , 2 , 9};
        int[] arr2 = {1};
        int[] res = fondAns(arr1, arr2);
        for(int num : res){
            System.out.print(num + " ");
        }
        
    }

    public static int[] fondAns(int[] arr1,int[] arr2){
        ArrayList<Integer> ll = new ArrayList<>();
        int i = arr1.length-1 ;
        int j = arr2.length-1 ;
        int sum = 0 ;
        int carry = 0 ;

        while(i>=0 && j>=0){
            sum = carry + arr1[i] + arr2[j];
            // sum = sum % 10 ;
            ll.add(sum % 10);
            carry = sum/10 ;
            i--;
            j--;
        }

        while(i>=0){
            sum = carry+arr1[i];
            // sum = sum % 10 ;
            ll.add(sum%10);
            carry = sum/10;
            i--;
        }

        while(j>=0){
            sum = carry + arr2[j];
            sum = sum % 10 ;
            ll.add(sum);
            carry = sum/10;       
            j--;
         }

            if (carry > 0) {
            ll.add(carry);
        }

         int[] ans = new int[ll.size()];
         int y = 0 ;

         for(int x=ll.size()-1;x>=0;x--){
             ans[y] = ll.get(x);
             y++;
         }

         return ans ;

    
    }
}
