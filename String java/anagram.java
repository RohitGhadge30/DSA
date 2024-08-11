import java.util.Scanner;

public class Practise {



         public static boolean ana(String str1,String str2)
         {
           int f1[]=new int[26];
              for(int i=0;i<str1.length();i++)
              {
                   char ch=str1.charAt(i);
                   f1[ch - 'a']++;


              }

           int f2[]=new int[26];

           for(int i=0;i<str2.length();i++)
              {
                char ch=str2.charAt(i);
                f2[ch - 'a']++;

                 
                
              }


              for(int i=0;i<26;i++)
              {
                if(f1[i] != f2[i])
                {
                      return false;
                }
              }
              return true;
         }


    public static void main(String[] args) {
        String str1="naa";
        String str2="ana";


        System.out.print(ana(str1,str2));

        






        
    }
    
}
