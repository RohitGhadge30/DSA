import java.util.*;
public class Carsdist {

    public static  class Cars implements Comparable<Cars>{

        int x;
        int y;
        int dist;
        int idx;

        public Cars(int x,int y, int dist,int idx)
        {
            this.x=x;
            this.y=y;
            this.dist=dist;
            this.idx=idx;
        }

        @Override
        public int compareTo(Cars p2)
        {
            return this.dist-p2.dist; //based on dist remove kar raha
            
        }

    }

    public static void main(String[] args) {
        int pts[][]={{3,3},{5,-1},{2,4}};
        int k=2;

        PriorityQueue<Cars> pq=new PriorityQueue();
        for(int i=0;i<pts.length;i++)
        {
            int dist=pts[i][0]*pts[i][0]+pts[i][1]*pts[i][1];
            pq.add(new Cars(pts[i][0], pts[i][1], dist, i));
        }

        for(int i=0;i<k;i++)
        {
            System.out.println("Cars with min dist from origin are :   "+"C"+pq.remove().idx+" ");
        }
    }

    
}
