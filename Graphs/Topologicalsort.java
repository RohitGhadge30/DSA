import java.util.*;
public class Topologicalsort {

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

    public static void topologicalsort(ArrayList<Edge> graph[] )
    {
        boolean visited[]=new boolean[graph.length];
        Stack <Integer> s=new Stack<>();

        for(int i=0;i<graph.length;i++)
        {
            if(!visited[i])
            {
                dfsutil(graph, i, visited, s);
            }

        }
        while(!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }

    public static void dfsutil(ArrayList<Edge> graph[] ,int src,boolean visisted[],Stack <Integer> s)
    {
        visisted[src]=true;
        for(int i=0;i<graph[src].size();i++)
        {
            Edge e=graph[src].get(i);
            if(!visisted[e.dest])
            {
                dfsutil(graph, e.dest, visisted, s);
            }

        }
        s.push(src);

    }

    public static void creategraph( ArrayList<Edge> []graph) {
        
        for(int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
       
        graph[2].add(new Edge(2,3,1));


        graph[3].add(new Edge(3,1,1));

        graph[4].add(new Edge(4,0,1));
        graph[4].add(new Edge(4,1,1));

        graph[5].add(new Edge(5,0,1));
        graph[5].add(new Edge(5,2,1));

       

    
    }

    public static void main(String[] args) {

        int V=6;
        boolean Visited[]=new boolean[V];
        ArrayList<Edge> graph[]=new ArrayList[V];
        creategraph(graph);
        topologicalsort(graph);

        

    }
    
}
