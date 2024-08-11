public class Romantointeger {


    public static int getval(char ch){
        switch (ch) {
            case 'I':    return  1;
            case'V':    return 5;
            case 'X' :   return   10;
            case'L' :  return  50;
            case 'C' :  return  100;
            case  'D'  :return  500;
            case 'M' :  return 1000;
            default : return 0;
            }
        }
  public static int getroman(String s){
    int n=s.length();
        int sum=0;

        for(int i=0;i<n;i++)
           {
            char ch1=s.charAt(i);// M lega 
 
            if((i+1)<n  && getval(ch1) <  getval(s.charAt(i+1)))  //1000 <100 =+1000
                                                                  //100< 1000 =-100
            {
               sum=sum-getval(ch1);
            }
            else{
                sum=sum+getval(ch1);
            }
           }
           return sum;

  }
        
        
            
        
            
        

        public static void main(String[] args) {

            String s="DMCDX";
           int n=s.length();
           System.out.print(getroman(s));
           

           



        }

    }
    

