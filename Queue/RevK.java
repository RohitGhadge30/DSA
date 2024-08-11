import java.util.*;
public class RevK{


    public static void revk(Queue <Integer> q,int k)
    {
        Stack <Integer> s=new Stack();
 //-->10,20,30,40,50,60,70,80,90,100;
        for(int i=0;i<k;i++)
        {
            s.push(q.remove());
        }

        //-->60,70,80,90,100; 

        while(!s.isEmpty())
        {
              q.add(s.pop());

        }

        //-->60,70,80,90,100,50,40,30,20,10;
        
        
        for(int i=k;i<q.size();i++)
        {
            int d=q.remove();
            q.add(d);

        }





    }




    public static void main(String[] args) {

        Queue <Integer> q=new LinkedList<Integer>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        

        revk(q, 5);
        while (!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }
        

      
    }
}
    

