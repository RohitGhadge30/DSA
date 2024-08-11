import java.util.*;
public class Univalued {
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

    public static boolean univalued(Node root) {

        if(root == null)
        {
            return true;
        }

        if(root.left != null && root.data != root.left.data)
        {
            return false;
        }

        if(root.right != null && root.data != root.right.data)
        {
            return false;
        }

    boolean left= univalued(root.left);
    boolean right=univalued(root.right);

    return left && right;



      
    }

    public static void preorder(Node root) {

        if(root == null)  //jab leaft node tak phochega uske aage null hogaa
        {
          return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
        
    }
   

    

 
   
    public static void main(String[] args) {


        Node root=new Node(2);
        root.left=new Node(1);
        root.right=new Node(2);
        root.left.left=new Node(2);
        root.left.right=new Node(2);
        root.right.left=new Node(2);
        root.right.right=new Node(2);
        
       System.out.print(univalued(root));

       
    }
    
}
