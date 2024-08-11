public class Searchinsortedmatrix {


    public static boolean sat(int matrix[][],int key)
    {
        int row =0;
        int col=matrix[0].length-1;              //for finding down to up row=mat.length,col=0


        while(row <matrix.length && col >= 0)
        {
             if(matrix[row][col]== key)
             {
                System.out.print("("+row+","+col+")");
                return true;
             }
             else if(key <matrix[row][col])
             {
             col--;
             }
             else                           //row--,col++;
             {
                row++;
             }

            
        }
        return false;
    }




    public static void mat(int matrix[][],int key){//bruteforce approach
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j] == key)
                {
                    System.out.print("("+i+","+j+")");
                }
            }
        }
        

    }

    public static void main(String[] args) {

        int matrix[][]= {{4,7,8},{8,8,7} };

                     int key =3;

                   System.out.print( sat(matrix,key));

                     
        
    }
    
}
