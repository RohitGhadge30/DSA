public class RemoveduplicateString {



    public static void voo(String str,StringBuilder newstr,int i, boolean map [])

    {
        if(i == str.length())
        {
          System.out.print(newstr);
          return;

        }
          

        char ch1=str.charAt(i);

        if(map[ch1 - 'a'] == true)
        {
            voo( str, newstr,i+1,map);
        }
        else if(map[ch1 - 'a'] = true){
            voo( str, newstr.append(ch1),i+1,map);   //newstr+ch
        }
    }


    public static void main(String[] args) {
 String str ="appnnacollege";

 StringBuilder newstr= new StringBuilder("");
 boolean map[]=new boolean[26];
 

        voo( str, newstr,0,map);       //newstr="  "  not using builder
        
    }
    
}
