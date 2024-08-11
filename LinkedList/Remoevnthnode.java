public class Remoevnthnode {
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
        public static int size;

        public static void removenth(int n)
        {
            size=0;
            Node temp=head;
            while(temp != null)
            {
               temp=temp.next;
               size++;
            }
            if(n>size)
            {
                return;
            }

            if(n == size)
            {
            head=head.next;
            return ;
            }
           else{
            Node prev=head;
            int i=1;
            int idx=size-n;
            while(i<idx){
                
            prev=prev.next;
            i++;
           }

             if (prev.next != null) {
                 prev.next = prev.next.next;
             }
        }
            return ;




        }


        public static void main(String[] args) {

            head =new Node(1);
            head.next =new Node(2);
            head.next.next =new Node(3);
            tail =new Node(4);
            tail.next =new Node(5);
            head.next.next.next =tail;

            Node curr=head;

            while(curr != null)
            {
                System.out.print(curr.data+" ");
                curr=curr.next;
            }
            System.out.println();
            removenth(5);

            Node curr1=head;

            while(curr1 != null)
            {
                System.out.print(curr1.data+" ");
                curr1=curr1.next;
            }
           



            
        }



    
}

