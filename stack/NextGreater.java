import java.util.*;
public class NextGreater {




    public static void nextgreater(Stack<Integer> s,int greater[],int arr[])

    //this is for next greater right
    //also they can ask    next greater form left
     //also they can ask    next smaller form right
      //also they can ask    next smaller  form left  
    
    

    {
        for(int i=arr.length-1;i>=0;i--)   //left ke liye i=0;i<=arr.length-1  value -1-1 8 8 8 
        {
            while(!s.isEmpty() && arr[s.peek()] <= arr[i] )   //>=smaller  ke liye 
            {
                s.pop();
            }

            if(s.isEmpty())
            {
            greater[i]=-1;
            }
            else{
                greater[i]=arr[s.peek()];
            }

            s.push(i);
        }
        
    }

    public static void main(String[] args) {
        int arr[]={6,8,0,1,3};
        int greater[]=new int[arr.length];
        Stack<Integer> s=new Stack();

   nextgreater(s, greater, arr);
        for(int i=0;i<greater.length;i++)
        {
            System.out.print(greater[i]+" ");
        }


    }
    
}
