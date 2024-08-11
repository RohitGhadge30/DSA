public class MinDist {
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


    public static Node lca(Node root ,int n1,int n2)
    {
        if(root ==  null)
        {
            return null;
        }

        if(root.data == n1 || root.data == n2)
        {
            return root;
        }

        Node left=lca(root.left, n1, n2);
        Node right=lca(root.right, n1, n2);

        if(left == null)
        {
            return right;
        }
        if(right== null)
        {
            return left;
        }

        return root;


    }
    public static int finddist(Node root,int n) {
        
        if(root == null)
        {
            return -1;
        }

        if(root .data == n)
        {
            return 0;
        }

        int leftdist=finddist(root.left, n);
        int rightdist=finddist(root.right, n);

        if(leftdist == -1 && rightdist == -1)
        {
            return -1;
        }
        else if(leftdist == -1)
        {
            return rightdist+1;
        }
        else
        {
            return leftdist+1;
        }
    }
    
    public static int  mindist(Node root ,int n1,int n2)
    {

        Node lca=lca(root, n1, n2);

        int dist1=finddist(lca,n1);
        int dist2=finddist(lca,n2);

        return dist1+dist2;

    }
    


    public static void main(String[] args) {

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        System.out.print("Minimum dist between two nodes are: "+mindist(root, 2,3));
        
    }
    
}
