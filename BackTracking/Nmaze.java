
public class Nmaze {



    public static void mazepath(int i,int j,int n,int matrix[][],boolean visited[][],String psf) {
        if(i<0 || j<0|| i>=n || j>=n)
        {
            return;
        } 
        if(matrix[i][j] ==0 || visited[i][j] == true)
        {
            return;
        }
        if(i == n-1 && j == n-1)
        {
            System.out.println("Reached "+psf);
            return;
        }

        

          visited[i][j] = true;
        mazepath(i-1,j,n,matrix,visited,psf+"u");//up  for row

        mazepath(i+1,j,n,matrix,visited,psf+"d");//down for row

        mazepath(i,j+1,n,matrix,visited,psf+"r");//right for col 

        mazepath(i,j-1,n,matrix,visited,psf+"l");//left for col 

        visited[i][j] =false; // backtracking phiche aate time unvisidet mark kar raha


        

        
    }

    public static void main(String[] args) {
        int matrix[][]={{1,1,1,0,1},{1,0,1,0,1},{1,1,1,1,1},{1,0,1,0,1},{1,1,1,0,1}};
        int n=matrix.length;
        boolean visited[][]=new boolean[n][n];

        mazepath(0,0,n,matrix,visited," ");

        
    }
}