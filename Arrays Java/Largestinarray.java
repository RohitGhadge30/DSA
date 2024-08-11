import java.util.*;

public class Largestinarray {


    public static int linear(int a[])
    {

       int largest = Integer.MIN_VALUE;
       int smallest =Integer.MAX_VALUE;

       for(int i=0;i<a.length;i++)
       {
        if(largest <a[i])
        {
            largest=a[i];
        }
        if (smallest >a[i])
        {
             smallest =a[i];
        }
    }
    System.out.println(smallest);
       

       return largest;

       

    }


   

    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7};


        System.out.print(linear(a));


        // for(int i=0;i<a.length;i++)
        // {
        //     System.out.print(a[i]+" ");
        // }


       
    }
    
}