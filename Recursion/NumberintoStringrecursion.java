public class NumberintoStringrecursion {


  public static void no(int n,String []digit)
  {
    if(n == 0)
    {
        return;
    }


    int ld=n%10;
     no( n/10,digit);

     System.out.print(digit[ld]+" ");

  }
    public static void main(String[] args) {


        //sint n=2019;
        String digits[]={"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        no(2019, digits);
        
    }
    
}
