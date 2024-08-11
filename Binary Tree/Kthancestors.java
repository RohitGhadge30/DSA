public class Kthancestors {

    
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

    public static int kthanc(Node root,int n,int k)
    {
        if(root == null)
        {
            return -1;
        }

        if(root.data == n)
        {
            return 0;
        }
        int left=kthanc(root.left, n, k);
        int right=kthanc(root.right, n, k);

        if(left == -1 && right == -1)
        {
            return -1;
        }

        int max=Math.max(left,right);

        if(max+1 == k)
        {
            System.out.println("The kthanc of Node is :  "+root.data+" "); 
        }
    
            return max+1;
        
    }

    public static void main(String[] args) {
        Node root=new Node(1);
            root.left=new Node(2);
            root.right=new Node(3);
            root.left.left=new Node(4);
            root.left.right=new Node(5);
            root.right.left=new Node(6);
            root.right.right=new Node(7);
            int n=6;int k=1;
    
          kthanc(root, n, k);
        
    }
    
}
