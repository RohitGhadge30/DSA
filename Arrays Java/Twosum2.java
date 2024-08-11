public class Twosum2 {
          // if the array is sorted than only this technique is used
        //two pointer aapproach

    public static int[]  twosum(int arr[],int target)
    {

        int si=0;
        int ei=arr.length-1;


        while(si<ei)
        {
            if(arr[si]+arr[ei]== target)
            {
                return new int[]{si+1, ei+1};//question me diya hai 1 indexed array isilyee si=0 0+1=1 index value increase
            }

            if(arr[si]+arr[ei]> target)
            {
                ei--;
            }
            else{
                si++;
            }

           
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {


        int arr[]={-1,0};

        int []result=twosum(arr, -1); //int[] return type method hai usko print karne ke liye
        

        if (result[0] != -1) {
            System.out.println("Indices with sum equal to target: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No such indices found.");
        }
        
    }
    
}
