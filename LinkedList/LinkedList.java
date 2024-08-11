public class LinkedList{



    public static  class Node{
        int data;   //datatype
        Node next;  //variable

        public Node(int data)      //constructor
        {
            this.data=data;     //pointing towards the data property
            this.next =null;       //pointing next node is null
        }
    }
     
    public  static Node head;   //LL HAS ONLY ONE HEAD ONE TAIL
    public static Node tail;
    public static int  size; 


    //ADD FIRST
    public  void addfirst(int data)
    {
        //1. creating a new node
        Node newnode=new Node(data);
        size++;

        //if linked list empty hai tuo  step 1 or ye hei hoga execute
        if(head == null)
        {
            head=tail=newnode;
            return;
        }


        //2. newnode ka next point karega purane head ki trf
        newnode.next=head;


//3. newnode head ban gaya
        head=newnode;




    }



    //ADDLAST
    public void addlast(int data)
    {
        Node newnode=new Node(data);
        size++;

        if(head == null)
        {
            head=tail=newnode;
            return;
        }
        
        //jo phele vali tail hai uske aage newnode banega
        tail.next=newnode;
 

        //new node tail ban gaya
        tail=newnode;
    }
  
    //PRINT LL
    public void print()
    {
        if(head == null)
        {
            System.out.print("Empty LL");
            return;
        }
        Node temp=head;  //start (head) hamara temp ho gaya 

        while(temp != null)   
        {
            System.out.print(temp.data+" ");   //har ek node ka data print 
            temp=temp.next;    //temp aage badte jayega jab tak null nhi aatta
        }

    
       System.out.println();


    }


   //addmiddel
    public void  add(int idx,int data)
    {
       if(idx == 0)
        {
            addfirst(data);
            return;
        }
        Node newnode=new Node(data);
        size++;   // jaha newnode bana vaha size ++

        Node temp=head;   //start with head 
        int i=0;           
            

        while(i<idx-1)
        {
           temp=temp.next;  // temp aage badte jayegaa
           i++;
        }
        //i=idx-1;  //temp=prev

        newnode.next=temp.next;      //prev  ke aage new node ban gaya  newnode point kar araha temp ke next ko
        temp.next=newnode;         //temp(prev) ke aaage vala matlan newnode ko point karega
       
  
    }

    public int removefirst()
    {

        if(size == 0)  
        {
            System.out.print("LL is empty");
            return  Integer.MIN_VALUE;
           
        }
        else if(size == 1)  //head or tail ek hei node hua
        {
           int val=head.data;
            head=tail=null;   //head or tail ko null banna do
size =0;  
            return val; 
        }
       int val=head.data;    //jo value nikalni usko store karo 
        head=head.next;//next vala head ban jayegaa   //ye ek line hei kafi hai element nikalneko
             size--;  
       return val;

    }

     public int removelast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0; // Update size since the list is now empty
            return val;
        } else {
            Node temp = head;
            // Traverse until the second-to-last node
            while (temp.next != tail) {
                temp = temp.next;
            }
            int val = tail.data;
            temp.next = null; // Remove the reference to the last node
            tail = temp; // Update tail to the second-to-last node
            size--; // Decrement the size of the list
            return val;
        }
    }



    //Q1   SEARCH KEY IN LL

    public int itrsearch(int key)
    {
        int i=0;
        Node temp=head;
       while(temp != null)
       {

       if(temp.data== key)
       {
        return i;
       }
       temp=temp.next;
       i++;
    }

       return -1;
       

    }

    //Q2    SEARCH KEY USING RECURSION IN LL

    public int helperfun(Node head, int key) {
        if (head == null) {
            return -1;
        }
        
        if (head.data == key) {
            return 0;
        }
    
        int idx = helperfun(head.next, key);
        
        if (idx == -1) {
            return -1;
        } else {
            return idx + 1;
        }
    }
    
    public int recursearch(int key) {
        return helperfun(head, key);
    }


    //Q3   REVERSE A LL

    public void reverse(){
        Node prev=null;
        Node curr=tail=head;
        Node next;

        while(curr != null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head=prev;
    }



    //Q4  REMOVE NTH NODE FROM END


    public void removenode(int n)
    {
        int size=0;
        Node temp=head;
        while(temp != null)
        {
            temp=temp.next;
            size++;
        }

        if( n== size)
        {
            head=head.next;
            return;
        }

        int i=1;
        int tofind=size-n;
        Node prev=head;
        while(i<tofind)
        {
            prev=prev.next;
            i++;
        }
        
        prev.next=prev.next.next;
      
        return;



    }


    //Q5 Palidrome LL ?


    public Node midnode(Node head)
    {
        Node slow=head;
        Node  fast=head;

         while(fast != null && fast.next!=null){
        slow=slow.next;  //+1 se udi mar raha;
        fast=fast.next.next;   //+2 se udi mar raha;
         }
         return slow;

    }

    public boolean checkpali()
    {
        Node mid=midnode(head);  //mid ki value ko mid me store karaya


        Node prev=null;
        Node curr=mid;
        Node next;
      while(curr != null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
       Node right=prev;
       Node left=head;


       while(right != null){
       if(left.data !=right.data)
       {
        return false;
       }
       left=left.next;
       right=right.next;
    }
       return true;
    }




    
    

    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
       
        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(2);
        ll.addlast(1);
        ll.print();

       

       

       // ll.add(2,9);  //idx 2 pe 9 dal diya
        
         
        //System.out.println(ll.size);  //size 

        // ll.removefirst();
        // ll.print();  //remove karne ke badd


        // System.out.println(ll.size);



        // ll.removelast();
        // ll.print();
        

        //System.out.print(ll.itrsearch(5));

      // System.out.print(ll.recursearch(9));


    // ll.reverse();
    //  ll.print();


    // ll.removenode(1);
    // ll.print();


    System.out.print(ll.checkpali());




    











      
        

       






    }

}
