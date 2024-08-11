import java.util.HashMap;
import java.util.*;
public class Syntax{


    public static void main(String[] args) {

        HashMap<String ,Integer> map=new HashMap<>();
        //insert
        //O(1)
        map.put("samosa",20);
        map.put("tea",10);
        map.put("coffe",20);
        System.out.println(map);


        //get value
        //O(1)
    //    int info= map.get("tea");  //if karti hai tuo value dega
    //    System.out.println(info);

    //    System.out.println(map.get("indonasia"));  //if nhi karti tuo null dega


    //    //contains Key
    //   //O(1)
    //    System.out.println(map.containsKey("tea"));// true or false 


    //    //remove
    //     //O(1)
      
    //    System.out.println(map.remove("tea")); //remove karke uski vaue return karega
    //    System.out.println(map);

    //    System.out.println(map.size());//size of hashmap

     
       
    //    map.clear();  //empty the hashmap 

    //    System.out.print(map.isEmpty());


    //iteration on hash map
    //    Set<String> keys=map.keySet();
    //    System.out.print(keys);

    //    for(String k:keys)
    //    {
    //     System.out.print(k+" "+map.get(k)+"  ");
    //    }



    //if we want input data in a serial order the use linked hash map

    // LinkedHashMap<String ,Integer> lm=new LinkedHashMap<>();
    // //insert
    // //O(1)
    // lm.put("samosa",20);
    // lm.put("tea",10);
    // lm.put("coffe",20);
    // System.out.println(lm);


    // //treemap give output in sorted order based  on key value

    // TreeMap<String ,Integer> tm=new TreeMap<>();
    // //insert
    // //O(1)
    // tm.put("samosa",20);
    // tm.put("tea",10);
    // tm.put("coffe",20);
    // System.out.println(tm);   


        
    }
}