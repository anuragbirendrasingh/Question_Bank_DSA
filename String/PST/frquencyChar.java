package String.PST;

public class frquencyChar {
    public static void main(String[] args) {
        String s = "aabcba";
        countFreq(s);
    }

    public static void countFreq(String s){

        int[] freq = new int[26];

        for(int i = 0 ;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a'] = freq[ch-'a'] + 1 ;
        }

        for(int i = 0 ; i<26 ;i++){
            if(freq[i]>0){
                char ch = (char)(i+'a');
                System.out.println(ch  + "->" + freq[i]);
            }
        }
    }
}
