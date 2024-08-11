

import java.util.Arrays;

public class Chocklatedistribution {
    public static void main(String[] args) {
       
          int a[]={7, 3, 2, 4, 9, 12, 56};
          int n=a.length;
          int m=3;

          System.out.print(chock(a, m, n));
    }

    public static int  chock(int a[],int m,int n){

      Arrays.sort(a);
         int min=Integer.MAX_VALUE; 
      for(int i=0;i+m-1<n;i++)
      {
        int diff=a[i+m-1]-a[i];
        if(diff<min)
        {
          min=diff;
        }

      }
      return min;
      

       

         
    }
    
}
