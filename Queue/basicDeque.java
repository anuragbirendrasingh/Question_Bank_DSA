package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class basicDeque {
    public static void main(String[] args) {
       Deque <Integer> dq =  new ArrayDeque<>();
        dq.addFirst(10);
        dq.addLast(20);
        System.out.println(dq);
        dq.addFirst(30);
        System.out.println(dq);
        dq.pop();  // aage se element delete hoga 
        System.out.println(dq);
        System.out.println(dq.poll());  // pichhe se element delte hoga 
        System.out.println(dq.offer(50));
        System.out.println(dq);
    }
}
