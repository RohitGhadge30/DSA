

public class Reverseanarray {

    public static void main(String[] args) {
        int a[]={-2,1,-3,-1,2,-5,4};

        reverse(a);

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static void  reverse(int a[]) {


        int start=0;
        int end=a.length-1;


        while(start < end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;

            start++;
            end--;

        }


       
           
    
}
}
