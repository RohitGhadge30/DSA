public class LongestWordPrefix {

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

    public static void insert(String word)
    {
        Node curr=root;
        for(int level =0;level<word.length();level++)
        {
            int idx=word.charAt(level)-'a';
            if(curr.children[idx] == null)
            {
                curr.children[idx]= new Node();

            }
            curr= curr.children[idx];

        }

       curr. eow=true;

    }

    static String ans=" ";

    public static void longwordprefix(Node root,StringBuilder temp)
    {
        if(root == null)
        {
            return;
        }
        
        for(int i=0;i<root.children.length;i++)
        {
            if(root.children[i] != null && root.children[i].eow ==  true)
            {
              char ch=(char)(i+'a');
              temp.append(ch);
              if(temp.length()> ans.length())
              {
                ans=temp.toString();
              }
              longwordprefix(root.children[i], temp);
              temp.deleteCharAt(temp.length()-1);
            }
        }
    }

    public static void main(String[] args) {
        
        String words[]={"w","wo","wor","worl","world"};

        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }

        StringBuilder temp=new StringBuilder();
        longwordprefix(root, temp);
        System.out.print(ans);
    }

    
    
}
