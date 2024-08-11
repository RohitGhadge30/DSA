public class Containerwithmostwater{
   //brute force

    // int maxwater=0;
    //     for(int i=0;i<height.length;i++)
    //     {
    //         for(int j=i+1;j<height.length;j++)
    //         {
    //             int ht=Math.min(height[i],height[j]);
    //             int width=j-i;
    //             int currwater=ht*width;
    //             maxwater=Math.max(maxwater,currwater);

                
    //         }
    //     }

    //     System.out.print(maxwater);

    public static int maxArea(int[] height) {
        int maxwater=0;
        int lp=0;
        int rp=height.length-1;

        while(lp<rp)
        {
            int ht=Math.min(height[lp],height[rp]);
            int width=rp-lp;
            int currwater=ht*width;
            maxwater=Math.max(maxwater,currwater);

            if(height[lp]<height[rp])
            {
                lp++;
            }
            else
            {
                rp--;
            }

        }
        return maxwater;
        
    }


    public static void main(String[] args) {

        int height[]={1,8,6,2,5,4,8,3,7};

        System.out.print(maxArea(height));


        
    }
    
}
