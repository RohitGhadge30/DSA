public class Buildtrie{

    public static class Node
    {
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

    public static boolean search(String key)
    {
        Node curr=root;

        for(int level=0;level<key.length();level++)
        {
            int idx=key.charAt(level) -'a';
            if(curr.children[idx] == null)
            {
                 return false;
            }

            curr=curr.children[idx];

        }

        return curr.eow == true;
    }

    public static boolean wordbreak(String key)
    {
        if(key.length() == 0)
        {
            return true;
        }
        for(int i=1;i<=key.length();i++){

        if(search(key.substring(0,i)) && wordbreak(key.substring(i)))
        {
            return true;
        }
    }

        return false;
    }


    public static boolean prefix(String arr)
    {
        Node curr=root;
        for(int i=0;i<arr.length();i++)
        {

            int idx=arr.charAt(i)-'a';
            if(curr.children[idx] == null)
            {
                return false;
            }
            curr=curr.children[idx];

        }
        return true;


    }




    public static void main(String[] args) {
       String arr[]={"the","a","their","there","any","the"};
       // String arr[]={"i","like","sam","samsung","mobile","ice"};
        for(int i=0;i<arr.length;i++)
        {
            insert(arr[i]);
        }

        // System.out.println(search("any")); //if present hai tuo end of word true hona cahiyeee
       //  System.out.println(search("thei")); 

      //  System.out.print(wordbreak("ilikesamsung"));  //pure word hone chaiuye present if 

       //  System.out.println(prefix("ther"));//in between vala word bhi true dega




    }

}