public class Lastoccurencerecursion{

    public static int lt(int a[],int key,int i)
    {
        if (i == a.length)
        {
        return -1;

        }

        int isfound =lt(a, key, i+1);
        if( isfound == -1 && a[i] == key)
        {
            return i;
        }

        return isfound;

    }

    public static void main(String[] args) {
        
        int a[]={8,3,6,9,5,10,2,5,3};
       // int key=5;

        System.out.print(lt(a,5,0));
    }
   
    
}
