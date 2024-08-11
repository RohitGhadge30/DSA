public class Palidrome {


    public static boolean pali(String str)
    {
        for(int i=0;i<str.length()/2;i++)
        {
           if(str.charAt(i) == str.charAt(str.length()-1-i))
           {
                    return true;
           }
        }
        return false;
    }
    public static void main(String[] args) {
        
        String str="racecar";


        System.out.print(pali(str));

        //System.out.print(str.substring(0,3));
    }
    
}
