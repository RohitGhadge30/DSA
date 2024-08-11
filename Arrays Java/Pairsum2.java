public class Pairsum2{
    //not aleet code pb

        public static Boolean uff(int arr[] ,int key) {
              int bp=-1;
              
            for(int i=0;i<arr.length;i++)
            {
                 if(arr[i]>arr[i+1])
                 {
                    bp=i;
                    break;
                 }
            }
            int si=bp+1;
            int ei=bp;
            int n=arr.length;

            while(si!=ei)
            {
                if(arr[si]+arr[ei] == key )
                {
                    return true;
                }
                if(arr[si]+arr[ei] < key )
                {
                    si=(si+1)%n;
                }
                else{
                    ei=(n+ei-1)%n;
                }

            }
            return false;
        }
    public static void main(String[] args) {

        int nums[]={11,15,6,8,9,10};
    
            System.out.print(uff(nums,16));
        
    }



}
