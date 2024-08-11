import org.w3c.dom.Node;

public class Inrange {

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

    public static void inrange(Node root,int k1,int k2)
    {

        if(root == null)
        {
            return;
        }
        if(root.data >= k1 && root.data <= k2)
        {
            inrange(root.left, k1, k2);
            System.out.print("Node :  "+root.data+" ");
            inrange(root.right, k1, k2);
        }



        else if(root.data  > k1)
        {
            inrange(root.left, k1, k2);
        }
        else if(root.data < k2){
            inrange(root.right, k1, k2);
        }

      


    }



    public static void main(String[] args) {
        //  Node root=new Node(8);
        // root.left=new Node(5);Node root=new Node(10);
        // root.left=new Node(5);
        // root.right=new Node(14);
        // root.left.left=new Node(3);
        // root.left.right=new Node(7);

        // root.right.right=new Node(18);
        // root.right.right.left=new Node(15);
        // root.right.right.right=new Node(20);
        // root.right=new Node(10);
        // root.left.left=new Node(3);
        // root.left.right=new Node(6);

        // root.left.left.left=new Node(1);
        // root.left.left.right=new Node(4);
        
        
        // root.right.right=new Node(11);
        // root.right.right.right=new Node(14);

        

        inrange(root, 16, 20);
    }
    
}
