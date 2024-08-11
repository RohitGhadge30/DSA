public class RemoveElement {


    public static int remove(int a[],int val)
    {
           int count=0;
           for(int i=0;i<a.length;i++)
           {
            if(a[i] != val)
            {
             a[count]=a[i];
             count++;
            }
           }
           return count;
    }

    public static void main(String[] args) {
        int a[]={3,2,2,3};
        int val=2;

        System.out.print(remove(a, val));

    }
    
}
