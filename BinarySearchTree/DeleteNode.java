public class DeleteNode {
    public static class Node{
        int data;
        Node left,right;

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


    public static Node delete(Node root,int val)
    {
      
        if(root.data > val)
        {
            root.left=delete(root.left, val);
        }
        else if(root.data < val)
        {
            root.right=delete(root.right, val);
        }

        else
        {
            if(root.left == null && root.right == null)
            {
                return null;
            }

            if(root.left == null)
            {
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }


            Node suc=is(root.right);
            root.data =suc.data;
            root.right=delete(root.right, suc.data);
        }

        return root;

        }

        public static Node  is(Node root)
        {
            while(root.left != null)
            {
                root=root.left;
            }
            return root;


        }
    







    public static void main(String[] args) {

        Node root=new Node(8);
        root.left=new Node(5);
        root.right=new Node(10);
        root.left.left=new Node(3);
        root.left.right=new Node(6);

        root.left.left.left=new Node(1);
        root.left.left.right=new Node(4);
        
        root.right.right=new Node(11);
        root.right.right.right=new Node(14);

        delete(root, 3);
        preorder(root);
        
    }
    
}
