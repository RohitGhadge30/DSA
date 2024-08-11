
import java.util.*;
public class ClosestElement {
    public static class Node{
    int data;
    Node left;
    Node right;

    public Node(int data)
    {
        this.data=data;
        this.left=null;
        this.right=null;
    }

    }

    public static  void inorder(Node root,ArrayList<Integer> a)
    {
        if(root == null)
        {
            return ;
        }

        inorder(root.left, a);
        a.add(root.data);
        inorder(root.right, a);


    }

    public static int  closest(int val,ArrayList<Integer> a)
    {
        int ans=Integer.MAX_VALUE;
        int res=0;

        for(int i=0;i<a.size();i++)
        {
            int diff=Math.abs(a.get(i)-val);
            if(ans > diff)
            {
                ans= diff;
                res=a.get(i);
            }
        }
       

   return res;


   
    }
  
   
    public static void main(String[] args) {

      

        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(11);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(20);

        ArrayList <Integer> a=new ArrayList<>();
        inorder(root,a);
        System.out.print(closest(19, a));

        

       

         



        
    }

    
}
