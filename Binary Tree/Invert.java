public class Invert {
 
    public static class Node{
        int data;
            Node left;
            Node right;
    
            public  Node(int data)
            {
                this.data=data;
                this.left=null;
                this.right=null;
    
            }

    }

   
       
       
        
    

    public static Node mirror(Node node)
    {

    
        if(node == null)
        {
           return node;
        }
        
        Node newnode=new Node(node.data);

        Node left=mirror(node.left);
        Node right=mirror(node.right);

       newnode.left=right;
      newnode.right=left;

       return newnode;
    
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

        Node root=new Node(1);
            root.left=new Node(2);
            root.right=new Node(3);
            root.left.left=new Node(4);
            root.left.right=new Node(5);
            root.right.left=new Node(6);
            root.right.right=new Node(7);
       
        //   mirror(root);
        //   preorder(root);  same node me hei changes kiye tuo yesaa call krnekaa


       preorder(mirror(root));
       
    
        
        
    }
    
}
