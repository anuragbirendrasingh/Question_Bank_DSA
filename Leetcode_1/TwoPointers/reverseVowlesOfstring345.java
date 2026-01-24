package TwoPointers;

public class reverseVowlesOfstring345 {
    public static void main(String[] args) {
        String s = "defAbcEgh";
        String ans = reverseVowel(s);
        System.out.println(ans);

    }

    public static String reverseVowel(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // move left until it points to a vowel
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            // move right until it points to a vowel
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // now both are vowels → swap
            if (left < right) {
                swap(arr, left, right);
                left++;
                right--;
            }
        }

        return new String(arr); //converted array to string 
    }

    public static void swap(char[] ch, int idx1, int idx2) {
        char temp = ch[idx1];
        ch[idx1] = ch[idx2];
        ch[idx2] = temp;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'A' ||
                ch == 'e' || ch == 'E' ||
                ch == 'i' || ch == 'I' ||
                ch == 'o' || ch == 'O' ||
                ch == 'u' || ch == 'U';
    }

}
