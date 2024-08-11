public class Strpermutation {



    public static void permuta(String str,String ans)
    {
        if(str.length() == 0)
        {
            System.out.print(ans);
            return;
        }


        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            String newstr=str.substring(0, i ) + str.substring(i+1);
            permuta(newstr, ans+ch);
        }
    }

    public static void main(String[] args) {

        String str="abc";
        permuta(str, " ");
        
    }
    
}
