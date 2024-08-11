import java.util.*;
public class Merge2BST {
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

    public static  void sort(Node root,ArrayList <Integer> a)
    {
        if(root == null)
        {
            return;
        }
        sort(root.left, a);
        a.add(root.data);
        sort(root.right, a);
    }

    public static Node  createbst(ArrayList <Integer> a,int start,int end)
    {
        if(start > end)
        {
            return null;
        }

        int mid=(start+end)/2;
        Node root=new Node (a.get(mid));
        root.left=createbst(a, start, mid-1);
        root.right=createbst(a, mid+1, end);

        return root;
    
    }

    public static Node con(Node root1 ,Node root2)
    {

        //sort 1st
        ArrayList <Integer> a1=new ArrayList();
        sort(root1, a1);

        //sort 2nd
        ArrayList <Integer> a2=new ArrayList();
        sort(root2, a2);


        //merege both sorted

        int i=0;int j=0;
        ArrayList <Integer> finans=new ArrayList();
        while(i<a1.size() && j<a2.size())
        {
            if(a1.get(i) <= a2.get(j))
            {
                
                finans.add(a1.get(i));
                i++;
            }
            else{
                finans.add(a2.get(j));
                j++;

            }

        }

        while(i<a1.size())
        {
            finans.add(a1.get(i));
            i++;
        }


        while(j<a2.size())
        {
            finans.add(a2.get(j));
            j++;
           
        }



        
      return  createbst(finans, 0, finans.size()-1);
 
    }

    public static void preorder(Node root) {
        if(root == null)
        {
            return ;
        }
    
       
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);  
    }




    public static void main(String[] args) {
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);


       preorder(con(root1, root2));

      
    }
    
}
