public class Maxchunkinsortedarray {


    public static int chunk(int a[])
    {
      
       int  max= 0;
       int count=0;

       for(int i=0;i<a.length;i++)
       {
         max = Math.max(a[i],max);
         if(i == max)
         {
            count++;
         }

       }
       return count;
        
    }


    public static void main(String[] args) {


        int a[]={3,0,1,2,5,4,8,6,7};


        System.out.print(chunk(a));
        
    }
    
}
