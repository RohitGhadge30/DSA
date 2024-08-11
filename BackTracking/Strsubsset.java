
public class Strsubsset {

    


public static void main(String[] args) {

    String str="prit";
    substr(str," ",0);

    
}


public static void substr(String str,String newstr,int i)
{
    if(i == str.length())
    {
        if( newstr.length() ==0 )
        {
            System.out.println("  null");
        }
        else{
            System.out.println(newstr);
        }

        return ;
        


    }
    
    //yes bola
    substr(str,   newstr+str.charAt(i),i+1);
    //no bola
    substr(str,  newstr,i+1);


}
}