import java.util.*;
public class MeregeKLL {

    public static class Node implements Comparable<Node>{
        int data;
        Node next;

        public Node(int data)
        {
           this.data=data;
            this.next=null;
        }

        @Override
        public int compareTo(Node r2)
        {
            return this.data-r2.data;
        }
    }

    public static Node merege(Node arr[],int k)
    {

        Node head=new Node(0);    // a dummy linked which is use to store merege ans
        Node last=head; 

        PriorityQueue<Node>  pq=new PriorityQueue();

        for(int i=0;i<k;i++)   //jo hamene arr me sabke head store kiye the vo ab pq me dal diyee,
        {                               //tuo vo hame chota nikalke dega 
            if(arr[i] != null)
            {
                pq.add(arr[i]);
            }
        }
        if(pq.isEmpty())
            {
                return null;
            }

        while(!pq.isEmpty())
        {
            
            Node curr=pq.remove();     // smallest nikal bhar based on data;


            last.next=curr;    //dummy ll me add karrahe hai 
            last=last.next;       // head ki value update kar rahe


            if(curr.next != null)       //ab ek element nikla tuo ek jagaha khali hogi tuo jo nikala uske aage vala LL mese hei add hoga at time ek hei niklega tuo ek hei add hogaa loop break hoga
            {
                pq.add(curr.next);
            }


        
        }

        return head.next;           //ab hamar Dummy LL 0 se start tha ab ans sare mil gye tuo 0 ko ignore kiya or uske aage ke bheja main mai

    }

    public static void print(Node head)
    {
        if(head == null)
        {
            return ;
        }
        Node curr=head;

        while(curr != null)
        {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
        System.out.println();

    }


    public static void main(String[] args) {
        int k=3; int n=3;

        Node arr[]=new Node[k];

        Node head1=new Node (1);
        head1.next=new Node(3);
        head1.next.next=new Node(7);

        Node head2=new Node (2);
        head2.next=new Node(4);
        head2.next.next=new Node(8);

        Node head3=new Node (9);
        head3.next=new Node(10);
        head3.next.next=new Node(11);

        arr[0]=head1;   //Storing every linked list head i an array,beacuse they are smaller in thier LL 
        arr[1]=head2;
        arr[2]=head3;

        Node  res=merege(arr,k);

        if(res != null)
        {
            print(res); 
        }



    }

}