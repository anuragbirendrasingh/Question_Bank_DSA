
import java.util.*;;

public class Demo_List {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ll.add(10);
        ll.add(1,20);
        ll.add(90);
        int x = ll.get(0);
        System.out.println( "value at index 0 " + x );

        // ll.set(3,99);
        // ll.set(4,100);   //👉 set(index, value) tabhi chalega jab us index par pehle se element ho.

        // System.out.println(ll);
        for(int num : ll){
            System.out.println("all element of ll " + num);
        }

       System.out.println(ll.isEmpty()); 
       System.out.println(ll.contains(10));


       System.out.println(ll.size());
    }
}
