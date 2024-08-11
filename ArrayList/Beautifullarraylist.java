import java.util.*;
public class Beautifullarraylist {

    public static ArrayList <Integer> beautiful(ArrayList <Integer> ans,int n) {
        
        ans.add(1);  //1 add kiya hai basically 1 se hei n tak check karke return karega beautiful array

        while(ans.size()<n)
        {

            ArrayList <Integer> temp=new ArrayList<>();

            for(int i=0;i<ans.size();i++)
            {
                if((ans.get(i)*2-1 <=n))
                {
                 temp.add(ans.get(i)*2-1 );    //  odd numbers  firt iteration 1
                }
            }

            for(int i=0;i<ans.size();i++)
            {
                if((ans.get(i)*2 <=n))        //even numbers   first iteration 2
                {
                    temp.add(ans.get(i)*2);
                }
            }

            ans=temp;                 //first iteration complete hone ke badd {1,2} fir ye firse while me jayega.
        }
  return ans;


        
    }


    public static void main(String[] args) {

     

     Scanner sc=new Scanner(System.in);

     int n=sc.nextInt();
     ArrayList <Integer> ans=new ArrayList<>();
     ans = beautiful(ans, n);
     for(int i=0;i<ans.size();i++)
     {
        System.out.print(ans.get(i)+" ");
     }

     //System.out.print(beautiful(ans, 6));




        
    }


    
}
