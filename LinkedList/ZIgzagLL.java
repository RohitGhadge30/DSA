public class ZIgzagLL {


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





      public  void zigzag()
      {
        Node slow=head;
        Node fast=head.next;

        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        Node mid =slow;
        Node curr=mid.next;
        mid.next=null;
        Node prev=null;
        Node next;

        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }

        Node lefthead= head;
        Node righthead=prev;
        Node nextl;
        Node nextr;
        while(lefthead != null && righthead != null)
        {
          
            nextl=lefthead.next;
            lefthead.next=righthead;
           nextr= righthead.next;
            righthead.next=nextl;

            lefthead=nextl;
            righthead=nextr;
        
        }


      }


    public static void main(String[] args) {
 
        ZIgzagLL ll=new ZIgzagLL();
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        ll.addlast(6);
    
    
    

        ll.print();
        ll.zigzag();
        ll.print();
        
    }
    
}


