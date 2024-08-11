   public class Tiling {



    public static int tile(int n)//2*n size
    {
                               // 3*n size ragega then n ==2 pe 1 way hei hogaa n ==2 way 1  3*1 tile
        if( n==0 || n==1)
        {
            return 1;

        }
        //vertically
       int fn=tile(n-1);

       
       //horizontally
       int fn2=tile(n-2);

       

       return fn+fn2;





    }


    public static void main(String[] args) {


        System.out.print(tile(4));
        
    }
    
}
