import java.util.*;
public class kthlarggest {


    public static ArrayList<Integer> getallkth(int arr[],int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];
            if(pq.size()< k)
            {
                pq.add(val);
            }
            else
            {
                if(val > pq.peek())
                {
                    pq.remove();
                    pq.add(val);
                }
            }

            if(pq.size()>= k)
            {
               list.add(pq.peek());
            }
            else{
              list.add(-1);
            }
        }

        return list;

    


    }
    public static void main(String[] args) {



        int k = 3;
        int arr[] = { 10, 20, 11, 70, 50, 40, 100, 5};
        ArrayList<Integer> res=getallkth(arr, k);
        for(int i=0;i<res.size();i++)
        {
            System.out.print(res.get(i)+" ");
        }

        
    }
    
}
