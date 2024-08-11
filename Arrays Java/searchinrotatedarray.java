

public class searchinrotatedarray {



    // public static  int search(int a[],int target)
    // {
    //         int start=0;
    //         int end=a.length-1;

    //         while(start<= end)
    //         {
    //             int mid=(start+end)/2;

    //             if(a[mid] == target)
    //             {
    //                 return mid;
    //             }

    //             if(a[start] <= a[mid])
    //          {
    //             if(target >= a[start] && target < a[mid])
    //             {
    //                 end=mid-1;

    //             }
    //             else{
    //                 start = mid+1;
                   
    //             }

    //          }
    //          else if(target <= a[end] && target >= a[mid] )
    //          {
    //             start = mid+1;
    //          }
    //          else
    //          {
    //             end=mid-1;
    //          }
    //         }
    //         return -1;
    // }
    // public static void main(String[] args) {

    //     int a[]={4,5,6,7,1,2};



    //     int target=0;

    //     System.out.print(search(a, target));


        
    // }


    public static int rotate(int nums[],int target,int start,int end)
    {
        // int start=0;
        // int end=nums.length-1;
       if(start> end)
       {
        return  -1;
       }
        
            int mid=start+(end-start)/2;

            if(nums[mid] == target)
            {
                return mid;
            }

            if(nums[start] <= nums[mid])
            {
                if(target>=nums[start] &&  target <=nums[mid])
                {
                  return rotate(nums,target,start,mid-1);
                }
                else{
                   return  rotate(nums,target,mid+1,end);
                }

                

            }
            else {
                if(target<=nums[end] && target >=nums[mid]){
            
                return rotate(nums,target,mid+1,end);
                }
            
            else
            {
                return rotate(nums,target,start,mid-1);
            }
        }
        
        


    }
     
  

    public static void main(String args[])
    {


        int arr[]={4,5,6,7,0,1,2};

        //int target=0;

       int idx=rotate(arr,0,0,arr.length-1);

       System.out.print(idx);



        


    }



    
}
