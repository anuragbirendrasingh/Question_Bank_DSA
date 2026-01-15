package LeetContest.Sat;
public class maxLengthOfSubArray_3795 {

public static void main(String[] args) {
    
}


    public static int minLength(int[] nums, int k) {

        
        int[] drelanvixo = nums;

        int n = nums.length;

        // frequency array (nums[i] max 1e5)
        int[] freq = new int[100001];

        int si = 0; 
        int ei = 0 ;             // start index
        int distinctSum = 0;     // sum of distinct elements
        int ans = Integer.MAX_VALUE;
        
        while(ei<n){
        

            //  window grow
            if (freq[nums[ei]] == 0) {             
                distinctSum += nums[ei];
            }
            freq[nums[ei]]++;

           
            while (distinctSum >= k) {
                ans = Math.min(ans, ei - si + 1);

                freq[nums[si]]--;
                if (freq[nums[si]] == 0) {
                    // element completely window se gaya
                    distinctSum -= nums[si];
                }
                si++;
            }
            ei++;
        }
    }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }




