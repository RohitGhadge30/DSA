import java.util.*;

public class Two {
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

    public static void inorder(Node root,ArrayList<Integer> a)
    {
        if(root == null)
        {
            return ;
        }

        inorder(root.left, a);
        a.add(root.data);
        inorder(root.right, a);
        
    }

    public static int  getans(Node root,ArrayList<Integer> a,int target)
    {
        int start=0;
        int end=a.size()-1;
        int count=0;

        while(start < end)
        {
            if(a.get(start) +a.get(end) == target)
            {
               System.out.print("("+a.get(start) +","+a.get(end)+")"+" ");
               count++;
              start++;
              end--;
               
            }

            else if(a.get(start) +a.get(end) >= target)
            {
               end--;
            }
            else
            {
             start++;
            }

        }
        

        return count;

    }

    public static void main(String[] args) {
        Node root=new Node(5);
        root.left=new Node(3);
        root.right=new Node(7);
        root.left.left=new Node(2);
        root.left.right=new Node(4);
        root.right.left=new Node(6);
        root.right.right=new Node(8);

        ArrayList<Integer> a=new ArrayList();
        inorder(root, a);

      
      System.out.print(getans(root, a, 9));
    }
       
    }
    

