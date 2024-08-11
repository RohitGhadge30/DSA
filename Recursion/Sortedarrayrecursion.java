public class Sortedarrayrecursion {



    public static boolean get(int arr[],int i)
    {
         if( i == arr.length-1 )
         {
             return true;
         }
         if( arr[i] > arr[i+1] )
         {
            return false;
         }
         return get(arr,i+1);

    }

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};

        System.out.print(get(arr,0));

        


    }
    
}
