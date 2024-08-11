
public class operation{

    

    public static int check1(int n,int i)
    {
        int bitmask=1<<i;
        if((n | bitmask) ==0)
        {
            return n;
        }
        else
        {
           return 1;
        }
    
    }

    public static int check2(int n,int i)
    {
        int bitmask=1<<i;

        return n | bitmask;
    }

    public static int check3(int n,int i)
    {
        int bitmask=~(1<<i);

        return n & bitmask;
    }

    public static int check5(int n,int i)
    {
        int bitmask=(~0)<<i;
        return n & bitmask;

        
    }

    



    
public static void main(String[] args) {


  //System.out.print(check1(10, 2));

  //System.out.print(check2(10, 2));

  //System.out.print(check3(10, 1));

  //System.out.print(check5(15, 2));

  

    
}


}