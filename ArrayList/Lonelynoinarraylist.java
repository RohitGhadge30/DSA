import java.util.*;
import java.util.Collections;
public class Lonelynoinarraylist{

    public static   ArrayList <Integer>  lonely(ArrayList <Integer> nums,int n) {

        nums.add(1);

        while(nums.size() < n)
        {
            ArrayList <Integer> temp=new ArrayList<>();
            for(int i=0;i<nums.size();i++)
            {
                if(nums.get(i)*2-1 <= n)
                {
                    temp.add(nums.get(i)*2-1 );
                }
            }


            for(int i=0;i<nums.size();i++)
            {
                if(nums.get(i)*2 <= n)
                {
                    temp.add(nums.get(i)*2 );
                }
            }

          nums=temp;

        }

        return nums;
        
       



    }


   
    public static void main(String[] args) {
        
        ArrayList <Integer> nums=new ArrayList<>();
        //10,6,5,8
      int n=6;


      
      ArrayList <Integer> ans =lonely(nums, n);

      for(int i=0;i<ans.size();i++)
      {
        System.out.print(ans.get(i)+" ");
      }


    





        
    }
}