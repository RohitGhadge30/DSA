import java.util.*;

public class Syntax{





         public static void swap( ArrayList <Integer> list,int i,int j) {

          int temp=list.get(i);
          list.set(i,list.get(j));
          list.set(j,temp);



            
         }


    


    public static void main(String[] args) {


   ArrayList <Integer> list =new ArrayList<>();

       // list.add(1);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(1);

        System.out.println(list);

    //    // swap(list, 0, 4);//swapping elements in list 

    //      Collections.sort(list); ascending order 
    //     System.out.println(list);
   
    //     Collections.sort(list,Collections.reverseOrder());//decending ordder 
    //     System.out.println(list);


    //multidimensional array list 


    ArrayList <ArrayList<Integer>> mainlist= new ArrayList<>();
    ArrayList <ArrayList<String>> mainlist2= new ArrayList<>();
    ArrayList <Integer> list1 =new ArrayList<>();
    ArrayList <String> list2 =new ArrayList<>();

        list1.add(1);
        list1.add(2);
        
        mainlist.add(list1);

        list2.add("rohit");
        list2.add("ghadge");

        mainlist2.add(list2);


        System.out.print(mainlist);
        System.out.print(mainlist2);


       

      

       


















         

         
    }
}
