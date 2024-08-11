public class TrasposeMatrrix {


     public static void tras(int matrix[][])
     {
         for(int i=0;i<matrix.length;i++)
         {
            for(int j=0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
         }


     }

    public static void main(String[] args) {
        int col=3;int row=2;

        int matrix[][]={{1,2,3},{4,5,6}};

        tras(matrix);

        

        int traspose[][]=new int[col][row];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                traspose[j][i]=matrix[i][j];
            }
        }

        tras(traspose);


        
    }


    
}
