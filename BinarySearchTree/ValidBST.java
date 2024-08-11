public class ValidBST {
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



    

    

public static boolean  isValidtBST(Node root, Node min,Node max) {
    
    if(root  == null)
    {
        return true;
    }

    if(min != null && root.data <=  min.data)
    {
 return false;
   }

   else if(max != null && root.data >=  max.data)
    {
 return false;
   }

   
   return isValidtBST(root.left, min, root) && isValidtBST(root.right, root, max);
   
} 

public static void main(String[] args) {

    Node root=new Node(3);
    root.left=new Node(2);
    root.right=new Node(5);
    root.left.left=new Node(1);
    root.left.right=new Node(4);


    if(isValidtBST(root, null, null))
{
    System.out.print("valid");
}
else
{
    System.out.print("not valid");
}

}

    
}
