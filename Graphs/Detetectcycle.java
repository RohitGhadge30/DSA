import java.util.*;
public class Detetectcycle {

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

    public static boolean detectdycle(ArrayList<Edge> graph[])
    {

        boolean visited[]=new boolean[graph.length];
        for(int i=0;i<graph.length;i++)
        {
            if(!visited[i]){
            if(detectcycleutil(graph, visited, i, -1))
            {
                return true;
            }
        }
        }

        return false;

    }

      public static boolean detectcycleutil(ArrayList<Edge> graph[],boolean visited[],int src,int par)
      {
        visited[src]=true;

        for(int i=0;i<graph[src].size();i++)
        {
            Edge e=graph[src].get(i);

            //case3;
            if(!visited[e.dest] )
            {
                if(detectcycleutil(graph, visited,e.dest, src)){
                return true;
                }
            }
           // case1;
            else if(visited[e.dest] && e.dest != par)
            {
                return true;
            }

        }

        return false;

      }

    public static void creategraph(ArrayList<Edge> graph[])
    {
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }

        graph[0].add(new Edge(0,1,3));
        graph[0].add(new Edge(0,2,3));
        graph[0].add(new Edge(0,3,3));
        

        graph[1].add(new Edge(1,0,3));
        graph[1].add(new Edge(1,2,3));

    graph[2].add(new Edge(2,0,3));
        graph[2].add(new Edge(2,1,3));
        

        graph[3].add(new Edge(3,0,3));
        graph[3].add(new Edge(3,4,3));

        graph[4].add(new Edge(4,3,3));
    }

    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge> graph[]=new ArrayList[V];
        creategraph(graph);

        System.out.print(detectdycle(graph));
    }
    
}
