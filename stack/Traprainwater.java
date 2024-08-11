import java.util.*;
public class Traprainwater{



    public static int trap(int height[])
    {
        Stack <Integer> s=new Stack();
        int ans=0;
        int n=height.length;
        for(int i=0;i<height.length;i++)
        {
            while(!s.isEmpty() && height[s.peek()] < height[i])
            {
                int pop_height=height[s.peek()];
                s.pop();
                if(s.isEmpty())
                
                    break;
                
                int dist=i- s.peek() -1;
                int min_height=Math.min(height[s.peek()],height[i])-pop_height;
                ans+=dist*min_height;






            }
            s.push(i);

        }
        return ans;


    }



    public static void main(String[] args) {
        int height[]={ 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        System.out.print(trap(height));
        
    }
}