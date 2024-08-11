public class Sortedarray {


    public static int sorted(int arr[],int target,int start,int end){


         if(start >end)
         {
            return -1;
         }

         int mid=start+(end-start)/2;
         if(arr[mid] == target)
         {
            return mid;
         }

         if(arr[start]<=arr[mid])
         {
            if(target>=arr[start] && target <=arr[mid])
            {
                return sorted(arr,target,start,mid-1);
            }
            else{
                return sorted(arr,target,mid+1,end);
            }
         }
         else
         {
            if(target <=arr[end] && target >=arr[mid])
            {
                return sorted(arr,target,mid+1,end);

            }
            else{
                return sorted(arr,target,start,mid-1);
            }
         }

    }


    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};

       System.out.print( sorted(arr, 12, 0, arr.length-1));




    }


}
