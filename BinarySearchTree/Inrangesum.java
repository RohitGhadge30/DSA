public class Inrangesum {


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
    
 
    public static int inrangesum(Node root ,int low,int high)
    {
        if(root == null)
        {
            return 0;
        }
        int ans=0;
    
    
       if(root.data >= low && root.data <= high)
       {
        
        ans+=root.data;
      
       }

        if(root.data  >  low)
       {
        ans+=inrangesum(root.left, low, high);
       }
       if (root.data < high) {
        ans+=inrangesum(root.right, low, high);
       }

      
       return ans;


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

        // Node root=new Node(10);
        // root.left=new Node(5);
        // root.right=new Node(14);
        // root.left.left=new Node(3);
        // root.left.right=new Node(7);

        // root.right.right=new Node(18);
        // root.right.right.left=new Node(15);
        // root.right.right.right=new Node(20);
        
        
        // root.right.right=new Node(11);
        // root.right.right.right=new Node(14);

        int sum=inrangesum(root, 5, 15);
        System.out.print("The elements in range sum are: "+sum);



        
    }
    
}
