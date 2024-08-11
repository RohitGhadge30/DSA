import java.util.*;
public class MjaorityElement2 {



    public static ArrayList<Integer>  majo(int arr[])
    {
        ArrayList<Integer> ans=new ArrayList();
        HashMap<Integer,Integer> map =new HashMap<>();
        int n=arr.length;
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[i];
            // if(map.containsKey(num) )
            // {
            //     map.put(arr[i],map.get(arr[i])+1);
               
            // }
            // else
            // {
            //     map.put(arr[i],1);
            // }

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }


       // Set<Integer> keyset= map.keySet();
        for(Integer key : map.keySet())
        {
            if(map.get(key)> n/3)
            {
               ans.add(key);
            }
        }

        return ans;

       

    }

    public static void main(String[] args) {

        int arr[]={1,3,2,5,1,3,1,5,1,};
        ArrayList<Integer> ans=majo(arr);
        for(int i=0;i<ans.size();i++)
        {
             System.out.print(ans.get(i)+" ");
        }
        
        
    }
    
}
