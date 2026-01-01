package String.Basic;

public class LongestWord {
    public static void main(String[] args) {
        String s = "I Love Java Programming";
         countLength(s);
    }

    public static void countLength(String s){
        int maxLen = 0 ;
        int currLen = 0 ;

        for(int i=0 ; i<s.length();i++){
            if(s.charAt(i)!=' '){
                currLen++;
            }

            if(s.charAt(i)!=' ' && (i==s.length()-1 || s.charAt(i+1)==' ')){
                maxLen = Math.max(currLen,maxLen);
                currLen = 0 ;
            }
        }
        System.out.println(maxLen);
    }
}
