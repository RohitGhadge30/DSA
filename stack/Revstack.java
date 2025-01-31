import java.util.*;
public class Revstack {


    public static void  pushbottom(Stack <Integer> s,int data)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return;
        }

        int top=s.pop();
        pushbottom(s, data);
         s.push(top);
    }


    public static void  printstack( Stack <Integer> s) {
         while(!s.isEmpty())
         {
            System.out.print(s.pop());
         }
    }

    public static void revstack(Stack <Integer> s)
    {
        while(s.isEmpty())
        {
            return;

        }

        int top=s.pop();
        revstack(s);
        pushbottom(s, top);

    }



    public static void main(String[] args) {
        Stack <Integer> s=new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

          //3,2,1
        //printstack(s);

        revstack(s);
         //1,2,3
        printstack(s);

    }
    
}
