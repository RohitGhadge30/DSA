import java.util.*;
public class DDeque {

    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();

        dq.addFirst(1);
        dq.addLast(2);
        dq.removeFirst();
        dq.removeLast();
        System.out.print(dq.getFirst());//get first element
        System.out.print(dq.getLast());//getlast element

        System.out.print(dq);
       
    }
    
}
