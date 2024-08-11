public class A {



    public static int  firstocc(int nums[],int target)
    {
        int start=0;
        int end=nums.length-1;
        int ans=-1;

        while(start <= end)
        {
            
            int mid=(start+end)/2;

            if(nums[mid] == target)
            {
                   ans=mid;
                   end=mid-1;

            }
            else if(nums[mid]> target)
            {
                 end=mid-1;
            }
            else if(nums[mid]< target)
            {
                start=mid+1;
            }

        }
        return ans;

    }

    public static int  lastocc(int nums[],int target)
    {
        int start=0;
        int end=nums.length-1;
        int ans=-1;

        while(start <= end)
        {
            
            int mid=(start+end)/2;

            if(nums[mid] == target)
            {
                   ans=mid;
                   start=start+1;

            }
            else if(nums[mid]> target)
            {
                 end=mid-1;
            }
            else if(nums[mid]< target)
            {
                start=mid+1;
            }

        }
        return ans;

    }


    public static int[] find(int nums[],int target)
    {
        int ans[]={-1,-1};

        if(ans.length== 0)
        {
            return ans;
        }

        ans[0]=firstocc(nums, target);
        ans[1]=lastocc(nums, target);




        return ans;
    }




    public static void main(String[] args) {

        int nums[]={5,7,7,8,8,10};

        int res[]=find(nums, 6);

        if(res[0] != -1)
        {
            System.out.print(res[0]+" "+res[1]);
        }
        else{
            System.out.print(res[0]+" "+res[1]);
        }

         
        
    }

    // public static void voo(int nums[],int target)
    // {
    //     int ans[]= {-1,-1};
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         if(nums[i]== target)
    //         {
    //             ans[1]=i;
    //             if(ans[0] == -1)
    //             {
    //              ans[0]=i;
    //             }
               
    //         }

          
    //     }

    //     for (int i = 0; i < ans.length; i++) {
    //         System.out.print(ans[i] + " ");
    //     }
      



    // }

    // public static void main(String[] args) {
        
    //     int nums[]={5,7,7,8,8,10};
    //     voo(nums,8);
    // }
    
}
