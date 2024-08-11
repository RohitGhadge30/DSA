public class noofbitinnumber {



 public static void oddeven (int n)
 {
    int bitmask=1;
    if(( n&1) == 0)
    {
        System.out.print("even");
    }
    else{
        System.out.print("odd");

    }
 }
   

    public static boolean poweroftwo(int n)
    {
        return (n&(n-1))  ==0;
        
    }




    public static int noofbit(int n)
    {
   int count=0;

   while(n>0)
   {
    if((n&1) != 0)
    {
        count++;
    }
   n= n>>1;
   }
   return count;
    }

    public static int fastexpo(int a,int n)
    {
        int ans=1;

        while(n>0)
        {
            if((n&1)!= 0)
            {

            
            ans=ans*a;
            }
            a=a*a;
        n=n>>1;

        }
        
        return ans;
    }
    public static void main(String[] args) {

       // oddeven(3);  

       //System.out.print(poweroftwo(14));  power of 2 or not

     //  System.out.print(noofbit(16));      

       System.out.print(fastexpo(7,3));  //fastexpo

        
    }
    
}
