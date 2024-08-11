public class Fibonnacirecursion {




    public static int fibo(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        int  fibn=fibo(n-1);
        int fibm=fibo(n-2);
        return fibn + fibm;

        
    }
    
    public static void main(String[] args) {
        System.out.print(fibo(5));
    }
    
}
