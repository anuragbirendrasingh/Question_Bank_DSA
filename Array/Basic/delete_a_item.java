package Array.Basic;

import java.util.ArrayList;

public class delete_a_item {
    public static void main(String[] args) {
        ArrayList<Integer> ll = new ArrayList<>();
        ll.add(5);
        ll.add(10);
        ll.add(15);
        ll.add(20);
        int item = 15;

        for(int i=0 ; i<ll.size();i++){
            if(ll.contains(item)){
                ll.remove(Integer.valueOf(item));
            }
        }
        System.out.println(ll);
    }
}

// 🚫 नहीं, ArrayList में manually shifting करना possible नहीं है,
// क्योंकि उसके internal array तक तुम्हें direct access नहीं है।
// Java internally shifting करता है जब तुम remove() call करते हो।

// अगर तुम खुद shifting करना चाहो, तो तुम्हें primitive array बनाकर उसपर काम करना पड़ेगा
