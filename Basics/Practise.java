public class Practise{
    public static void main(String[] args) {

       String str="rohit ghadge";
       int count=0;
       int count1=0;
       for(int i=0;i<str.length();i++)
       {
       
        if(str.charAt(i) == 'a' ||str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
             count++;
        }
        else if( str.charAt(i)>'a' &&   str.charAt(i)<'z')
        {
            count1++;
        }

       }

       System.out.println(count);
       System.out.println(count1);




        
    }



}