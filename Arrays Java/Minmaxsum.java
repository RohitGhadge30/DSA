package DSA;
import java.util.*;

public class Minmaxsum {
//q1 DSA sheet

    public static void main(String[] args) {
        int a[]={-2, 1, -4, 5, 3};

       //minmax(a);
       //System.out.print(ma(a, 0));
       
        


    } 

    public static int ma(int a[] ,int N) {
       
         N=a.length;
            Arrays.sort(a);
            int min=a[0];
            int max=a[N-1];
            
               
            return min+max;

        //System.out.print(minmax(a));

    }
    



            

        
  

     public static void minmax(int a[]){

        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

     for(int i=0;i<a.length;i++)
     {
        if(min>a[i])
        {
             min=a[i];
             

        }
        
        if(max<a[i])
        {
          max=a[i];
        }

        

    }
    int sum = min + max;

    System.out.println("Minimum: " + min);
    System.out.println("Maximum: " + max);
    System.out.println("Sum of Min and Max: " + sum);
} 
}
    


