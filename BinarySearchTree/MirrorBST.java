public class MirrorBST {
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


    public static Node mirr(Node root)
    {
        if(root == null)
        {
            return root;
        }

        Node left=mirr(root.left);
        Node right=mirr(root.right);

        root.left=right;
        root.right=left;

        return root;
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

    public static void main(String[] args) {

        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);
        root.right.right=new Node(11);

        mirr(root);

        preorder(root);
       


        
    }
}
