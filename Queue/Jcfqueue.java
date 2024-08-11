import java.util.*;
public class Jcfqueue {


    public static void main(String[] args) {

        //Queue <Integer> q=new LinkedList<>();  // classLL
        Queue <Integer> q=new ArrayDeque<>();  //class Arraydeq
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty())
        {
            System.out.print(q.remove());
        }
        
        
    }
    
}
