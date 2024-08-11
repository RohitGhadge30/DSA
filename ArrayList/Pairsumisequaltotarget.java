import java.util.ArrayList;

public class Pairsumisequaltotarget{


        //brute forcee se bhi ho sakta

    
    public static boolean vaa(ArrayList <Integer> list,int target)  //2 pointer approach
        {
            int lp=0;
           int  rp=list.size()-1;


        while (lp<rp)
        {

            if(list.get(lp)+list.get(rp)== target)
            {
                
             return true;
            }
            else if(list.get(lp)+list.get(rp)> target)
            {
                  rp--;
            
            }
            else if(list.get(lp)+list.get(rp) < target)
            {
                  lp++;
            
            }
            

        }
        return false;
        }


    public static void main(String[] args) {
        ArrayList <Integer> list =new ArrayList<>();

        list.add(1);
        list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
        
        

        System.out.print(vaa(list,-1));

        
    }




}