public class A {
    
    public static void main(String[] args) {
        int arr[]={70,90,10,50,40,20,30,80};
        System.out.print(inv(arr));

    }
    public static int inv(int arr[])
    {
        return mergesort(arr,0,arr.length-1);
    }

    public static int mergesort(int arr[],int si,int ei) {
     int invcount=0;
        if(ei>si)
        {
            int mid=(si+ei)/2;
            invcount=mergesort(arr, si, mid);
            invcount +=mergesort(arr, mid+1, ei);
            invcount +=sort(arr,si, mid+1, ei);


        }
        return invcount;
        
    }

    public static int  sort(int arr[],int si,int mid,int ei) {
        int i=si;
        int j=mid;
        int incount=0;
        int temp[]=new int[ei-si+1];
        int k=0;

        while(i <mid && j<=ei)
        {
         if(arr[i]<=arr[j])
         {
            temp[k]=arr[i];
            i++;
         }
         else{
            temp[k]=arr[j];
            incount +=(mid-i);
            j++;
         }
         k++;
        }

        while(i<mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=ei)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }

        for(k=0,i=si;k<temp.length;k++,i++)
        {
            arr[i]=temp[k];
        }
        return incount;
    }
   
}
