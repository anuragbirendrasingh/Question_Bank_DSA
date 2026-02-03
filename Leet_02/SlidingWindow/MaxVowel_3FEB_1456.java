package Leet_02.SlidingWindow;

public class MaxVowel_3FEB_1456 {
    public static void main(String[] args) {
        String str = "abciiidef";
        int k = 3 ;
        countVowelsInSubstrings(str, k);
    }

    public static void countVowelsInSubstrings(String s ,int k){
         int ei = 0 ;
         int si = 0 ;
         int count = 0 ;
         int max = 0 ;
         while(ei < s.length()){
            // grow window
            char ch = s.charAt(ei);
            if(isVowel(ch)){
                count++;
            }

            //shrink window
            if((ei-si+1)>k){
                char ch1 = s.charAt(si);
                if(isVowel(ch1)){
                    count--;
                }
                si++;
            }
            //update ans
            if((ei-si+1)==k){
                max = Math.max(max,count);
            }
            ei++;
         }
        System.out.println(max);
    }

    // public static boolean isVowel(char ch){
    //     if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' ){
    //         return false ;
    //     }
    //     return true ;
    // }

    public static boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}
