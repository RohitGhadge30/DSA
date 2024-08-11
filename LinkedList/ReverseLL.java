public class ReverseLL {

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

        
        public  static   void reverse()
        {
            Node prev=null;
            Node curr=tail=head;
            Node next;

           while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
           }
           head=prev;

        }

        public static void main(String[] args) {
          // ReverseLL ll =new ReverseLL(); //static nhi banaya tuo class name ka obj se call karna pdta method
            head =new Node(1);
            head.next =new Node(2);
            head.next.next =new Node(3);
            tail =new Node(4);
            head.next.next.next =tail;
            
            Node current1=head;
            while(current1 != null)
            { 
                System.out.print(current1.data + " ");
                current1 = current1.next;
            }
            System.out.println();

            reverse();
            Node current2=head;
            while(current2 != null)
            { 
                System.out.print(current2.data + " ");
                current2 = current2.next;
            }
           
        }


    }




    

