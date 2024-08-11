import java.util.HashSet;

public class UnionIter {


    public static void voo(int arr1[],int arr2[]) {

        HashSet<Integer> hs=new HashSet<>();

        //union
        for(int i=0;i<arr1.length ;i++)
        {
            hs.add(arr1[i]);

        }

        for(int i=0;i<arr2.length;i++)
        {
            
            hs.add(arr2[i]);
        }

        System.out.println("Count for union := "+hs.size());


       hs.clear();
        int count=0;

        for(int i=0;i<arr1.length;i++)  
        {
            hs.add(arr1[i]);

        }

        for(int i=0;i<arr2.length;i++ )
        {
            if(hs.contains(arr2[i]))
            {
                count++;
                hs.remove(arr2[i]);
            }
        }

        System.out.print("Intersection count =  : "+count);



       
    }
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};

        voo(arr1, arr2);

    }
    
}
