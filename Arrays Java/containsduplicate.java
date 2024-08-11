

public class containsduplicate {

    public static boolean dupli(int a[])
    {
              for(int i=0;i<a.length;i++)
              {
                for(int j=i+1;j<a.length;j++)
                {
                    if(a[i]==a[j])
                    {
                        return true;
                    }
                }
              }
              return false;
    }

    public static void main(String[] args) {


        int a[]={1,2,3,4,5,6,7};

        System.out.print(dupli(a));
        
    }
    
}
