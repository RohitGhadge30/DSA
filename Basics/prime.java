public class prime {


    public static void isprime(int n)
    {
        if( n== 2)
        {
            System.out.print("prime no");
        }
        else{
            boolean isprime=true;
            for(int i=2;i<=n-1;i++){    //Math.sqrt(n)
            if(n%i  == 0)
            {
            isprime=false;
            }
        }

            if(isprime == true)
            {
                System.out.print("prime hai");
            }
            else{
                System.out.print("prime nhi hai");
            }
        }
            

            
        }

    

    public static void main(String[] args) {

        isprime(6);
        
    }
    
}
