import java.util.Stack;

public class Palidrome {

    public static class Node{
        char data;   //datatype
        Node next;  //variable

        public Node(char data)      //constructor
        {
            this.data=data;     //pointing towards the data property
            this.next =null;       //pointing next node is null
        }
    }
     
    public  static Node head;   //LL HAS ONLY ONE HEAD ONE TAIL
    public static Node tail;

    


    static boolean isPalindrome(Node head) {
        Node slow = head;
        boolean ispalin = true;
        Stack<Character> stack = new Stack<>();

        // Push elements onto the stack until the middle of the list
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }

        // Check for palindrome by popping elements from the stack
        while (head != null) {
            char i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            } else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }
  



    public static void main(String[] args) {


      Node head = new Node('a');
      head.next = new Node('b');
      head.next.next = new Node('c');
      head.next.next.next = new Node('b');
      head.next.next.next.next = new Node('a');
        
        boolean result = isPalindrome(head);
        System.out.println("Is the linked list a palindrome? " + result);



        
        
        
        
    }
    
}
