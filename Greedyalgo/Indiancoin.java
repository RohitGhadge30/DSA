import java.util.*;
public class Indiancoin {



   public static void main(String[] args) {
    

    Integer coins[]={1,2,5,10,20,50,100,500,2000};

    Arrays.sort(coins, Collections.reverseOrder());
    int amount=590;

    int count=0;

    ArrayList<Integer> a=new ArrayList();

    for(int i=0;i<coins.length;i++)
    {
        if(coins[i] <=amount)
        {
            while(coins[i]<=amount){
            count++;
            a.add(coins[i]);
            amount-=coins[i];  
            }
        }
       

       


    }
    System.out.println("Total Count of Notes := "+count);

    System.out.println("Min Notes use  are"+a);
   }
    
}
