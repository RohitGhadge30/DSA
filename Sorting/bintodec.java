import java.util.Scanner;
public class bintodec{

  
   public static void bintodec(int binnum)
   {
    int mynum=binnum;
    int pow=0;
    int dec=0;
    while(binnum>0)
    {
      int ld=binnum%10;
      dec=dec+(ld*(int)Math.pow(2, pow));
      pow++;
      binnum=binnum/10;

    }

        System.out.print(mynum+":= "+dec);

   }

public static void dectobin(int n)
{
    int a=n;
    int pow =0;
    int binnum=0;

    while(n>0)
    {
      int  rem=n%2;
      binnum=binnum+(rem*(int)Math.pow(10, pow));
      pow++;
      n=n/2;
    }
    System.out.print(a+":= "+binnum);
    
}


   public static void main(String args[])
        {
           // bintodec(101);
           dectobin(5);
        }
}

     



    