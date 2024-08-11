public class Buysellstock {


    public static void main(String[] args) {
        int arr[]={7,6,4,3,1};
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<arr.length;i++)
        {
            if(buyprice <arr[i])
            {
                int profit=arr[i]-buyprice;
                maxprofit=Math.max(profit,maxprofit);
            }
            else{
                buyprice=arr[i];
            }
        }

        System.out.print(maxprofit);
    }
    
}
