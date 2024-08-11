public class Factorialrecursion {


    public static int fact(int n)
    {
                     if(n==0)
                     {
                        return 1;
                     }
                     int fn1=fact(n-1);
                     //int fn=n*fact(n-1);
                     return n*fact(n-1);

    }

    public static void main(String[] args) {

    System.out.print(fact(5));
        
    }
    
}
