import java.util.*;
public class Covert{
    public static class Node{
        int  data;
        Node left;
        Node right;

        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static void preorder(Node root) {
        if(root == null)
        {
            return ;
        }
    
       
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);  
    }

    public static void  create(ArrayList<Integer> inorder,Node root)
    {
        if(root == null)
        {
           return ;
        }

        create(inorder,root.left);
        inorder.add(root.data);
        create(inorder, root.right);

    }

    public static Node convbst(ArrayList<Integer> inorder,int start,int end)
    {
        if(start> end)
        {
            return null;
        }

        int mid=(start+end)/2;
        Node root=new Node(inorder.get(mid)); 
        root.left=convbst(inorder, start, mid-1);
        root.right=convbst(inorder, mid+1, end);

        return root;


    }


    public static Node blanacedbst(Node root)
    {
        ArrayList<Integer> inorder =new ArrayList();
       create(inorder, root);

      root=convbst(inorder, 0, inorder.size()-1);

      return root;

    }



    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);


         root=blanacedbst(root);
        preorder(root);







    }

}