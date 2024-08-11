import java.util.*;
public class Duplicate {

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

    public static HashMap<String,Integer> m=new HashMap();

    public static String inorder(Node root)
    {
        if(root == null)
        
            return " ";
        

            String str = "(";
            str +=inorder(root.left);
            str +=Integer.toString(root.data);
            str +=inorder(root.right);
            str += ")";

            if(m.get(str) != null && m.get(str) == 1)
            {

                System.out.print(str+" ");
            }

            if(m.containsKey(str))
            {
                 m.put(str,m.get(str)+1);
            }
            else{
                m.put(str,1);
            }


            return str;
        
    }

    public static void main(String[] args) {

        Node root=new Node(1);
        root.left=new Node(4);
        root.right=new Node(3);
        root.left.left=new Node(3);
        
        root.right.left=new Node(4);
        root.right.right=new Node(3);
        root.right.left.left=new Node(3);

        inorder(root);
        
    }
    
}
