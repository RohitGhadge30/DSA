import java.util.*;

public class Baprite {

    public static class Edge{
        int src;
        int dest;
        int weight;

        public Edge(int src,int dest,int weight)
        {
            this.src=src;
            this.dest=dest;
            this.weight=weight;
        }

    }

    public static boolean baprite( ArrayList<Edge> []graph)
    {
        int col[]=new int[graph.length];
        for(int i=0;i<col.length;i++)
        {
            col[i]=-1;
        }

        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<graph.length;i++)
        {
            if(col[i] == -1){  
            q.add(0);   //starting 
            col[i]=0;       //start element colur 

            while(!q.isEmpty())
            {
                int curr=q.remove();
                for(int j=0;j<graph[curr].size();j++){
                    Edge  e=graph[curr].get(j);
                if(col[e.dest] == -1)
                {
                    int nextcol = col[curr] == 0 ?1: 0;   //if colour of curr agar 0 hai tuo useke  next neighbour ko 1 kar do if 1 hai tuo 0 kardo
                     col[e.dest]=nextcol;
                     q.add(e.dest);
                }

                else if(col[e.dest] == col[curr])
                {
                    return false;
                }
            }

            }
          }
        }
        return true;
    }

     public static void creategraph( ArrayList<Edge> []graph) {
        
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }

        


        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));

       //graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,2,1));





    }


    public static void main(String[] args) {

        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        creategraph(graph);
        System.out.print(baprite(graph));
        
    }

    
}
