public class SwappingLL {

    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;


    public static class Stack{

        public static void phush(int data)
        {
            Node newnode=new Node(data);
            newnode.next=head;
            head=newnode;
        }


        public void printlist()
    {
        Node temp=head;
       

        while(temp!= null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();

    }


    public static void swapnode(int x,int y)
    {
        if(x == y )
        {
            return;
        }

        Node prevx=null; Node currx=head;

        while(currx != null && currx.data != x)
        {
            prevx=currx;
            currx=currx.next;

        }

    

        Node prevy=null; Node curry=head;

        while(curry != null && curry.data != y)
        {
            prevy=curry;
            curry=curry.next;
            
        }

        if(currx == null || curry==null)
        {
            return;
        }

        if(prevx!= null)
        {
            prevx.next=curry;
        }
        else{
            head=curry;
        }

        if(prevy!= null)
        {
            prevy.next=currx;
        }
        else{
            head=currx;
        }

        Node temp=currx.next;
        currx.next=curry.next;
        curry.next=temp;

    }

    }


    public static void main(String[] args) {

        Stack ll=new Stack();

        ll.phush(7);
        ll.phush(6);
        ll.phush(5);
        ll.phush(4);
        ll.phush(3);
        ll.phush(2);
        ll.phush(1);

        ll.printlist();

        ll.swapnode(4, 3);

        ll.printlist();

    }
    
}
