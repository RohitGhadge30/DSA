public class LLQueue {


    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }


    public static class Queue{



        static Node head=null;
        static Node tail=null;

        public static boolean isEmpty()
        {
              return head==null && tail == null;
        }

        public static void add(int data)
        {
            Node newnode=new Node (data);
            if(head == null)
            {
                head =tail=newnode;
            }

            tail.next=newnode;
            tail=newnode;

        }


        public static int remove()
        {
            if(isEmpty())
            {
                System.out.print("que is empty");
                return -1;
            }
            
            int front=head.data;
            if(head == tail)
            {
              head=tail=null;
              
            }
            else{
                head=head.next;
            }
            return front;
           
           
        }


        public static int peek()
        {

            if(isEmpty())
            {
                System.out.print("que is empty");
                return -1;
            }

            return head.data;

        }

    }


    public static void main(String[] args) {
        

        Queue s=new Queue();

        s.add(1);
        s.add(2);
        s.add(3);

        while(!s.isEmpty())
    {
        System.out.print(s.peek());
        s.remove();
    }

    }
    
}
