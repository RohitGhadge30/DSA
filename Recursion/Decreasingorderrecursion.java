public class Decreasingorderrecursion {

    public static void printdec(int n){

  if(n ==1)
  {
   System.out.print(1);
    return ;
  }
   //System.out.print(n);
    printdec(n-1);
    System.out.print(n);

       

    }
    public static void main(String[] args) {

        printdec(10);
        
    }
}
