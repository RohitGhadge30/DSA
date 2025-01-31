import java.util.Arrays;

public class StrMerege {


    public static void strmerege(String arr[],int si,int ei)
    {
        if(si >= ei)
        {
            return;
        }

        int mid=si+(ei-si)/2;
        strmerege(arr, si, mid);
        strmerege(arr, mid+1, ei);

        sort(arr, si, mid, ei);


    }

    public static void sort(String arr[],int si,int mid,int ei)
    {
        String temp[]=new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei)
        {
            if(arr[i].compareTo(arr[j])<=0)
            {
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid)
        {
            temp[k++]=arr[i++];

        }

        while(j<=ei)
        {
            temp[k++]=arr[j++];
            
        }

        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];

        }

    }

    public static void main(String args[])
    {

        String arr[]={"sun", "earth", "mars", "mercury"};
        strmerege(arr, 0, arr.length-1);
       // System.out.print(Arrays.toString(arr));
       print(arr);


    }

    public static void print(String[] arr) {

        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }

    



   
}
    

