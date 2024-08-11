public class Intersion1 {

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

 public static  Node inter(Node headA,Node headB)
 {

    Node tempa=headA;
    Node tempb=headB;

    while(tempa != tempb)
    {
        tempa=tempa.next;
        tempb=tempb.next;

        if(tempa == null && tempb == null)
        {
            return null;
        }

        if(tempa == null )
        {
            tempa=headB;
        }
        if(tempb == null)
        {
            tempb =headA;
        }

    }
    return tempa;


 }







    public static void main(String[] args) {
        Intersion1 ll=new Intersion1();

        Node headA =new Node (5);
        Node headB =new Node (4);



        Node newnode=new Node(6);
        headA.next=newnode;

        newnode=new Node(1);
        headB.next=newnode;


        newnode=new Node(1);
        headA.next.next=newnode;

        newnode=new Node(8);
        headA.next.next.next=newnode;
        headB.next.next=newnode;


        newnode=new Node(4);
        headB.next.next.next=newnode;


        newnode=new Node(5);
        headB.next.next.next.next=newnode;

        headB.next.next.next.next.next=null;



        Node current1=headA;
        while(current1 != null)
        { 
            System.out.print(current1.data + "-->");
            current1 = current1.next;
        }
        System.out.println();


        Node current2=headB;
        while(current2 != null)
        { 
            System.out.print(current2.data + "-->");
            current2 = current2.next;
        }
        System.out.println();



        Node  intersectionNode =ll.inter(headA, headB);
        if (intersectionNode != null) {
           System.out.println("Intersection Node: " + intersectionNode.data);
       } else {
           System.out.println("No intersection found.");
       }





       
       


        



    


    


        


        

      
        
        
    }
    
}
