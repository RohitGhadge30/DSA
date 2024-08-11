public class Mergesort {

    public static void  mergesort(int arr[],int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;//mid value 
        mergesort(arr,si,mid);//left part 
        mergesort(arr,mid+1,ei);//right part

        sort(arr,si,mid,ei);   
        


    }
    public static void sort(int arr[],int si,int mid,int ei)
    {

        int temp[]=new int[ei-si+1];//
        int i=si;
       int  j=mid+1;
       int  k=0;
//temp me value store karneka
       while(i<=mid && j<=ei)
       {
        if(arr[i]<= arr[j]) //>descending  //= for statbility means 10 =10 tuo left wala 10 phel aayega
        {
            temp[k]=arr[i];
            i++;
        }
        else
        {
            temp[k]=arr[j];
            j++;
        }
        k++;


       }

       //i ki bachi huyi value ko temp me dalneka
       while(i<=mid)
       {
       temp[k]=arr[i];                    //temp[k++]=temp[i++]
       k++; i++;
       }
        //j ki bachi huyi value ko temp me dalneka
       while(j<=ei)
       {
         temp[k]=arr[j];                //temp[k++]=temp[j++]
         k++; j++;
       }

//temp ki value arr me copy karneka 
       for(k=0,i=si;k<temp.length;k++,i++)
       {
           arr[i]=temp[k];
       }

    }


    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};

        mergesort(arr,0,arr.length-1);
        printarr(arr);


    }

    public static void printarr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
}
