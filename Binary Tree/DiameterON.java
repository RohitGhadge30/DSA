import org.w3c.dom.Node;

public class DiameterON {


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
    static class Info{
        int diam;
        int ht;

        public Info(int diam,int ht)
        {
           this.diam=diam;
           this.ht=ht;
        }
    }


    public static Info dia(Node root) {  //O(n)

        if(root == null)
        {
            return new  Info(0,0);
        }

        Info left=dia(root.left);
        Info right=dia(root.right);


       
        int selfdia=(left.ht+right.ht)+1;
        int ht=Math.max(left.ht,right.ht)+1;
        int diameter=Math.max(Math.max(left.diam,right.diam),selfdia);
        return new Info(diameter,ht);
    }

    public static void main(String[] args) {

        


        Node root=new Node(1);
            root.left=new Node(2);
            root.right=new Node(3);
            root.left.left=new Node(4);
            root.left.right=new Node(5);
            root.right.left=new Node(6);
            root.right.right=new Node(7);


       System.out.print(dia(root).diam);
        
    }
    
    
}
