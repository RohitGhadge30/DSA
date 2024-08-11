public class Keypadcomb {



    

        static char keypad[][]={
            {},
            {},
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
            {'j','k','l'},
            {'m','n','o'},
            {'p','q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'},
        };

            public static void comb(String givenstring)

    {

        int len =givenstring.length();

        if(len == 0)
        {
                System.out.print(" ");
                return;
        }

       recurfn(0, len, " ", givenstring);

    }
       

    public static void recurfn(int pos,int len,String ans,String givenstring)
    {

        if(pos == len )
        {
            System.out.println(ans+"");
            
        }

        else{
            char []letters=keypad[givenstring.charAt(pos)-'0'];
            for(int i=0;i<letters.length;i++)
            {
                 recurfn(pos+1, len, ans+letters[i], givenstring);
            }


        }






    }


    




    


    public static void main(String[] args) {


        comb("23");
        
    }
    
}
