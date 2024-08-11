import java.util.*;
   public  class A{
     public static class Node{

            int data;
           Node next;


            public Node(int data)
            {
                this.data =data;
                this.next=null;

            }
        }


        public static class Stacks{

            public static Node  head =null;
            public static Node  tail =null;


            public static boolean isEmpty()

            {
                return head == null;
            }


            public static void push(int data)
            {
                Node newnode=new Node(data);
                if( isEmpty())
                {
                    head= tail=newnode;
                    return;
                }
                newnode.next=head;
                head=newnode;
            }


            public static int pop()
            {
                if(isEmpty())
                {
                    return -1;
                }
                int val =head.data;
                head=head.next;
                return val;
            }

            public static int peek()
            {
                if(isEmpty())
                {
                    return -1;
                }
               
                return head.data;
            }

        }


    

    public static void main(String[] args) {

        Stacks s=new Stacks();
        // Stack<Integer> s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty())
        {
            System.out.print(s.pop());
           // s.pop();
        }

        
    }
    
}
