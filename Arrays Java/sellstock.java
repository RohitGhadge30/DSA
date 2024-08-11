package DSA;

public class sellstock {



    public static int  max(int a[] ) {


        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;

        for(int i=0;i<a.length;i++)
        {
            if(buyprice<a[i])
            {
                  int profit=a[i]-buyprice; 

                  maxprofit=Math.max(profit,maxprofit);
            }

            else{
                buyprice=a[i];
            }
        }
     return maxprofit;
        
    }
    public static void main(String[] args) {

        int a[]={7,6,4,3,1};
        System.out.print(max(a));
        
    }
    
}
