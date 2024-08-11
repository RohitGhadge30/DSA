import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SortByFreq {


    public static String find(String str)
    {
        HashMap<Character,Integer> map =new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
           map.put(ch,map.getOrDefault(ch,0)+1);
        }

       
        List<Character> chars = new ArrayList<>(map.keySet());
	    Collections.sort(chars, (a, b) -> map.get(b) - map.get(a));
        StringBuilder sb = new StringBuilder();
        for (Character ch : chars) {
            for (int i = 0; i < map.get(ch); i++) {   
                sb.append(ch);
            }
	    }
        return sb.toString();

    }
    

    public static void main(String[] args) {
      
        String str="Aabb";

        System.out.print(find(str));

    }

}
