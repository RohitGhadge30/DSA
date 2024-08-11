
public class VowelsConsonent{


public static void main(String[] args) {

   String str="rohit ghadge";
   int ct=0;
   int ct1=0;
   int ct3=0;


   str=str.toLowerCase(); 

   for(int i=0;i<str.length();i++)
   {
    if(str.charAt(i) != ' ')
    {
        ct3++;
        
        
    }
    
    if(str.charAt(i)== 'a' ||str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u')
    {
        ct++;
    }
    else if(str.charAt(i) > 'a' && str.charAt(i)< 'z' )
    {
        ct1++;
    }
   }
   System.out.println(ct3);
   
   System.out.println("vowels in string : "+ ct);
   System.out.println("consonent in string : "+ ct1);


    
}
}