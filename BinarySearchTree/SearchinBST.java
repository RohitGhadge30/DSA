public class SearchinBST {
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

    public static boolean search(Node root,int key)
    {
        if(root == null)
        {
            return false;
        }

        if(root.data == key)
        {
            return true;
        }
        if(root.data > key)
        {
            return search(root.left, key);
            
        }
        else 
        {
            return search(root.right, key);
        }

       

    }

    public static void main(String[] args) {

        Node root=new Node(5);
        root.left=new Node(1);
        root.right=new Node(7);

        root.left.right=new Node(3);
        root.left.right.left=new Node(2);
        root.left.right.right=new Node(4);

        preorder(root);
        System.out.print(search(root, 7));
        
    }
    
}
