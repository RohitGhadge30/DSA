public class DoublyLinkedList {

    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data)
    {
        Node newnode =new Node (data);
        size++;

        if(head == null)
        {
            head = tail=newnode;
            return;
        }

        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }


    public void addlast(int data)
    {
        Node newnode =new Node (data);
        size++;

        if(head == null)
        {
            head = tail=newnode;
            return;
        }

      tail.next=newnode;
        newnode.prev=tail;
       tail=newnode;
    }


    public int removefirst()
    {
        if(head == null)
        {
            System.out.print("empty LL");
            return Integer.MIN_VALUE;
        }
        else if(size == 1)
        {
            int val=head.data;
            head=head.next;
            size=0;
            return val;

        }
        int  val =head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }


    public void removelast()
    {
        if(head == null)
        {
            System.out.print("empty LL");
            return ;
        }
        else if(size == 1)
        {
            int val=head.data;
            head=head.next;
            size=0;
            return;

        }
        else{
            Node temp = tail.prev;
            tail.prev.next = null;
            tail = temp;
     
    }
    }


    

    public void print()
      {
        Node temp=head;
        if(head == null)
        {
            System.out.print("empty LL");
            return;
        }
        while(temp!= null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
      }

      public void reverse()
      {
        Node prev=null;
        Node curr=tail=head;
        Node next;

       while(curr != null){
        next=curr.next;
        curr.next=prev;
        curr.prev=next;
        prev=curr;
        curr=next;
       }
       head=prev;
      }



      public static void main(String[] args) {

        DoublyLinkedList ll=new DoublyLinkedList();

        ll.addfirst(2);
        ll.addfirst(1);
        ll.addlast(3);
        ll.addlast(4);
       
        // ll.removefirst();
        //ll.removelast();
        ll.print();
       // ll.reverse();
        //ll.print();
        System.out.print(ll.size);
        
      }
    
}
