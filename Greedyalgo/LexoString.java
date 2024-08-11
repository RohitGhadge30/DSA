import java.util.*;
public class LexoString {


    public static String lexo(int n,int k)
    {

        StringBuilder sb=new StringBuilder();
        int totalchar=n;
        int csum=k;

        while(totalchar > 0)
        {

            if((totalchar -1)*26 >= (csum-1))
            {
                sb.append('a');
                csum--;

            }
            else{
                int pos=csum % 26;

                if(pos == 0)
                {
                    sb.append('z');
                    csum-=26;
                }
                else
                {
                    sb.append((char)(pos -1 +'a'));
                    csum-=pos;

                }
            }
            totalchar--;

        }


        return sb.toString();


    }



    public static void main(String[] args) {

    System.out.print(lexo(5, 42));
        
    }

    
    
}
