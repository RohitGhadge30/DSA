public class Maxsum{
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
  
  
  static int val=0;

    public static int tofindmaxsum(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int left=tofindmaxsum(root.left);
        int right=tofindmaxsum(root.right);

        int singel=Math.max(Math.max(left,right )+root.data,root.data);  //-value rhega na levaes node tuo only roo.data help karega
        int top=Math.max(singel,left+right+root.data);

        val=Math.max(top,val);

        return singel;
    }

    public static int maxsum(Node root )
    {
             
      
         tofindmaxsum(root);
         return val;
    }

    public static void main(String[] args) {

        Node newnode=new Node(-10);
        newnode.left=new Node(9);
        newnode.right=new Node(20);
        newnode.right.left=new Node(15);
        newnode.right.right=new Node(7);

        System.out.print(maxsum(newnode));

        
    }

}