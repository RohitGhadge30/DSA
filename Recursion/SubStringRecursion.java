public class SubStringRecursion {


    public static void main(String args[])
    {

        printsubstring("abcab", 0);
             
    }
    public static void printsubstring(String str,int start)
    {
       if(start == str.length())
       {
             return;
       }


       StringBuilder sb =new StringBuilder();
       int count =0;
       for(int end=start;end<str.length();end++)
       {
              sb.append(str.charAt(end));
              System.out.print(sb+" ");
              if(str.charAt(start) == str.charAt(end) )
              {
                 count ++;
              }
       }
       System.out.println(count+" ");

       printsubstring(str, start+1);
    }
    
}
