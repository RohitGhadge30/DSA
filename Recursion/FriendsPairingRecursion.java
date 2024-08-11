
import java.util.*;
public class FriendsPairingRecursion {

    public static int pair(int n)
    {
        if (n==1 || n==2)
        {
            return n;
        }
         //singel
        //int f1=pair(n-1);
        //choice
        //int f2=pair(n-2);
        //pair
       // int pairways=n-1*f2;

        return pair(n-1)+n-1*pair(n-2);
    }


    

    public static void main(String[] args) {


        System.out.print(pair(3));

         


           


    }
}




    

