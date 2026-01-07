package Sliding_Window.variable;
import java.util.HashSet;
public class longestSubstring_3 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        LongestContionusSubstring(s);
    }
    public static void LongestContionusSubstring(String s ){
        int ei = 0 , si = 0 ;
        int max = Integer.MIN_VALUE ;       
        HashSet<Character> hs  = new HashSet<>();
        while(ei<s.length()){           
            while(hs.contains(s.charAt(ei))){
                hs.remove(s.charAt(si));
                si++;
            }
            hs.add(s.charAt(ei));          
            max =  Math.max(max, ei-si+1);
            ei++;
        }
        System.out.println(max);
    }
}
