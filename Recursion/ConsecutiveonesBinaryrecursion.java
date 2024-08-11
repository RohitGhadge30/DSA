public class ConsecutiveonesBinaryrecursion {



    public static void bin(int n, int lp,String s)
    {

        if(n ==0)
        {
            System.out.print(s);
            return;
        }
        bin(n-1, 0,s+"0");

        if( lp == 0)
        {
            bin(n-1, 1,s + "1");
        }



    }

    public static void main(String[] args) {

     bin(3, 0," ");
        
    }
    
}
