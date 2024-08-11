public class Dectectcycle {

    public static class Node{
        int data;   
        Node next; 

        public Node(int data)      
        {
            this.data=data;     
            this.next =null;     
        }
    }
     
    public  static Node head;  
    public static Node tail;


    public static boolean iscycle()
    {
       Node slow=head;
       Node fast=head;

       while(fast != null && fast.next!= null)
       {
        slow=slow.next;
        fast=fast.next.next;
        if(slow == fast)
        {
            return true;
        }
       }
       return false;
    }


    public static void remoevcycle()
    {
       Node  slow=head;
       Node  fast=head;
       boolean cycle=false;

       while(fast != null &&  fast.next!=null)
       {
        slow=slow.next;
        fast=fast.next.next;
        if(fast == slow)
        {
            cycle =true;  //detect a cyclce 
            break;
        }

       }

       if(cycle == false)
       {
        return;
       }


       slow=head;
       Node prev=null;
     

       //meeting point
       while(slow !=fast)
       {
        prev=fast;
        slow=slow.next;
        fast=fast.next;
       }
       prev.next=null;








    }


    public static void main(String[] args) {

       
        head =new Node(1);
        Node temp=new Node(2);
        head.next=temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;

        System.out.println(iscycle());//detect a cycle
        remoevcycle();
        System.out.println(iscycle());


      //  7 58 36 34 16
    }
    
}
