import java.util.*;
public class BuildBST{

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



    

    public static Node insert(Node root,int val)
    {
        if(root == null)
        { 
            root=new Node(val);
                return root;

        }

        if(root.data > val)
        {
            root.left=insert(root.left, val);
        }

        if(root.data < val){
    
            root.right=insert(root.right, val);
        }

        return root;
}




  //Q1  
public static boolean search (Node root ,int key)
   {
    if(root == null)
    {
        return false;
    }

    if(root.data == key)
    {
        return true;
    }
    if(root.data > key)
    {
        return search(root.left, key);
    }

    else
    {
       return  search(root.right, key);
    }

   }





   //Q2

   public static Node delete (Node root, int val)
   {
      //find the node which we have to delete

      if(root.data > val)
      {
        root.left=delete(root.left, val);
      }
      else if(root.data < val)
      {
        root.right=delete(root.right, val);
      }
      else
      {
        //case 1 for delete leaf node
        if(root.left == null && root.right == null)
        {
            return null;
        }

        //casse 2 for delete node with singel child
        if(root.left == null )
        {
            return root.right;
        }
        else if(root.right == null)
        {
            return root.left;
        }

        //case 3 for delete children with two child 

        Node successor = inordersuccessor(root.right);
        root.data = successor.data;
        root.right = delete(root.right, successor.data);




      }
      return root;

   }
   public static  Node inordersuccessor(Node root)
   {
    

    while(root.left != null)
    {
        root=root.left;
    }
        return root;
   }




   //Q3
   public static void inrange(Node root ,int k1,int k2)
   {
    if(root == null)
    {
        return ;
    }

    if(root.data >= k1 && root.data <= k2)
    {
        inrange(root.left,k1,k2);
        System.out.print(root.data+" ");
        inrange(root.right, k1, k2);
    }

    else if(root.data < k1)
    {
        inrange(root.left,k1,k2);
    }
    else
    {
        inrange(root.right,k1,k2);
    }
   }


   public static void print(ArrayList<Integer> path)
   {
    for(int i=0;i<path.size();i++)
    {
    System.out.print(path.get(i)+"--> ");
    }
    System.out.println("null");
   }






   //Q4

   public static void rtf(Node root,ArrayList<Integer> path)
   {
    if(root == null)
    {
        return;
    }

    path.add(root.data);
    if(root.left == null && root.right == null)
    {
       print(path);
    }

    rtf(root.left, path);
    rtf(root.right, path);
    path.remove(path.size()-1);

   }



   //Q5

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




   public static void inorder(Node root) {
    if(root == null)
    {
        return ;
    }

    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
    
}

   
         public static void main(String[] args) {

            int values[]={30,35,40,20,21,25,60,37};

            Node root=null;

            for(int i=0;i<values.length;i++)
            {
               root= insert(root, values[i]);
            }

            if(isValidtBST(root, null, null))
        {
            System.out.print("valid");
        }
        else
        {
            System.out.print("not valid");
        }
        
        inorder(root);
        }


         
            // System.out.println();
    
      //  System.out.print(search(root, 6));   search tree
        //    if(search(root, 1))
        //     {
        //         System.out.print("found");
        //     }
        //     else
        //     {
        //         System.out.print("not found");
        //     }


        // delete(root, 10);         //delete the node

        // inorder(root);
        //     System.out.println();


        // inrange(root,5,12);      //inrange

        // ArrayList<Integer> a=new ArrayList();        //root to leaf
        // rtf(root,a);

        
      }

      