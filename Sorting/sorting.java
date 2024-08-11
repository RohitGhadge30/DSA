import java.util.Arrays;
import java.util.*;
public class sorting {


    public static void bubblesort(int n[])
    {
           for(int i=0;i<n.length-1;i++)
           {
               boolean swap=false;
               for(int j=0;j<n.length-1-i;j++)
               {
                    if(n[j]>n[j+1])
                    {

                     int temp=n[j];
                     n[j]=n[j+1];
                     n[j+1]=temp;
                    swap = true;

                     
                    }
                    
                   
               
                 
           }
           if(swap == false)
           {
               break;
           }
            
           }
           
           
           

    }


    public static void selectionsort(int n[]){




        for(int i=0;i<n.length-1;i++)

        {
            int min=i;
            for(int j=i+1;j<n.length;j++)
            {
                 if(n[min]>n[j])
                 {
                    min=j;
                 }
            }

            int temp=n[min];
            n[min]=n[i];
            n[i]=temp;
        }
    }

    public static void  insertionsort(int nums[]){

        for(int i=1;i<nums.length;i++)
        {
           int curr=nums[i];
           int prev=i-1;

           while(prev >=0 && nums[prev]<curr)
           {
             nums[prev+1]=nums[prev];
             prev--;
           }

           nums[prev+1]=curr;
        }

       }


       public static void counting(int n[]) {
        int largest =Integer.MIN_VALUE;
           for(int i=0;i<n.length;i++)
           {
            largest=Math.max(largest,n[i]);
           }
           int count []=new int[largest+1];

           for(int i=0;i<n.length;i++)
           {
               count[n[i]]++;  
           }

           int j=0;
           for(int i=0;i<count.length;i++)
           {
                 while(count[i]>0)
                 {
                    n[j]=i;
                    j++;
                    count[i]--;
                 }
           }

        
       }
 


    

    public static void main(String[] args) {
        int n[]={4,3,2,1};

       
       //Arrays.sort(arr,Collections.reverseOrder());

       
       
      

        bubblesort(n);
       //selectionsort(n);
       

        for(int i=0;i<n.length;i++)
        {
           
            System.out.print(n[i]+" ");
           
        }
    }
    
}
