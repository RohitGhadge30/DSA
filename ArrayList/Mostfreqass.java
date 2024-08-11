import java.util.*;
public class Mostfreqass{

    public static int voo(ArrayList <Integer> list,int key) {

        int table[] =new int[1001];


        for(int i=0;i<list.size();i++)
        {
                if(list.get(i) == key )
                {
                    table[list.get(i+1)]++;
                }
        }


        int target=0;
        int max=0;

        for(int i=0;i<table.length;i++)
        {
            if(table[i]>max)
            {
                max=table[i];
                target=i;
            }
        }






       

 return target;
        
    }




    public static void main(String[] args) {

        ArrayList <Integer> list=new ArrayList<>();

         list.add(1);
         list.add(100);
         list.add(200);
         list.add(1);
         list.add(100);


         System.out.print(voo(list,1));

 


       
        
        
    }
}