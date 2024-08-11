public class DeleteMN{


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

 
        public static Node delete(int m,int n)

 {
    Node temp=head;

    while(temp != null)
    {
        for(int i=1;i<m && temp!=null;i++)
        {
            temp=temp.next;
        }


        for(int i=1;i<=n && temp!= null && temp.next!=null;i++)
        {
            temp.next=temp.next.next;
        }
        temp=temp.next;

    }
    return head;



 }



 


 



    public static void main(String[] args) {

       
        head =new Node(1);
        head.next =new Node(2);
        head.next.next =new Node(3);
        head.next.next.next =new Node(4);
        head.next.next.next.next=new Node(5);
        head.next.next.next.next.next =new Node(6);
        head.next.next.next.next.next.next =new Node(7);
        head.next.next.next.next.next.next.next=new Node(8);
        head.next.next.next.next.next.next.next.next =new Node(9);
        head.next.next.next.next.next.next.next.next.next=new Node(10);

        delete(3, 2);
        Node current1=head;
        while(current1 != null)
        { 
            System.out.print(current1.data + "-->");
            current1 = current1.next;
        }
        System.out.println();

        


        
    }
}
