import java.util.HashMap;

public class Twosum {

    public static int[] twosum(int nums[],int target)
    {
        HashMap<Integer,Integer> map=new HashMap();
        int res[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(target - nums[i]))
            {
               res[1]=i;
               res[0]=map.get(target-nums[i]);
            }
            map.put(nums[i],i);

        }
        return res;
    }

    public static void main(String[] args) {
       int  nums[] = {1,2,3};
       int target = 3;

       int res[]=twosum(nums, target);
       if(res[0] != -1)
       {
        System.out.print(res[0]+" "+res[1]);
       }
    }
    
}
