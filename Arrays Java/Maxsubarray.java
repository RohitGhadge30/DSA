package DSA;

public class Maxsubarray {
          

    public static int max(int nums[])
    {
        
        int max=nums[0];
        int cursum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            cursum +=nums[i];
           max=Math.max(cursum,max);

           if(cursum<0)
           {
               cursum=0;
           }

        }
        return max;
        
        
        




    }

    public static void main(String[] args) {

        int a[]={-2,1,-3,4,-1,2,1,-5,4};
       System.out.print( max(a));

        
        
    }
    
}
