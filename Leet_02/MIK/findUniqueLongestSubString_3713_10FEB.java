package Leet_02.MIK;

public class findUniqueLongestSubString_3713_10FEB {

    public static void main(String[] args) {
        String str = "abbac";
        System.out.println(longestSubString(str));
    }

    public static int longestSubString(String str){

        int ans = 0;

        for(int i = 0; i < str.length(); i++){

            int[] freq = new int[26];
            int distinctElement = 0;
            int maxFreq = 0;

            for(int j = i; j < str.length(); j++){

                char ch = str.charAt(j);   
                int idx = ch - 'a';

                if(freq[idx] == 0){
                    distinctElement++;
                }
                freq[idx]++;
                

                maxFreq = Math.max(maxFreq, freq[idx]);

                int len = j - i + 1;

                // balanced check
                if(len == distinctElement * maxFreq){
                    ans = Math.max(ans, len);
                }
            }
        }

        return ans;
    }
}

