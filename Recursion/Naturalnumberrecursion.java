public class Naturalnumberrecursion {


    public static int nat(int n)
    {
        if(n ==1)
        {
            return 1;
        }
        int snm=nat(n-1);
      //  int sn=n+nat(n-1);
        return n+nat(n-1) ;
        
    }

    public static void main(String[] args) {

        System.out.print(nat(5));
        
    }
    
}
