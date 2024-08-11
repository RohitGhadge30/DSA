public class MergesortLL{


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


      public void addfirst(int data)
      {
        Node newnode=new Node(data);
        if(head == null)
        {
            head=tail=newnode;
            return;
        }

        newnode.next=head;
        head=newnode;
      }

      public void addlast(int data)
      {
        Node newnode=new Node(data);
        if(head == null)
        {
            head=tail=newnode;
            return;
        }

        tail.next=newnode;
        tail=newnode;
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

      public static Node mid(Node head)
      {
        Node slow=head;
        Node fast=head.next;
        while(fast!= null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        } 
        return slow;

      }

      public  Node mergesort(Node head)
      {
        if(head == null || head.next == null)
        {
            return head ;
        }

        Node midvalue=mid(head);     //mid value mili

        Node righthead=midvalue.next;  //right part 
        midvalue.next=null;  //left part

        Node newleft=mergesort(head);          //leftsort part ke liye mergesort call kiya 
        Node newright=mergesort(righthead);    //right"""""""""""""""""meregesort call kiya

        return merge(newleft,newright);

      }


      public  Node merge(Node head1,Node head2)  //merge and   sort
      {
        Node mergell=new Node(-1);
        Node temp=mergell;

        while(head1!= null && head2 != null)
        {
            if(head1.data <=head2.data)
            {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else
            {  
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }

        while(head1!= null)
        {
            temp.next=head1;
                head1=head1.next;
                temp=temp.next;

        }
        while(head2 != null)
        {
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }

        return mergell.next;

      }
















    public static void main(String[] args) {

        MergesortLL ll =new MergesortLL();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.addfirst(3);
        ll.addfirst(4);
        ll.print();
        ll.head= ll.mergesort(ll.head);

        ll.print();

       

      

     

        
    }
    
}