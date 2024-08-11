public class Rotateanarray {




    public static void rotate(int a[],int i,int j)
    {
        int li =i;
        int ri =j;

        while(li < ri)
        {
            int temp=a[li];
            a[li]=a[ri];
            a[ri]=temp;

            li++;
            ri--;
        }
    }


    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7}; //5,6,7,1,2,3,4
        int k =3;

        rotate(a, 0, a.length-k-1);//4,3,2,1 5,6,7

        rotate(a, a.length-k, a.length-1); //4,3,2,1,,7,6,5

        rotate(a, 0, a.length-1);   //   5,6,7,1,2,3,4


        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }



        
    }
    
}
