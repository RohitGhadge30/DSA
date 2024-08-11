import java.util.*;
public class voo {

public static class Heap{
      ArrayList<Integer> a=new ArrayList<>();
        public void add(int data)
        {
            a.add(data);

            int x=a.size()-1;
            int par=(x-1)/2;

            while(a.get(x)<a.get(par))
            {
                int temp=a.get(x);
                a.set(x,a.get(par));
                a.set(par,temp);
            }

       }

       public int peek()
       {
        return a.get(0);
       }
    }

    public static void main(String[] args) {
        

      

        
    
    }
    
}
