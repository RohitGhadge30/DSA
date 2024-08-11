public  class DeleteLeaves{

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
    public static Node delete(Node root,int  target)
    {
        if(root == null)
        {
            return null;
        }

        root.left=delete(root.left, target);
       root.right= delete(root.right, target);

       if(root.data == target && root.left == null && root.right== null )
       {
         return null;
       }

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

        Node root=new Node(1);
            root.left=new Node(1);
            root.right=new Node(2);
            root.left.left=new Node(2);
            root.left.right=new Node(2);
           
           delete(root, 2);
  
           preorder(root);
            
        
    }

}