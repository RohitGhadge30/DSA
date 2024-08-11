import java.util.*;
public class Binary {



    public static void bin(int n)
    {

        Queue <String> s=new LinkedList<>();
        s.add("1");
        while(n>0)
        {
           String s1=s.peek();
           s.remove();
           System.out.print(s1+" ");

           String s2=s1;
           s.add(s1+"0");
           s.add(s2+"1");
           n--;
        }
        
    }

    public static void main(String[] args) {

        int n=5;
        bin(n); 

    }
}
