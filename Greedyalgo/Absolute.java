import java.util.Arrays;
public class Absolute {


    public static void main(String[] args) {

        int A[]={4,1,8,7};
        int B[]={2,3,6,5};

        Arrays.sort(A);
        Arrays.sort(B);

        int mindiff=0;

        for(int i=0;i<A.length;i++)
        {
            mindiff+=Math.abs(A[i]-B[i]);   //math fun for getting a-b b-a same value 4-5 5-4 ==1 +only 

        }

        System.out.print("min diff is: "+mindiff+" ");



        

        
    }
    
}
