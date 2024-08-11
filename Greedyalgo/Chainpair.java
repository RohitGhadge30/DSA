import java.util.*;
public class Chainpair {


    public static void chain(int first[],int second[])
    {

        int chainlen=0;
        ArrayList <Integer> a=new  ArrayList ();

        int pair[][]=new int  [first.length][3];

        for(int i=0;i<pair.length;i++)
        {
            pair[i][0]=i;
            pair[i][1]=first[i];
            
            pair[i][2]=second[i];
        }

        Arrays.sort(pair,Comparator.comparingDouble(o ->o[2]));

        chainlen=1;
        a.add(pair[0][0]);
       
        int lastend=pair[0][2];

        
        for(int i=1;i<pair.length;i++)
        {
            if(pair[i][1] > lastend)
            {
              chainlen++;
              a.add(pair[i][0]);
              lastend=pair[i][2];
            }
        }

        System.out.println("Chain len is  :"+chainlen);
        System.out.println("pairs are   "+a);











    }


    public static void main(String[] args) {

        int first[]={5,39,5,27,50};
        int second[]={24,60,28,40,90};

        chain(first, second);


        
    }
    
}
