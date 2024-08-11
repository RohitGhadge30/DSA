public class Gridways {

    public static int subset(int i,int j,int m, int n) {

        // int n =matrix.length;
        // int m=matrix[0].length;



        if(i == n-1 && j ==  m-1)
        {
            return 1;
        }
        if(i >= n || j>= m)
        {
            return 0;
        }

        int w1=subset(i+1,j,m,n);

        int w2=subset(i,j+1,m,n);

        return w1+w2;








        




    }



    public static void main(String[] args) {


    //    int matrix[][]=new int [3][7];
        
       System.out.print(subset(0, 0,3,2));
        



    
}
}