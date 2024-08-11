public class NodeCount{

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

    public static int  countnodes(Node root) {

        if(root == null)
        {
            return 0;
        }

        int lcount=countnodes(root.left);
        int rcount=countnodes(root.right);

        return lcount+rcount+1;
        
    }


    public static void main(String[] args) {
        

        Node  root =new Node(1);
        root.right=new Node (3);
        root.left=new Node(2);

        root.left.left=new Node(4);
        root.left.right=new Node(5);

        root.left.right.right=new Node (7);
        root.left.right.right.right=new Node (6);

        System.out.print("Total Nodes are: "+countnodes(root));


    }
}