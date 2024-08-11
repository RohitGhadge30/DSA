public class CountofSubstring{
    public static class Node{
        Node children[]=new Node[26];
        boolean eow=false;

        public Node()
        {
            for(int i=0;i<26;i++)
            {
                 children[i]=null;
            }
        }
    }
    public static Node root=new Node();

    public static void insert(String str)
    {
        Node curr=root;

        for(int i=0;i<str.length();i++)
        {
            int idx=str.charAt(i)-'a';
            if(curr.children[idx] == null)
            {
                curr.children[idx]=new Node();
            }

           curr= curr.children[idx];
        }
        curr.eow=true;
    }


    public static int countofnode(Node root) {

        if(root == null)
        {
            return 0;
        }
        int count=0; 

        for(int i=0;i<root.children.length;i++)
        {
            if(root.children[i] != null)
            {
                count+=countofnode(root.children[i]);
            }

        }
        return count+1;
    }

    public static void main(String[] args) {

        String str="ababa";

        //step 1 find all suffix and insert in trie
        for(int i=0;i<str.length();i++)
        {
            String suffix=str.substring(i);
            insert(suffix);
        }

        //step 2 count of  node

        System.out.print("The unique substring are: "+countofnode(root));

        
    }
}