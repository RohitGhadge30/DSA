public class Palidrome {

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
  //  public static int size;

    public  static  Node   midnode(Node head)
    {
        Node slow=head;
        Node fast=head;

        while(fast != null && fast.next != null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow;
    }

    public  static boolean  pali()
    {
        Node mid=midnode(head);
        Node prev=null;
        Node curr=mid;
        Node next;

        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }

        Node right=prev;
        Node left=head;
        while(right != null){
       if(left.data != right.data )
       {
        return false;
       }
       left=left.next;
       right=right.next;
    };
 return true;


    }


    public static void main(String[] args) {
          
            head =new Node(1);
            head.next =new Node(2);
            head.next.next =new Node(2);
            tail =new Node(1);
            head.next.next.next =tail;
            
            // Node current1=head;
            // while(current1 != null)
            // { 
            //     System.out.print(current1.data + " ");
            //     current1 = current1.next;
            // }
            //System.out.println();

           System.out.print(pali());

    }
    
}
