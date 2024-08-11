import java.util.*;
public class Ordertree{

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

     static class Binarytree{

       static  int idx=-1; 

        public static Node BinaryTree(int nodes[])         
        {
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }

            Node newnode =new Node(nodes[idx]);
            newnode.left=BinaryTree(nodes);
            newnode.right=BinaryTree(nodes);

            return newnode;
        }



        public static void preorder(Node root) {

            if(root == null)  //jab leaft node tak phochega uske aage null hogaa
            {
              return ;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
            
        }


        public static void inorder(Node root) {
            if(root == null)  //jab left node tak phochega uske aage null hogaa
            {     
             return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
           
           
            
        }

        public static void postorder(Node root) {
            if(root == null) 
            {     
             return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
            
        }

        public static void levelorder(Node root) {

           Queue <Node> q=new LinkedList<>();
            if(root == null) 
            {     
             return;
            }
                   
          q.add(root);
           q.add(null);

           while(!q.isEmpty())
           {
            Node curr=q.remove();
            if(curr == null)
            {
                System.out.println();
            
           if(q.isEmpty())
           {
            break;
           }
           else
           {
            q.add(null);
           }
           }

           else{
            System.out.print(curr.data+" ");

            if(curr.left != null)
            {
                    q.add(curr.left);
            }
            if(curr.right != null)
            {
                    q.add(curr.right);
            }
           }
           }  
        }




        


    }


   public static void main(String[] args) {

    int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

    Binarytree tree=new Binarytree();

   Node root= tree.BinaryTree(nodes);
   //tree.preorder(root);   //root at first  //1
   // tree.inorder(root);  //inbetween root
    //tree.postorder(root);//badme
    
    //tree.levelorder(root);//each level element print hoga


   //System.out.print(root.data);

    
   }


}

