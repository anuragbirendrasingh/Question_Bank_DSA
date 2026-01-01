package String;

public class Leet680 {
    public static void main(String[] args) {
           int ans = makePallindrome("abca");
           System.out.println(ans);
    }
    public static int makePallindrome(String s){
        int i = 0 ; 
        int j = s.length() -1 ; 
        while(i<j){
             if(s.charAt(i)==s.charAt(j)){
                i++;
                j-- ;

             }else{
                if (isPallindrome(s,i+1,j)){
                    return i ;
                }
                if(isPallindrome(s,i,j-1)){
                    return j ;
                }
                return -1 ;
             }
        }
        return -1 ; 
    }

      private static boolean isPallindrome(String s , int i , int j){
             while(i<j){
                if(s.charAt(i++)!=s.charAt(j--)){
                    return false ;
                }
             }
             return true ;
       

    }
}

