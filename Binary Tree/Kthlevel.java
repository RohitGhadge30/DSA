import java.util.*;
public class Kthlevel {
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

    public static void kth(Node root,int k,int level) { 
        if(root == null)
        {
            return ;
        }
     

        if(level == k)
        {
            System.out.print(root.data+" ");
            return;
        }

        kth(root.left, k, level+1);
        kth(root.right, k, level+1);
        
    }

    // public static void kth(Node root,int k) {


    //     Queue<Node> q=new LinkedList<>();

    //     q.add(root);
    //     q.add(null);
    //     int level=1;

    //     while(!q.isEmpty())
    //     {
            
    //         Node curr=q.remove();
    //         if(curr == null)
    //         {
    //             level++;
    //             if(q.isEmpty())
    //             {
    //                break;
    //             }
    //             else{
    //                 q.add(null);
    //             }
    //         }
    //         else 
    //         {
    //             if(level == k)
    //             {
    //                 System.out.print(curr.data+" ");
    //             }
    //             if(curr.left != null)
    //             {
    //                 q.add(curr.left);
    //             }
    //             if(curr.right != null)
    //             {
    //                 q.add(curr.right);
    //             }
    //         }



    //     }
        
    // }


    public static void main(String[] args) {

        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

       // kth(root,3);

       kth(root, 2, 1);


        
    }



    
}
