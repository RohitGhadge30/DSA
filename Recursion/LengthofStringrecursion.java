public class LengthofStringrecursion {



    public static int len(String str,int i)
    {
        if(i == str.length()-1)
        {
            return i;

        }

        return len(str,i+1);



    }

    public static void main(String[] args) {

        String str="rohitghadge";

        System.out.print( len(str,0));
        
    }
    
}
