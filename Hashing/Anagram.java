import java.util.*;
public class Anagram {



    public static boolean find(String str1,String str2)
    {

        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<str1.length();i++)
        {
            char ch=str1.charAt(i);
           if(map.containsKey(ch))
           {
            map.put(ch,map.get(ch)+1);
           }
           else{
            map.put(ch,1);
           }
        }

        for(int i=0;i<str2.length();i++)
        {
            char ch=str2.charAt(i);

            
            if(!map.containsKey(ch) )
                {
                   return false;
                }
                else
                { 
                    if(map.get(ch) == 1)
                    {
                        map.remove(ch);
                    }
                    else
                    {
                    map.put(ch,map.get(ch)-1);
                    }
                }
           
        }
        return map.isEmpty();
       
    }
    public static void main(String[] args) {
        String str1="earth";
        String str2="heart";

        System.out.print(find(str1, str2));

       
    }
    
}
