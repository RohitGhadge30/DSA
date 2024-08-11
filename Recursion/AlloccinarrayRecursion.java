public class AlloccinarrayRecursion {

    public static void alloc(int a[],int i,int key)
    {
      if(i == a.length)
      {
        return;
      }

       
      if( a[i]== key)
      {
        System.out.print(i+" ");
      }
      alloc(a,i+1,key);


      

    }

    public static void main(String args[])
    {

       
        int a[]={1,2,3,2,2,4,5,2};

        alloc(a,0,2);


        


        
        
    }
    
}
