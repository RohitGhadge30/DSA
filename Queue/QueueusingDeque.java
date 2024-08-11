import java.util.*;

public class QueueusingDeque {


    public static class Queue{

          Deque <Integer> dq=new LinkedList<>();

          public void add(int data)
          {
            dq.addLast(data);

          }

          public int  remove()
          {
            return dq.removeFirst();
            
          }

          public int  peek()
          {
            return dq.getFirst();
            
          }


    }



    public static void main(String[] args) {

         Queue s=new Queue();
         s.add(1);
         s.add(2);
         s.add(3);


            
            System.out.print(s.remove());
            System.out.print(s.remove());
            System.out.print(s.remove());
            


        
    }
    
}
