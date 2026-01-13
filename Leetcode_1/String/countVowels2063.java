package String;

public class countVowels2063 {
    public static void main(String[] args) {
        // String s = "abc"; //
        String s = "baca";
        countVowels(s);
    }

    public static void countVowels(String s){
        int ei = 0 ;
        long ansCount = 0 ;
          while(ei<s.length()){
             char ch = s.charAt(ei);
             if(isVowel(ch)){
                ansCount +=(long) (s.length()-ei) * (ei+1);
             }
             ei++;
             
          }
          System.out.println(ansCount);
    }
    public static boolean isVowel(Character ch){
        if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' || ch=='u'){
            return true ;
        }
        return false ;
    }
    
}
